package com.bridgelabz.LargestAmongThreeNumbers;

import org.apache.logging.log4j.Logger;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger Log = LogManager.getLogger(App.class);
	//three instance variables to do comparision
	private double FirstNumber;
	private double SecondNumber;
	private double ThirdNumber;
	public static void main( String[] args )
	{

		// this section of the code will generate log file and print log message on console
		String message="Welcome ";
		Log.debug(message + " will be printed on Debug");
		Log.info(message + " Will be printed on info");
		Log.warn(message + " will be printed on warn");
		Log.error(message + " will be printed on error");
		Log.fatal(message + " will be printed on fatal");
		Log.info("Appending String: {}.", message);
		System.out.println(message);

		App a = new App();
		a.setFirstNumber();
		a.setSecondNumber();
		a.setThirdNumber();
		a.display();
		a.compare();
	}
	//constructor
	App(){
		System.out.println("object has been created");
	}
	//method to set the value for first number
	public void setFirstNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for first number");
		this.FirstNumber = sc.nextDouble();
	}
	//method to get the value of first number
	public double getFirstNumber() {
		return this.FirstNumber;
	}
	//method to set the value for second number
	public void setSecondNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of second number");
		this.SecondNumber = sc.nextDouble();
	}
	//method to get the value of second number
	public double getSecondNumber() {
		return this.SecondNumber;
	}
	//method to set the value of third number
	public void setThirdNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of third value");
		this.ThirdNumber = sc.nextDouble();
	}
	//method to get the value of third number
	public double getThirdNumber() {
		return this.ThirdNumber;
	}
	//method to display the values
	public void display() {
		System.out.println("value of First Number is : "+ this.FirstNumber);
		System.out.println("value of Second Number is : "+ this.SecondNumber);
		System.out.println("value of Third Number is : "+ this.ThirdNumber);
	}
	//method to compare the values
	public void compare() {
		double largest;
		if(this.FirstNumber > this.SecondNumber && this.FirstNumber > this.ThirdNumber)
			largest = this.FirstNumber;
		else if(this.SecondNumber > this.FirstNumber && this.SecondNumber > this.ThirdNumber)
			largest = this.SecondNumber;
		else
			largest=this.ThirdNumber;
		System.out.println("largest number among these three number is : "+ largest);

	}
}
