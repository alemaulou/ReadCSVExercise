import java.io.*;
import java.util.*;	

/*
 * This code snippet reads the first 50 lines of the file 7_04_18.csv and echoes 
 * them to the console window.
 * 
 * The filename "7_04_18.csv" below is called a 'relative path name'.  You will 
 * need to make the file available to your program by importing it into your 
 * eclipse project or using some other method...
 * 
 * An 'absolute path name' will have the full path to the file, something like 
 * "C:/users/cd/data/7_04_18.csv".  This technique will work, but then I would 
 * need to modify every student's source code to run their programs.
 * 
 * Please use ONLY relative path names for this programming project!
 * 
 * You may want to just duplicate the try-catch block and 'throws Exception' 
 * as I have coded it below.  We will cover this material on Exception Handling
 * later on, when we get to chapter 8.   
 */

public class ReadPartialCSV {
	 	
    private static String infile = "C:\\Users\\alema\\Code\\ReadCSVExercise\\src\\7_04_19.csv";
			
    public static void main(String[] args) throws Exception{

	  try {
		Scanner sc = new Scanner(new File(infile));
		String lineSeparator = System.getProperty("line.separator");
		sc.useDelimiter(lineSeparator);
		
		HashMap<String, String> hmap = new HashMap<>();
		sc.nextLine();
		sc.nextLine();
		while(sc.hasNext()) {
			String data = sc.next();
			String[] values = data.split(",", -1);
			hmap.put(values[0], values[2]);
			}
		
		for (Object value : hmap.values()) {
			Collection<String> temp = hmap.values();
			if(hmap.values().temp) {
				temp = hmap.values();
			}
		}
		
		hmap.forEach((key, value) -> 
		
			
	
		     		
		 sc.close();
	   } catch (IOException e) {            
			e.printStackTrace();
	   }
     }
}

