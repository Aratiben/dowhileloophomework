public class Tables {
    public static void main(String[] args) {
        int i = 0;
        do {
            i++;
            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j  + " ");  // printing digit with space in same line

            }System.out.println();  //to go to next line

        }
        while (i <= 2);  //exit condition
    }
}