package chapter1;

public class P6StringCompression {

	public String compress(String input) {
		StringBuilder string = new StringBuilder();
		
		int counter = 0;
		
		for(int i = 0; i < input.length() - 1; i++)
		{
			counter++;
			
			if(i + 1 > input.length() && input.charAt(i) != input.charAt(i+1)) {
				string.append(input.charAt(i));
				string.append(counter);
				counter = 0;
			}
		}
		
		return string.toString();
	}
	
	public static void main(String[] args) {
		
	}

}
