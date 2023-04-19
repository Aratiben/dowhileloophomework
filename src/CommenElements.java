import java.util.Arrays;
import java.util.Scanner;
public class CommenElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    //scanner class
        System.out.print("Please enter your string:");
        String input1 = scanner.nextLine();              //taking input
        String[] s1 = input1.split("");
        //System.out.println(Arrays.toString(s1));
        System.out.print("Please enter your string:");
        String input2 = scanner.nextLine();        //taking second string
        String[] s2 = input2.split("");
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j]))
                    System.out.println(s1[i]);          //common elements
            }
        }
    }
}
