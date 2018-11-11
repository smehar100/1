package hello;

public class UserInput {

	public String str;

	public  class TextInput {
		
		public  void add(char c) {
			str = str + c;

		}
		public  String getValue() {
			
			return str;
			
		}
	}

	public  class NumericInput extends TextInput {
		
		 String rStr="";
		 @Override
		public void add(char c) {
			if(Character.isDigit(c)){
				rStr=rStr+c;
			}
			
		}
		 @Override
		 public  String getValue() {
				
				return rStr;
		 }
	}

	public static void main(String[] args) {
		TextInput input = new UserInput().new NumericInput();
		 input.add('1');
		 input.add('a');
		 input.add('n');
		 input.add('0');
		 System.out.println(input.getValue());
	}
}
