package hello;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Needle {
    public static int count(String needle, InputStream haystack) throws Exception {
        
    		int counter=0;
    		BufferedReader br = null;
    		String line;

			br = new BufferedReader(new InputStreamReader(haystack));
			while ((line = br.readLine()) != null) {
				if(line.contains(needle)){
					counter++;
				}
			}
    	return counter;
    	
    }
    
    public static void main(String[] args) throws Exception {
        String inMessage = "Hello, there!\nHow are you today?\nYes, you over there.";

        try(InputStream inStream = new ByteArrayInputStream(inMessage.getBytes())) {
            System.out.println(Needle.count("How", inStream));
        }
    }
}