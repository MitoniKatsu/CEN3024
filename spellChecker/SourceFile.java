package spellChecker;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Christian Lundblad
 *
 */
public class SourceFile
{
	private static Scanner input;
	private String sourcePath = "";
	private ArrayList<String> sourceList;
	private String sourceTxt = "";
	
	public SourceFile(String filePath)
	{
		sourcePath = filePath;
		
		buildArray();
	}
				

	
	private void buildArray()
	{
		try
		{
			//read the user input String and convert file to String
			input = new Scanner(Paths.get(sourcePath));			
			sourceTxt = input.useDelimiter("\\A").next();
			//System.out.println(sourceTxt); 
			//close scanner
			input.close();			
		}
		catch(IOException e)
		{
			System.out.println("Error opening source file. Please check file path and restart program.");
			System.exit(0);
		}
		//remove punctuation from string and make all lower case for better comparison
		sourceTxt = sourceTxt.replaceAll("[^a-zA-Z\\d \n]", "").toLowerCase();
		
		//read string to break into words
		Scanner reader = new Scanner(sourceTxt);
		sourceList = new ArrayList<>();
		
		//populate arrayList
		while(reader.hasNext())
		{
			for(String word : reader.next().split(" "))
			{
				sourceList.add(word);
			}
		}
		//close scanner
		reader.close();
	}
	
	public ArrayList<String> getList()
	{
		return sourceList;
	}
}
