import static java.lang.System.out;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[]args){
        System.out.println("Welcome to Multiplication Tables");
        System.out.println("How large would you like to see them?");

        Scanner keyboard = new Scanner(System.in);
        int Size = keyboard.nextInt();
        for(int Num= 0; Num<= Size;Num++)
        {

        for(int counter = 0; counter <= Size; counter++)
        {
       System.out.println(Num+"*"+counter+ "= "+(Num*counter) );
            }

        }

    }
}



