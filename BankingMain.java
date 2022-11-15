package com.bankingapp.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bankingapp.exeception.InvalidChoice;

public class BankingMain {
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) throws InvalidChoice  {
		
		BankingMain app=new BankingMain();
		app.welcome();
     	int menuChoice=app.getChoice();
     	app.performOperation();
			
		
	}
	private void welcome() {
		System.out.println("Welcome to banking world");
		
		System.out.println("*******************************");
		
		System.out.println("Select your choice from the optionds provided below");
	}
	

	private int getChoice() throws InvalidChoice {
		boolean flagtoContinue=true;
		int choice=0;
		while(flagtoContinue==true) {
			
			try
		{
			System.out.println("1.Open an Account");
			System.out.println("2.Close an Account");
			System.out.println("3.Deposit to a Account");
			System.out.println("4.Withdraw from Account");
			System.out.println("5.Other Choices are invalid");
			
		
			choice=sc.nextInt();
			//after taking choice terminate the method by 
			flagtoContinue=false;
			//if choice is not selected in range
		if(choice<1||choice>5) {
			throw new InvalidChoice("Invalid Choice");	
		}
		}
		catch(InputMismatchException ime) {
			flagtoContinue=true;
			sc.next();
			System.out.println("Cause"+ime.getMessage());
		}
		}
			
				return choice;
	}
	
	private void performOperation() {
	        
		   int option=0;
		   boolean validChoice=true;
		   while(validChoice==true) {
			   try {
				option=getChoice();
				
				switch(option) {
				case 1:
					System.out.println("Opening An Account");
				        break;
				case 2:
					System.out.println("Closing an Acount");
					break;
				case 3:
					System.out.println("Depositing in account");
					break;
				case 4:
					System.out.println("Withdrawing from Acount");
					break;
				}
				
			} catch (InvalidChoice e) {
				e.printStackTrace();
			}
		   }
		
		
	}
	
}
