package acmatics;

import java.util.Arrays;

public class Question3 {
	
	public static void main(String[] args)
	{
		int[] inArray = {8, 6, 6, 20, 9, 1, 12, 16, 3, 16, 22, 2};
		printPercentile(inArray);
	}
	
	private static void printPercentile(int[] inArray)
	{
		Arrays.sort(inArray);
		int totalNumbers = inArray.length;
		int index25 = (int)Math.ceil((float)totalNumbers*25f/100f);
		int index50 = (int)Math.ceil((float)totalNumbers*50f/100f);
		int index75 = (int)Math.ceil((float)totalNumbers*75f/100f);
		int index90 = (int)Math.ceil((float)totalNumbers*90f/100f);
		int index95 = (int)Math.ceil((float)totalNumbers*(95f/100f));
		int index99 = (int)Math.ceil((float)totalNumbers*(99f/100f));
		
		System.out.println("25% of the numbers are less than or equal to " + inArray[index25-1]);
		System.out.println("50% of the numbers are less than or equal to " + inArray[index50-1]);
		System.out.println("75% of the numbers are less than or equal to " + inArray[index75-1]);
		System.out.println("90% of the numbers are less than or equal to " + inArray[index90-1]);
		System.out.println("95% of the numbers are less than or equal to " + inArray[index95-1]);
		System.out.println("99% of the numbers are less than or equal to " + inArray[index99-1]);
		System.out.println("100% of the numbers are less than or equal to " + inArray[totalNumbers-1]);
	}
}
