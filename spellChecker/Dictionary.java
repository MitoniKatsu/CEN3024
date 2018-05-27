package spellChecker;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Christian Lundblad
 *
 */
public class Dictionary
{
	private static Scanner input;
	private String dictionaryPath = "";
	private ArrayList<String> dictionaryList;
	private String dictionaryTxt = "";
	
	public Dictionary(String filePath)
	{
		dictionaryPath = filePath;
		
		buildArray();		
	}
	
	private void buildArray()
	{
		try
		{
			//read the user input String and convert file to String
			input = new Scanner(Paths.get(dictionaryPath));			
			dictionaryTxt = input. useDelimiter("\\A").next();
			//close scanner
			input.close();			
		}
		catch(IOException e)
		{
			System.out.println("Error opening dictionary file. Please check file path and restart program.");
			System.exit(0);
		}
		//remove punctuation from string and make all lower case for better comparison
		dictionaryTxt = dictionaryTxt.replaceAll("[^a-zA-Z \n]", "").toLowerCase();
		
		//read string to break into words
		Scanner reader = new Scanner(dictionaryTxt);
		dictionaryList = new ArrayList<>();
		
		//populate arrayList
		while(reader.hasNext())
		{
			for(String word : reader.next().split(" "))
			{
				dictionaryList.add(word);
			}
		}
		//close scanner
		reader.close();
	}
	
	public ArrayList<String> getList()
	{
		return dictionaryList;
	}
}
