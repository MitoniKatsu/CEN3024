package spellChecker;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Christian Lundblad
 *
 */
public class SpellChecker
{
	public static void main(String[] args)
	{
		//file paths
		String sourcePath = "";
		String dictPath = "";
		//scanner for user input
		Scanner userInput = new Scanner(System.in);
		//String to hold user input
		String inputString = "";
		//input logic qualifiers
		boolean sourceEntered = false;
		boolean dictionaryEntered = false;
		//file objects
		SourceFile sourceFile;
		Dictionary dictionary;
		
		do
		{
			//get source file path from user
			System.out.println("");
			System.out.println("Please enter a source file path (example - C:\\source.txt): ");
			System.out.println("To exit, enter 'n'.");
			inputString = userInput.nextLine();
			
			switch(inputString)
			{
				case "n":
				{
					userInput.close();
					System.exit(0);
				}
					break;
				case "":
					break;
				default:
				{
					sourcePath = inputString.trim();
					sourceEntered = true;
					inputString = "";
				}
					break;
			}
		}
		while(!sourceEntered);
		
		//instantiate sourceFile
		sourceFile = new SourceFile(sourcePath);
		
		do
		{
			//get dictionary file path from user
			System.out.println("Please enter a dictionary file path (example - C:\\dictionary.txt): ");
			System.out.println("To exit, enter 'n'.");
			inputString = userInput.nextLine();
			
			switch(inputString)
			{
				case "n":
				{
					userInput.close();
					System.exit(0);
				}
					break;
				case "":
					break;
				default:
				{
					dictPath  = inputString.trim();
					dictionaryEntered = true;
					inputString = "";
				}
					break;
			}		
		}
		while(!dictionaryEntered);
		
		//instantiate dictionary		
		dictionary = new Dictionary(dictPath);
		
		//get both arrays from objects
		ArrayList<String> sourceList = sourceFile.getList();
		ArrayList<String> dictionaryList = dictionary.getList();
		
		//test
		compareToDictionary(sourceList, dictionaryList);
	}

	
	private static void compareToDictionary(ArrayList<String> source, ArrayList<String> dictionary)
	{
		for(int i = 0; i < source.size(); i++)
		{
			boolean found = false;
			
			for(int j = 0; j < dictionary.size(); j++)
			{
				if(source.get(i).equals(dictionary.get(j)))
				{
					found = true;
				}
			}
			
			if(!found)
			{
				System.out.println(String.format("** The word \"%s\" is an unknown word in the specified dictionary.**", source.get(i)));
			}
		}
	}
	
//	private static void trace(String text)
//	{
//		System.out.println("**" + text + "**");
//	}
	
}
