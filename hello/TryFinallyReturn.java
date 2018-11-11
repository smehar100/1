package hello;

public class TryFinallyReturn extends Thread implements Runnable {

	public static void main(String[] args) {

 int d= callMethod();
System.out.println(d);
	}

	public static int callMethod(){
		
		int i=89;
		try{
			//int a=10/0;
			System.gc();
			if(i==2);
			return i;
			
			

		}
		catch(Exception e){
			return 7;
		}
		finally{
			i=0;
			//return 6;
		}
	}
	@Override
	public void run(){
		
	}
	void ab(int a) {
		// TODO Auto-generated method stub
		
	}

	
		
	
	

}
