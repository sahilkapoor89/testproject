
public class Question2 {
	
	public static String convertToHtmlHexValues(int red, int green, int blue){
		String hexRed = Integer.toHexString(red);
		String hexGreen = Integer.toHexString(green);
		String hexBlue = Integer.toHexString(blue);
		String htmlHexValue = "#" + hexRed + hexGreen + hexBlue;
		return htmlHexValue;
	  
		
	}
	
public static void main(String[] args) {
	String htmlHexValue = convertToHtmlHexValues(68,58,197);
	System.out.println(htmlHexValue);
}
}
