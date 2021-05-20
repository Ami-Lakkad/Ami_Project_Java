/*
 Programming Test - 10 : 19th May'2021 (12 mins) 

Print the first non-repeated character of String.
Input : abcgbca
output : g
*/
package examcode.test_10;

public class ReturnNonRePtCh {
	
	
	char RtnNonRepeatCh(String str) {
		str = str.toLowerCase();
		char ch=' ';
		char[] input = str.toCharArray(); 
		for(int index = 0 ; index < input.length ; index++) {
			ch = str.charAt(index);
				if (str.indexOf(ch) == str.lastIndexOf(ch)) {
					ch = str.charAt(index);
					break;
				}
			}
			System.out.println(ch);
		return ch;
	}

	public static void main(String[] args) {
		ReturnNonRePtCh r1=new ReturnNonRePtCh();
		String str = "abcgbca";
		r1.RtnNonRepeatCh(str);
		
	}
}
