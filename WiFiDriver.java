/*
 * Author: Jonathan Yang
 * This Program diagnose the problem with the wi-fi
 */

import java.util.Scanner;

public class WiFiDriver {
	public static void main(String[] args)
	{
		//fields
		Scanner in = new Scanner(System.in);//Scanner Class
		String answer;//user input
		int errorValue = 1;//sentinel value to keep the program in a loop when there is an error.
		
		
		System.out.println("Hello, welcome to Wi-fi diagnosis. This program will take you step by step to fix your wi-fi.");
		System.out.println("\nFirst step: Reboot the computer.");
		while(errorValue == 1)//The loops in the program is so that the user don't have to start from the very beginning when they enter a invalid value. 
		{
			errorValue = 0;
			System.out.print("Are you able to connect to the internet?(Enter Yes or no): ");
			answer = in.nextLine();
			if(answer.toLowerCase().equals("yes"))
				System.out.println("\nRebooting your computer seems to work.");
			else if(answer.toLowerCase().equals("no"))
			{
				errorValue = 1;
				System.out.println("\nSecond Step: Reboot the router");
				while(errorValue == 1)
				{
					errorValue = 0;
					System.out.print("Are you able to connect to the internet?(Enter Yes or no?): ");
					answer = in.nextLine();
					if(answer.toLowerCase().equals("yes"))
						System.out.println("\nRebooting your router seems to work.");
					else if(answer.toLowerCase().equals("no"))
					{
						errorValue = 1;
						System.out.println("\nThird Step: Make sure the cables to your router are plugged in firmly and your router is getting power.");
						while(errorValue == 1)
						{
							errorValue = 0;
							System.out.print("Are you able to connect to the internet?(Enter Yes or no?): ");
							answer = in.nextLine();
							if(answer.toLowerCase().equals("yes"))
								System.out.println("\nChecking your cables seems to work.");
							else if(answer.toLowerCase().equals("no"))
							{
								errorValue = 1;
								System.out.println("\nFourth Step: Move your computer closer to your router.");
								while(errorValue == 1)
								{
									errorValue = 0;
									System.out.print("Are you able to connect to the internet?(Enter Yes or no?): ");
									answer = in.nextLine();
									if(answer.toLowerCase().equals("yes"))
										System.out.println("\nMoving your computer seem to work");
									else if(answer.toLowerCase().equals("no"))
									{
										System.out.println("\nContact Your ISP.\nMake sure your ISP is hooked up to your router.");
									}
									else
									{
										System.out.println("\nERROR: User entered a value not Yes or No. Enter Yes or No to continue.\n");
										errorValue = 1;
									}
								}
							}
							else
							{
								System.out.println("\nERROR: User entered a value not Yes or No. Enter Yes or No to continue.\n");
								errorValue = 1;		
							}
						}
					}
					else
					{
						System.out.println("\nERROR: User entered a value not Yes or No. Enter Yes or No to continue.\n");
						errorValue = 1;
					}
				}
			}
			else
			{
				System.out.println("\nERROR: User entered a value not Yes or No. Enter Yes or No to continue.\n");
				errorValue = 1;
			}
		}
		
		System.out.println("\n\nAuthor: Jonathan Yang");
		in.close();
	}
}//end program
