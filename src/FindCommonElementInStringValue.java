import java.util.Scanner;

public class FindCommonElementInStringValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    //scanner class
        System.out.print("Please enter words separating by space:");
        String input1 = scanner.nextLine();   //taking input1
        String[] s1 = input1.split(" ");  //splitting the string in array
        System.out.print("Please enter words separating by space:");
        String input2 = scanner.nextLine();   //taking input2
        String[] s2 = input2.split(" ");  //splitting in  array
        for (int i = 0; i < s1.length; i++) {    //loop to find the common element
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j]))
                    System.out.println(s1[i]);
            }
        }
    }
}

