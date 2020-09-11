/*
 * Author: Jonathan Yang
 * Assignment 1 - WiFi Diagnosis
 * Description: This program will diagnose the problem with the Wireless Internet.
 */


import java.util.Scanner;

public class WiFiDiagnosis
{
	public static void main(String[] args)
	{
		System.out.println("Hello, welcome to Wi-fi diagnosis. This program will take you step by step to fix your wi-fi.");
		askQuestion();
		System.out.println("\nAuthor: Jonathan Yang");
	}//end main
	
	/*
	 * askQuestion() method ask the questions. It will continue to ask questions until any of the enterYesOrNo returns true, then this method ends immediately. 
	 * If it reaches the fourth question, the method ends regardless
	 */
	private static void askQuestion()
	{
		if(findAnswer("First Step: Reboot the computer."))
		{
			System.out.println("Rebooting your computer seems to work.");
			return;
		}
		if(findAnswer("Second Step: Reboot the router"))
		{
			System.out.println("Rebooting your router seems to work.");
			return;
		}
		if(findAnswer("Third Step: Make sure the cables to your router are plugged in firmly and your router is getting power."))
		{
			System.out.println("Checking your cables seems to work.");
			return;
		}
		if(findAnswer("Fourth Step: Move your computer closer to your router."))
		{	
			System.out.println("Moving your computer seem to work");
			return;
		}
		else
			System.out.println("\nSolution: Contact Your ISP.\nMake sure your ISP is hooked up to your router.");
	}//end askQuestion
	
	/*
	 * findAnswer() method loops until the user enters either yes or no. Any other answer is not accepted.
	 */
	private static boolean findAnswer(String question)
	{
		//field
		final boolean INFINITE_LOOP = true;//Infinitely loops the while loop
		@SuppressWarnings("resource")
		Scanner in  = new Scanner(System.in);
		
		while(INFINITE_LOOP)
		{
			System.out.println("\n" + question);//Ask the question
			System.out.print("Are you able to connect to the Internet?(Yes or no): ");
			String answer = in.nextLine();//User must input yes or no
			
			//this if statement checks if answer is either yes or no.
			if(answer.equalsIgnoreCase("Yes"))
			{
				System.out.print("\nSolution: ");
				return true;
			}
			else if(answer.equalsIgnoreCase("No"))
				return false;
			else
				System.out.printf("\nERROR: %s is invalid response. Response accepted: \"Yes\" or \"No\"\n", answer);
		}
	}//end enterYesOrNo
}//end program