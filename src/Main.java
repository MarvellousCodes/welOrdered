// 468
//
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("This programm will show all the Well and UnWell-Ordered 3 digit Numbers. ");
        System.out.println("Press 1 to start!");
        int num = sc.nextInt();

        for(num =100; num<=999; num++)
        {
            if (num / 100 < ((num%100) / 10) || ((num%100) / 10) < (num%10) ) {
                System.out.println(num + " is a Well-Ordered number");
            } else {
                System.out.println(num +" Not-Well Ordered");
            }
        }

    }
}