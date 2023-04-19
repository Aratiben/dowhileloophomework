import java.util.Arrays;
import java.util.Scanner;

public class AscendingNumbers {
    //private static boolean AscendingNumbers;

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);//using main method

        int []   a = { 1,8,4,5,3,0,9};
        System.out.println("arrays before ascending order"+ Arrays.toString(a));//printing message
       Arrays.parallelSort(a);
        System.out.println("after ascending order"+Arrays.toString(a));//in ascending order

    }
}

