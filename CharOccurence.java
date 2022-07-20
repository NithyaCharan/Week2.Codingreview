package week2.codingreview;

public class CharOccurence {

	public static void main(String[] args) {

		String str = "Welcome to Chennai";
		
		char[] strCharArr = str.toCharArray();
		
		int count =0;
		
		for (int i = 0; i < strCharArr.length; i++) {
			
			if (strCharArr[i]=='e') {
				
				count++;
				
			}
		}
		
		System.out.println(count);

	}

}
