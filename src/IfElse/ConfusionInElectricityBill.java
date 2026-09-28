package IfElse;
/*
Problem: Confusion In Electricity Bill

Mr. T received the electricity bill for his house.

Electricity bill rates:
1. First 50 units  -> Rs. 0.50/unit
2. Next 100 units  -> Rs. 0.75/unit
3. Next 100 units  -> Rs. 1.20/unit
4. Above 250 units -> Rs. 1.50/unit

An additional surcharge of 20% is added to the bill.

Take the number of units N as input and print the total
electricity bill amount.

Note:
The bill can have a floating-point value.
Print only the integral value of the bill.

For example:
Integral value of 2.91 is 2.
*/

import java.util.Scanner;

public class ConfusionInElectricityBill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        double  bill , surcharge;

        if(N <=50)
        {
            bill =  0.50 * N;
            surcharge  = bill + (0.20 * bill);
        }
        else if (N <=150)
        {
            bill =  0.50 * 50 + 0.75 * (N - 50);
            surcharge  = bill + (0.20 * bill);
        }
        else if( N <= 250)
        {
            bill =  0.50 * 50 + 0.75 * 100 + 1.20 * (N-150);
            surcharge  = bill + (0.20 * bill);
        }
        else
        {
            bill =  0.50 * 50 + 0.75 * 100 + 1.20 * 100 + 1.50 * (N - 250);
            surcharge  = bill + (0.20 * bill);
        }

        System.out.println((int)surcharge);
    }
}
