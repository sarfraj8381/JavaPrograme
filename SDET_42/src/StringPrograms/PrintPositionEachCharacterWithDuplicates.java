package StringPrograms;

public class PrintPositionEachCharacterWithDuplicates {

	public static void main(String[] args) {
		String s="tester";
		for (int i = 0; i < s.length(); i++) 
		{
			System.out.println(s.charAt(i)+" is in "+(i+1)+" position");
		}

	}

}
