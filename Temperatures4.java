import java.util.*;
public class Temperatures4 {

        public static void main(String[]args)
        {
            int Chart[][] = new int[4][7];
            Chart[0][0] = 68;
            Chart[1][0] = 76;
            Chart[2][0] = 73;
            Chart[3][0] = 64;
            Chart[0][1] = 70;
            Chart[1][1] = 76;
            Chart[2][1] = 72;
            Chart[3][1] = 65;
            Chart[0][2] = 76;
            Chart[1][2] = 87;
            Chart[2][2] = 81;
            Chart[3][2] = 69;
            Chart[0][3] = 70;
            Chart[1][3] = 84;
            Chart[2][3] = 78;
            Chart[3][3] = 68;
            Chart[0][4] = 68;
            Chart[1][4] = 82;
            Chart[2][4] = 76;
            Chart[3][4] = 70;
            Chart[0][5] = 71;
            Chart[1][5] = 75;
            Chart[2][5] = 73;
            Chart[3][5] = 74;
            Chart[0][6] = 75;
            Chart[1][6] = 83;
            Chart[2][6] = 77;
            Chart[3][6] = 72;

            String Days[]= {"Sun:  ","Mon:  ","Tues: ","Wed:  ","Thurs:","Fri:  ","Sat:  "};
            //int d = 0;
            String Time[] = {"7AM: ", "3PM: ", "7PM: ", "3AM: "};
            System.out.println("TEMPERATURE CALCULATOR");
            System.out.println("The data provided are: ");
            //
            int index = 0;
            for (int row = 0; row < Chart.length; row++)
            {
                System.out.print(Time[index++]);
                for (int column = 0; column < 7; column++)
                {
                    System.out.print(Chart[row][column] + "\t");
                }
                System.out.println();
            }
            System.out.println("Based on that data, the following are the average temperatures for the week.");
            String Time2[] = {"7AM: ", "3PM: ", "7PM: ", "3AM: "};

            //averages of columns <--problem child
            int d =0;
            int Sum2 =0;

            for (int r =0; r <Chart[0].length; r++)
            {
                System.out.print(Days[d++]);
                Sum2 =0;
                for (int c = 0; c < Chart.length; c++)
                {
                    Sum2 += Chart[c][r];
                }
                int ave = Sum2/Chart.length;
                System.out.println( " "+ ave);
            }

             // ave for rows
            int T = 0;
            int Sum = 0;

            for (int Row = 0; Row<Chart.length; Row++ ) {
                System.out.print(Time2[T++]);
                Sum = 0;
                for (int column = 0; column < Chart[Row].length; column++) {
                    Sum += Chart[Row][column];
                }
                int ave1 = Sum / Chart[Row].length;
                System.out.println(ave1);

            }
            System.out.println("The final average temperature for the week was:");

            int Sum3 = 0;


            for (int Row = 0; Row<Chart.length; Row++ ) {
                for (int column = 0; column < Chart[Row].length; column++) {
                    Sum3 += Chart[Row][column];
                }
            }
                int totAve=Sum3/(Chart[0].length*Chart.length);
                System.out.println(totAve);
        }

    }





