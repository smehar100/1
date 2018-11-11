package hello;
class ContainsEnum{
public enum Season {
	WINTER,SUMMER,SPRING,RAINY;
	
	public int value;  
	private Season(int value){  
	this.value=value;  
	
	}
	Season(){
		
	}
	
}


public static void main(String[] args) {
	System.out.println(Season.RAINY.value);
	
}

}