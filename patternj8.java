import java.util.Scanner;

public class patternj8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
      int rows=sc.nextInt();

        int start = 1;

        for (int i = 1; i <= rows; i++) {
            int num = start;
            for (int j = 1; j <= rows; j++) {
                System.out.print(num);
                num = (num + 2) % (2 * rows);
                if (num == 0) {
                    num = 2 * rows - 1;
                }
            }
            System.out.println();

            start = (start + 2) % (2 * rows);
            if (start == 0) {
                start = 2 * rows - 1;
            }
        }
    }}