package hello;


import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class Folders {
    public static Collection<String> folderNames(String xml, char startingLetter)  {
    	
    	 List<String> lStr= new ArrayList<String>();
    	try {
    		
    			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
    			InputSource src = new InputSource();
        		src.setCharacterStream(new StringReader(xml));
    			Document doc = dBuilder.parse(src);

    			doc.getDocumentElement().normalize();
    			

    			NodeList nList = doc.getElementsByTagName("folder");
    			for (int temp = 0; temp < nList.getLength(); temp++) {

    				Node nNode = nList.item(temp);


    				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

    					Element eElement = (Element) nNode;
    					
    					if(eElement.getAttribute("name").charAt(0)==(startingLetter))
    					lStr.add(eElement.getAttribute("name"));
    					

    				}
    			}
    			
    			
    	 }catch(Exception e){
    		 
    	 }
    	 return lStr;

    			
    }
    
    public static void main(String[] args) throws Exception {
        String xml =
        		"<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                        "<folder name=\"c\">" +
                            "<folder name=\"program files\">" +
                                "<folder name=\"uninstall information\" />" +
                            "</folder>" +
                            "<folder name=\"users\" />" +
                        "</folder>";

        Collection<String> names = folderNames(xml, 'p');
        for(String name: names)
            System.out.println(name);
    }
}