package hello;

public class While {

	public static void main(String[] args) {
		
		int count =1;
		while(count<10){
			count++;
			try{
				int a= 10/0;
			
			}
			
			catch(Exception e){
				System.out.println("exception handled");
			}
		}
	}

}
