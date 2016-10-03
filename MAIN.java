
 import java.io.*;
 import static java.lang.System.*;

import java.awt.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

 class game{


      public static void main (String str[]) throws IOException {
         Scanner scan = new Scanner(System.in);
          Random rand = new Random();
          String input = "null";
          boolean running = true;
          int iss = 0;
          double grade = 100;
          //Pin Number
          int pinNumber = (int)(Math.random()*100000);
          
          //Classes
          String[] maths = { "Calculus", "Algebra 1", "Geometry", "Statistics" };
          String[] sciences = { "Physics", "Chemistry", "Biology", "Zoology"};
          String[] socials = { "US Government", "US History", "World History", "Economics"};
          String[] lunches = { "A 11:40 to 12:10", "B 12:30 to 1:00", "C 1:20 to 1:50"};
          
          //Name
          String name = "null";
          
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
             input = scan.nextLine();
             if (input.equals("1")){
              System.out.println("\tHi " + name + ". " + "You are now a student at Glynn Academy. Your Student ID Number is " + pinNumber + " Remember it or else.");
              confirmName++;
             }
             else if (input.equals("2")){
              continue NAMING;
             }
             else {
              System.out.println("Please enter a valid number.\n");
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
          scan.nextLine();
          System.out.println("\t> Well it doesn't matter. You get what you get. GO TO CLASS!");
          System.out.println("\n\t The anouncements are on what are you going to do? \n\t1. Stand and pledge.\n\t2. Sit in your desk and put your head down.\n\t3. Take a knee then run out of class.");
                    PLEDGE:
          while (running == true)
          {
          input = scan.nextLine();
           if (input.equals("1"))
           {
            System.out.println("\n\t> Nothing happens, enjoy class.");
            break PLEDGE;
           }
           else if (input.equals("2"))
           {
            if (rand.nextInt(100) <= 75)
            System.out.println("\n\t> Teacher tells you to stand and you do.");
            else 
            {
             System.out.println("\n\t> Your teacher is having a bad day and you get ISS for the rest of the day.");
             iss++;
            }
            break PLEDGE;
           }
           else if (input.equals("3"))
           {
            System.out.println("\n\t> Oh no you should not have done that. Here comes an administrator.");
            if (rand.nextInt(100) <= 25)
            {
             System.out.println("\t> Lucky you, you barely escaped the grips of ISS. Better not pull any crap like that again, now get back to class.");
            }
            else
            {
             System.out.println("\t> You been actin a fool and have been sent to ISS for the rest of the day.");
             iss++;
            }
            break PLEDGE;
           } 
           else
           {
        	 System.out.println("Please enter a valid number.");
        	 continue PLEDGE;
           }
          }
          //Tests for the first day of class
          double testGrade = 0;
          String q1 = "null";
          String q2 = "null";
          String q3 = "null";
          String q4 = "null";
          String q5 = "null";
          String[] bioTest = {"Question 1:\nWhich of the following is a mammal?\n[A] Crab\n[B] Great White Shark\n[C] Blue Whale\n[D] Whale Shark", "Question 2:\nWhat does a plant have that an animal does not?\n[A] Cells"
      			+ "\n[B] Cell Walls\n[C] Eyes\n[D] Proteins", "Question 3:\nNeurotransmitters contained in vesicles enter the synapse through...\n[A] binary fission\n[B] translocation\n[C] diffusion\n[D] exocytosis", "Question 4:\n"
      			+ "Which of the following best describes the primary function of chlorophyll in an organism?\n[A] It is the primary hydrogen acceptor in glycolysis.\n[B] It is the storage form of starch in plants.\n"
      			+ "[C] It provides nutrients to cells by circulating through the vascular tissue\n[D] It absorbs light energy to power oxygen production.", "Question 5:\nWhat kingdom does the fish belong to?\n"
      			+ "[A] Fungi\n[B] Animilia\n[C] Plante\n[D] Protozoa"};
          //BioTest Key C, B, D, D, B
          String[] zooTest = {"Question 1:\nWhat is a jelly-fishes adult form?\n[A] Polyp\n[B] Medusa\n[C] Adultirino\n[D] Manjelly", "Question 2:\nWhich of the following disease is inheritable?\n[A] Diabetes\n[B] Color Blindness\n"
        		+ "[C] Hepatitis\n[D] Malignancy", "Question 3:\nGlucose is stored in our body in the form of\n[A] fat\n[B] insulin\n[C] amino acids\n[D] glycogen", "Question 4:\nThe largest living animals belong to the group of\n"
        		+ "[A] mammals\n[B] fishes\n[C] birds\n[D] reptiles", "Question 5:\nEarthworms live in ----- in moist soil.\n[A] water\n[B] leaves\n[C] caves\n[D] burrows"};
          //ZooTest Key B, B, D, A, D
          String[] chemTest = {"Question 1:\nWhat is gold's atomic number?\n[A] 47\n[B] 63\n[C] 85\n[D] 89", "Question 2:\nThe element used in lead pencils is\n[A] Carbon\n[B] Lead\n[C] Zinc\n[D] Gallium","Question 3:\n"
        		+ "Epsom salt is chemically known as\n[A] copper sulphate\n[B] magnesium sulphate\n[C] ferrous sulphate\n[D] copper sulphate", "Question 4:\nNail polish remover contains\n[A] acetone\n[B] benzene\n[C] acetic acid\n"
        		+ "[D] petroleum ether", "Question 5:\nWhich is the heaviest metal?\n[A] iron\n[B] nickel\n[C] mercury\n[D] osmium"};
          //ChemTest Key D, A, B, A, C
          String[] phyTest = {"Question 1:\nWhat is the average velocity of an object that moved 10 meters in 2 seconds to the right?\n[A] 5.0m/s\n[B] 10m/s\n[C] 4.5m/s\n[D] 2.5m/s", "Question 2:\nWhat is the area of a square whose side is 4cm?\n"
        		+ "[A] .16m^3\n[B] .000064m^3\n[C] 16m^3\n[D] .64m^3", "Question 3:\n"};
          //PhyTest Key A, B, C, D, D
          if (iss == 0)
          {
        	  System.out.println("\n\t> Wow it is great that you got through your first class. Your overall grade is a " + grade + ".");
        	  System.out.println("\nYou are now in " + science + " and the teacher has decided to give you a test on the first day. Good luck!");
        	  
        	  if (science.equals("Biology"))
        	  {
        		  System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        		  System.out.println("***************");
        		  System.out.println(" Biology Test");
        		  System.out.println("***************");
        		  System.out.println(bioTest[0]);
        		  q1 = scan.next();
        		  System.out.println(bioTest[1]);
        		  q2 = scan.next();
        		  System.out.println(bioTest[2]);
        		  q3 = scan.next();
        		  System.out.println(bioTest[3]);
        		  q4 = scan.next();
        		  System.out.println(bioTest[4]);
        		  q5 = scan.next();
        		  if (q1.equals("C") || q1.equals("c"))
        			  testGrade++;
        		  if (q2.equals("B") || q2.equals("b"))
        			  testGrade++;
        		  if (q3.equals("D") || q3.equals("d"))
        			  testGrade++;
        		  if (q4.equals("D") || q4.equals("d"))
        			  testGrade++;
        		  if (q5.equals("B") || q5.equals("b"))
        			  testGrade++;
        		  System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        		  System.out.println("\n\t> You recieved an " + testGrade + " out of 5, or a " + (testGrade*20) + ".");
        		  if (testGrade == 5)
        		  {
        		   System.out.println("\t> You did fan-freaking-tastic" + name + "!");
        		  }
        		  else if (testGrade > 3 && testGrade < 5)
        		  {
        			  System.out.println("\t> Well you could have done better.");
        		  }
        		  else
        		  {
        			System.out.println("\t> I think you might be retarded");  
        		  }
        			  
        		  
        	  }
        	  
        	  if (science.equals("Zoology"))
        	  {
        		  System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        		  System.out.println("***************");
        		  System.out.println(" Zoology Test");
        		  System.out.println("***************");
        		  System.out.println(zooTest[0]);
        		  q1 = scan.next();
        		  System.out.println(zooTest[1]);
        		  q2 = scan.next();
        		  System.out.println(zooTest[2]);
        		  q3 = scan.next();
        		  System.out.println(zooTest[3]);
        		  q4 = scan.next();
        		  System.out.println(zooTest[4]);
        		  q5 = scan.next();
        		  if (q1.equals("B") || q1.equals("b"))
        			  testGrade++;
        		  if (q2.equals("B") || q2.equals("b"))
        			  testGrade++;
        		  if (q3.equals("D") || q3.equals("d"))
        			  testGrade++;
        		  if (q4.equals("A") || q4.equals("a"))
        			  testGrade++;
        		  if (q5.equals("D") || q5.equals("d"))
        			  testGrade++;
        		  System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        		  System.out.println("\n\t> You recieved an " + testGrade + " out of 5, or a " + (testGrade*20) + ".");
        		  if (testGrade == 5)
        		  {
        		   System.out.println("\t> You did fan-freaking-tastic" + name + "!");
        		  }
        		  else if (testGrade > 3 && testGrade < 5)
        		  {
        			  System.out.println("\t> Well you could have done better.");
        		  }
        		  else
        		  {
        			System.out.println("\t> I think you might be retarded");  
        		  }
        		  
        	  }
            	  if (science.equals("Chemistry"))
            	  {
            		  System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            		  System.out.println("*****************");
            		  System.out.println(" Chemistry Test");
            		  System.out.println("*****************");
            		  System.out.println(chemTest[0]);
            		  q1 = scan.next();
            		  System.out.println(chemTest[1]);
            		  q2 = scan.next();
            		  System.out.println(chemTest[2]);
            		  q3 = scan.next();
            		  System.out.println(chemTest[3]);
            		  q4 = scan.next();
            		  System.out.println(chemTest[4]);
            		  q5 = scan.next();
            		  if (q1.equals("D") || q1.equals("D"))
            			  testGrade++;
            		  if (q2.equals("A") || q2.equals("a"))
            			  testGrade++;
            		  if (q3.equals("B") || q3.equals("b"))
            			  testGrade++;
            		  if (q4.equals("A") || q4.equals("a"))
            			  testGrade++;
            		  if (q5.equals("C") || q5.equals("c"))
            			  testGrade++;
            		  System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            		  System.out.println("\n\t> You recieved an " + testGrade + " out of 5, or a " + (testGrade*20) + ".");
            		  if (testGrade == 5)
            		  {
            		   System.out.println("\t> You did fan-freaking-tastic" + name + "!");
            		  }
            		  else if (testGrade > 3 && testGrade < 5)
            		  {
            			  System.out.println("\t> Well you could have done better.");
            		  }
            		  else
            		  {
            			System.out.println("\t> I think you might be retarded");  
            		  }
        			  
        		  
        	  }
        	  grade = ((grade*.66)+(testGrade*6.6));
        	  System.out.println("\n\t> Your overall grade now is a " + grade + ". Are you satisfied?");
          }

          if (iss > 0)
          {
           System.out.println("\n\t> Since you got ISS for the rest of the day you are now failing " + math + ", " + science + ", and " + social + ". You should be ashamed.");
           iss--;
           grade = 60;
           System.out.println("Your overall grade is now a " + (grade*0) + ".");
          }
   
          scan.close();
      }
 }
