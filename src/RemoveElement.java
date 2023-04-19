import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);              //using inbuilt method
        System.out.println("Write your string");
        String a= scanner.nextLine();                        //taking input
        String [] a1= a.split( " ");
        //System.out.println(Arrays.toString(a1));
        System.out.println("Please write which element you want remove");
        String b= scanner.nextLine();                      //taking remove element name
        int l= a1.length;
        int j=0;
        String [] m=new String[l-1];
        for (int i = 0; i <l ; i++) {                //using loop to check element
            if(!b.equals(a1[i])){
                m[j]=a1[i];
                j++;
            }
        } System.out.println(Arrays.toString(m));
    }
}
