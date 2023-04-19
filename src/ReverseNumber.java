

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {                    //main method
        Scanner scanner = new Scanner(System.in);    //scanner class

        System.out.println("please type five digit number");        //printing message
        int number = scanner.nextInt();
        int reverse = 0;

        for (int i = number; i > 0; i = i / 10) { //using for loop method
            int reminder = i % 10;
            reverse = reverse * 10 + reminder;
        }
        System.out.println("the reverse number is " + reverse);  //printing final result
    }
}


