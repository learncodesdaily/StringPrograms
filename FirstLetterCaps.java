package strings;

public class FirstLetterCaps {

	public static void main(String[] args) {
		
		String str = "I am shreehari";
		
		char str1[] = str.toCharArray();
		
		for(int i = 0;i<str1.length;i++) {
			if(str1[i] != ' ' || str1[i - 1] == ' ') {
				if(str1[i] >='a' && str1[i] <= 'z') {
					str1[i] = (char)(str1[i] - 'a' + 'A');
				}
			}
		}
		String str2 = new String(str1);
		System.out.println(str2);
	}

}
