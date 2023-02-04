package StringPrograms;

public class PrintVowelsORConsonant {

	public static void main(String[] args) {
		String s1 = "india";
		char[] s = s1.toCharArray();
		for (int i = 0; i<s.length; i++)
		{
		if (s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u')
		   {
			   System.out.println(s[i]+" = it is vowel");
		   }
		else if(s[i]!='a'||s[i]!='e'||s[i]!='i'||s[i]!='o'||s[i]!='u')
		{
			System.out.println(s[i]+" = it is consonant");
		}
		}
	}
}
