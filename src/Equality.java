import java.util.Arrays;
import java.util.Scanner;

public class Equality {

    public static void main(String[] args) {
        int [] a ={1,6,8,9,0};  //value1 to check
       int [] b={8,1,6,9,0};   //value2 to check
        System.out.println("first arrays"+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Second Arrays"+Arrays.toString(b));
        Arrays.sort(b);

       System.out.println(Arrays.equals(a,b));  //comparing value1 to value2

    }
}