package StringPrograms;

public class PrintVowelsORConsonantEx1 {
	public static void vowel_or_consonant(char y)
	{
		if(y=='a'||y=='e'||y=='i'||y=='o'||y=='u'||
		   y=='A'||y=='E'||y=='I'||y=='O'||y=='U')
			System.out.println("it is vowel");
		else
			
			System.out.println("it is consonant");
		
	}
	public static void main(String[] args)
	{
		vowel_or_consonant('w');

	}

}
