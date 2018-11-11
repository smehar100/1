package hello;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	 public static void readFileMethod()
	  {
	  // We need to provide file path as the parameter:
	  // double backquote is to avoid compiler interpret words
	  // like \test as \t (ie. as a escape sequence)
		 try {
			FileReader file = new FileReader("C:\\Users\\pankaj\\Desktop\\test.txt");
 
  BufferedReader br = new BufferedReader(file);
 
  String st;
  
  while ((st = br.readLine()) != null)
			System.out.println(st);
  
  int a=10/0;
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
}
