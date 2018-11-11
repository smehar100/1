package hello;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class LogParser {
	public static Collection<Integer> getIdsByMessage(String xml, String message) throws Exception {

		List<Integer> lStr= new ArrayList<Integer>();
		try {

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			InputSource src = new InputSource();
			src.setCharacterStream(new StringReader(xml));
			Document doc = dBuilder.parse(src);

			doc.getDocumentElement().normalize();


			NodeList nList = doc.getElementsByTagName("entry");
			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(temp);


				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;


					if(eElement.getElementsByTagName("message").item(0).getTextContent().equalsIgnoreCase(message)){
						lStr.add(Integer.valueOf(eElement.getAttribute("id")));
					}	


				}

			}


		}catch(Exception e){

		}
		return lStr;


	}

	public static void main(String[] args) throws Exception {
		String xml = 
				"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
						"<log>\n" + 
						"    <entry id=\"1\">\n" + 
						"        <message>Application started</message>\n" + 
						"    </entry>\n" + 
						"    <entry id=\"2\">\n" + 
						"        <message>Application ended</message>\n" + 
						"    </entry>\n" + 
						"</log>";

		Collection<Integer> ids = getIdsByMessage(xml, "Application started");
		for(int id: ids)
			System.out.println(id); 
	}
}

