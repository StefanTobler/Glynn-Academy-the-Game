
	import java.io.*;
	import static java.lang.System.*;
	import java.util.Random;
	import java.util.Scanner;
	import java.lang.Math;

	class game{


	     public static void main (String str[]) throws IOException {
	        Scanner scan = new Scanner(System.in);
	         Random rand = new Random();
	         
	         //Pin Number
	         int pinNumber = (int)(Math.random()*100000);
	         
	         //Classes
	         String[] maths = { "Calculus", "Algebra 1", "Geometry", "Statistics" };
	         String[] sciences = { "Physics", "Chemistry", "Biology", "Zoology"};
	         String[] socials = { "US Government", "US History", "World History", "Economics"};
	         String[] lunches = { "A 11:40 to 12:10", "B 12:30 to 1:00", "C 1:20 to 1:50"};
	         
	         //Name
	         String name;
	         
	         //Intro
	         
	         System.out.println("*------------------------------------*");
	         System.out.println("  Welcome to Glynn Academy the Game");
	         System.out.println("*------------------------------------*\n");
	         
	         //Confirm name variable
	         int confirmName = 1;
	         
	         NAMING:
	         while (confirmName == 1){
	         System.out.println("\tWhat is your name?");
	         name = scan.nextLine();
	         	INVALID:
	         		while (confirmName == 1){
	         			System.out.println("\tIs " + name + " your name?\n\t1. Yes\n\t2. No");
	         			String input = scan.nextLine();
	         			if (input.equals("1")){
	         				System.out.println("\tHi " + name + ". " + "You are now a student at Glynn Academy. Your Student ID Number is " + pinNumber + " Remember it or else.");
	         				confirmName++;
	         			}
	         			else if (input.equals("2")){
	         				continue NAMING;
	         			}
	         			else {
	         				System.out.println("\tPlease enter a valid number.\n");
	         				continue INVALID;
	         			}
	         		}
	         }
	         System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	         //Day 1
	         String math = maths[rand.nextInt(maths.length)];
	         String science = sciences[rand.nextInt(sciences.length)];
	         String social = socials[rand.nextInt(socials.length)];
	         String lunch = lunches[rand.nextInt(lunches.length)];
	         System.out.println("\n\tWelcome to your first day of school! Here is your schedule: \n\t>" + math + "\n\t>" + science + "\n\t>" + social + "\n\t>Lunch: " + lunch);
	         System.out.println("\n\tAre you happy with this schedule?\n\t1. Yes\n\t2. No");
	         String noMatter = scan.nextLine();
	         System.out.println("Well it doesn't matter. You get what you get. GO TO CLASS!");
	         System.out.println("\n\t The anouncements are on what are you going to do? \n\t1. Stand and pledge.\n\t2. Sit in your desk and put your head down.\n\t3. Take a knee then run out of class.");
	         
	         
	     }
	}
