import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        int row = 9;
        int col = 9;
        for (int i = 1; i <= row; i++) {
//            System.out.println(i);
            //打印页
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " * " + j + "=" + i * j + "\t");
            }
            System.out.println();
        }
        System.out.println("直角三角形");
        System.out.println("输入想打印的行数");
        int row2 = new Scanner(System.in).nextInt();
        for (int i = 1; i <= row2; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("等腰三角形");
//
        for (int i = 1; i <= row2; i++) {
            for (int j = 1; j <= row2 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("空心等腰");
        for (int i = 1; i <= row2; i++) {
            for (int j = 1; j <= row2 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == 1 || i == row2) {
                    System.out.print("*");
                } else if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("空心菱形");

        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < row2 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = row2; i >= 0; i--) {
            for (int j = row2 - i - 1; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 0; j--) {
                if (j == 0 || j == i) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
    }
