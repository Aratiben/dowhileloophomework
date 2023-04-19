public class Divideby3and5 {
    public static void main(String[] args) {
        for (int j = 0; j <= 100; j++) {    //loop for counting
            if (j % 3 == 0) {  // checking the number is divided by 3
                System.out.println(j);
            }
        }
        for (int i = 0; i <= 100; i++) {       //counting numbers

            if (i % 5 == 0) {   //checking the number is divided by 5 or not
                System.out.println(i);
            }
        }
    }
}

