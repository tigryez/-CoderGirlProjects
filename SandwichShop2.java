import static java.lang.System.out;
import java.util.Scanner;

public class SandwichShop2
{
    public static void main (String[]args)
    {
        //don't change these lines
        Scanner keyboard = new Scanner (System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoups = 70;
        //my code goes under here

        out.println ("Checking sales goals.");
        out.println ("The sales goal for veggie sandwiches is " + goalForVeggies);
        out.println ("How many veggie sandwiches were sold today?");
        int goalA;
        goalA = keyboard.nextInt();
        keyboard.skip ("\n");
        if (goalA >= goalForVeggies){
            out.println ("Made Goal!");

        }
        else {
            out.println ("Fell Short");
        }

        out.println ("The sales goal for burgers is " + goalForBurgers);
        out.println ("How many burgers were sold today?");
        int goalB;
        goalB = keyboard.nextInt();
        keyboard.skip ("\n");
        if (goalB >= goalForBurgers){
            out.println ("Made Goal!");
        }
        else {
            out.println ("Fell Short");
        }

        out.println ("The sales goal for subs is " + goalForSubs);
        out.println ("How many subs were sold today?");
        int goalC;
        goalC = keyboard.nextInt();
        keyboard.skip ("\n");
        if (goalC >= goalForSubs)  {
            out.println ("Made Goal!");
        }
        else {
            out.println ("Fell Short");
        }

        out.println ("The sales goal for soup is " + goalForSoups);
        out.println ("How many soups were sold today?");
        int goalD;
        goalD = keyboard.nextInt();
        keyboard.skip ("\n");
        if (goalD >= goalForSoups){
            out.println ("Made Goal!");
        }
        else {
            out.println ("Fell Short");
        }
            boolean finalGoal= (goalA >= goalForVeggies)&&(goalB >= goalForBurgers)&&(goalC >= goalForSubs)&&(goalD >= goalForSoups);
        if (finalGoal==true)

        //int finalGoal;
       // finalGoal = goalA + goalB + goalC + goalD;
       // if (finalGoal >= 550){
            out.println ("Made goal for everything!");

        //



        //total goals up, if greater than or equal to 550, print out made goal for everything!!
       // boolean result = (goalA == goalForVeggies);

        //if (keyboard input == goalForVeggies){
        // out.print ("Made Goal!");
        // } else {
        // out.print ("Fell Short");
        // }

    }

}
