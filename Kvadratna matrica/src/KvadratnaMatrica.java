import java.util.Scanner;

public class KvadratnaMatrica {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("n = ");
		int n = input.nextInt();
		int matrica[][] = new int[n][n];
		int x = 1;
		for (int i = 0; i < 2*n-1; i++) {
            if (i > n-1) {
              for (int red = n-1; red >= i - (n-1); red--) {
                  for (int kol = i - (n-1); kol <= n-1; kol++) {
                    matrica[red][kol] = x;
                   red--;
                    x++;
                  }
                  
              }
            } else {
                for (int red = i; red >= 0; red--) {
                    for (int kol = 0; kol <= i; kol++) {
                        matrica[red][kol] = x;
                       red--;
                        x++;
                    }
                    
                }
            }

	}
		
		prikazMatrice(matrica, n);
	}
	
	public static void prikazMatrice(int[][] matrica, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				
				System.out.print(matrica[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
