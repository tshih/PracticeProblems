package chapter1;

public class P3URLify {
	
	public String URLify(String URL, int length) {
		
		char[] cURL = URL.toCharArray();
		
		int numSpaces = 0;
		for (char c: cURL) {
			if (c == ' ') {
				numSpaces++;
			}
		}
		
		int len = cURL.length - 1;

		for (int i = length -1; i >=0; i--)
		{
			if(cURL[i] == ' ')
			{
				cURL[len-2] = '%';
				cURL[len-1] = '2';
				cURL[len] = '0';
				len-=3;
			}
			else
			{
				cURL[len] = cURL[i];
				len--;
			}
		}

		return new String(cURL);
	}
	
	public static void main(String[] args) {
		char[] c = new char[5];

	}
	
}
