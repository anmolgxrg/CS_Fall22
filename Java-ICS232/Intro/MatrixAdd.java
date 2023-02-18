import java.util.Scanner;

class matrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows");
        int r = sc.nextInt();

        System.out.println("Enter number of columns");
        int c = sc.nextInt();

        int A[][] = new int[r][c];
        int B[][] = new int[r][c];
        int C[][] = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Matrix 1:enter row " + (i + 1) + " column " + (j + 1) + "element");
                A[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Matrix 2: enter row " + (i + 1) + " column " + (j + 1) + "element");
                B[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

    }
}