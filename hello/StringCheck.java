package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringCheck {

	public static void main(String[] args) {


		String a="2";
		String b="2";
		if(a.equals(b)){
			System.out.println("abc");
		}
		if(a==b){
			System.out.println("xyz");
		}
		b="4";
		System.out.println(a);
		
		List<String> strList= new ArrayList<String>();
		strList.add("q");
		strList.add("bg");
		strList.add("qss");
		strList.add("iuq");
		strList.add("cq");
		
		Collections.sort(strList);
		
		System.out.println(strList);
		
		String[] strArray =new String[5];
		strArray[0]="e";
		strArray[1]="w";
		strArray[2]="u";
		strArray[3]="i";
		strArray[4]="y";
		
		System.out.println(Arrays.asList(strArray));
		
	}

}
