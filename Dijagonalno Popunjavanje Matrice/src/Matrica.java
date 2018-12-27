import java.util.Scanner;

public class Matrica {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        int n = input.nextInt();
        int matrica[][] = new int[n][n];
        int x = 1;
        for (int i = 0; i < 2*n-1; i++) {
            if (i > n - 1) {
                int red = n - 1;
                for (int kol = i - (n - 1); kol <= n - 1; kol++) {
                    matrica[red][kol] = x;
                    red--;
                    x++;
                }
            } else {
                int red = i;
                for (int kol = 0; kol <= i; kol++) {
                    matrica[red][kol] = x;
                    red--;
                    x++;
                }
            }
        }
        stampajMatricu(matrica, n);
    }

    public static void stampajMatricu (int[][] matrica, int n) {
        for (int red = 0; red < n; red++) {
            for (int kol = 0; kol < n; kol++) {
                System.out.print(matrica[red][kol] + "\t");
            }
            System.out.println();
        }
    }

}
