public class Problem10 {
    static final int N = 4;

    static void transpose(int A[][], int B[][]) {
        int i, j;
        for (i = 0; i < N; i++)
            for (j = 0; j < N; j++)
                B[i][j] = A[j][i];
    }

    public static void main(String[] args) {
        int A[][] = { { 5, 0, 3, 9 },
                { 0, 8, 4, 6 },
                { 1, 7, 2, 8 },
                { 6, 9, 5, 4 } };

        int B[][] = new int[N][N], i, j;

        transpose(A, B);

        System.out.print("Result matrix is \n");
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++)
                System.out.print(B[i][j] + " ");
            System.out.print("\n");
        }
    }
}