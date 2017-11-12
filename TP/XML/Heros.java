package properties;

import java.util.Properties;
import java.util.Scanner;

public class Heros
{
	private static Scanner scanner;

	static
	{
		scanner = new Scanner(System.in);
		scanner.useDelimiter("\n");
	}


	public static void main(String args[])
	{
		// Create the object used to store hero's properties
		Properties  heroProperties = new Properties();


		//TODO : Load property file  (question 6)
		/*try
	  {
	  // TO BE COMPLETED
	  }
	  catch(IOException exception)
	  {
	  System.out.println("The hero's property file can not be read!");
	  }*/


		// TODO : display here starting hero's properties (question 2)



		//Sets the new hero's properties
		System.out.print("New name : ");
		heroProperties.setProperty("nom", readString());
		System.out.print("New nickname : ");
		heroProperties.setProperty("surnom", readString());
		System.out.print("New strength : ");
		heroProperties.setProperty("force", readString());
		System.out.println();


		//Display new hero's properties
		showProperties(heroProperties);


		//TODO : Save properties (question 4)
		/*try
	  {
	  // TO BE COMPLETED
	  }
        catch(IOException exception)
        {
	System.out.println(""The hero's property file can not be created!!");
        }*/


	}

	/**
	 * display hero's property
	 * @param p the hero's property
	 */
	public static void showProperties(Properties p)
	{
		System.out.println("Hero's characteristics");
		System.out.println("-------------------------");

		System.out.println("Name    : " + p.getProperty("nom"));
		System.out.println("Nickname : " + p.getProperty("surnom"));
		System.out.println("Strength  : " + p.getProperty("force"));
		System.out.println();

	}

	/**
	 * Read a string from keyboard
	 * @return the read string
	 */
	public static String readString()
	{
		return scanner.next();
	}

}
