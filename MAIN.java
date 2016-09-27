import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class game{


     public static void main (String str[]) throws IOException {
        Scanner scan = new Scanner(System.in);
         int yesno;
         String name;
         System.out.print("Welcome to Glynn Academy the Game \nPrint your name:");
         name = scan.nextLine();
         System.out.println("So your name is " + name + "\n1: Yes\n2: No");
         yesno = scan.nextInt();
         if (yesno == 1){
           System.out.println("Great welcome to Glynn Academy " + name + "!");
         }
         else if (yesno == 2){
           System.out.println("Please reenter your name: ");
         }
         
     }

}
