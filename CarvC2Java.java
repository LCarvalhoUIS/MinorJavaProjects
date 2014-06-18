//By Lucas Carvalho
/*
 * A library made to help bring useful CPP methods to Java.
 */
public class CarvC2Java {

	/*
	 * The equivalent of the IOmanip setw, it starts with a blank string and
	 * adds spaces to it. Useful for formatting.
	 */
	public static String setw(int width)
	{
		String spaces = "";
		for(int counter = 0; counter < width; counter++)
		{
			spaces += " ";
		}
		return spaces;
	}
	

}
