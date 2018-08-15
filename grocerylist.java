import static java.lang.System.out;
import java.util.Scanner;

    public class grocerylist{
        public static void main (String [] args) {
            Scanner keyboard  = new Scanner (System.in);
            String item1;
            String item2;
            String item3;

            int thing1;
            int thing2;
            int thing3;

            float price1;
            float price2;
            float price3;

            float totalCost;

            //
              out.println("Please list the three items on your grocery shopping list.");
              out.println("Item 1?");
                item1 = keyboard.nextLine();
              out.println("Item 2?");
                item2 = keyboard.nextLine();
              out.println("Item 3?");
                item3 = keyboard.nextLine();

              out.println("Now, please list enter the quantity of each item.");
              out.println ("How many " + item1 +"?");
                thing1 = keyboard.nextInt();
              out.println ("How many " + item2 +"?");
                thing2 = keyboard.nextInt();
              out.println ("How many " + item3 +"?");
                thing3 = keyboard.nextInt();

              out.println("Now, please enter the price of each item.");
              out.println("How much does one " + item1+ " cost?");
                price1 = keyboard.nextFloat();
                keyboard.skip("\n");
              out.println("How much does one " + item2+ " cost?");
                price2 = keyboard.nextFloat();
                keyboard.skip("\n");
              out.println("How much does one " + item3+ " cost?");
                price3 = keyboard.nextFloat();
                keyboard.skip("\n");

              out.println("Calculating your grocery bill.");
                totalCost = (price1*thing1)+(price2*thing2)+(price3*thing3);
              out.println("Your total cost is "+ totalCost);




            //out.println ("Item 2? + append the keyboard input")
            //out.println ("Item 3? + append the keyboard input")
            //out.println ("Now, please enter the quantity of each item.")
            //out.println ("How many + append name ") get user keyboard input

        }
        }
