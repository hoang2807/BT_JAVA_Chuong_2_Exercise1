import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a:");
        int N = scanner.nextInt();
        System.out.println(N);
        System.out.println("b:");
        int[] A = new int[N];
        for (int i = 0; i < A.length; ++i)
            A[i] = scanner.nextInt();
        for (int i : A)
            System.out.print(i + " ");
        System.out.println();
        System.out.println("c:");
        int[][] B = new int[N][N];
        for (int i = 0; i < N; ++i)
            for (int j = 0; j < N; ++j)
                B[i][j] = scanner.nextInt();
        int m = N * N;
        int sum = 0;
        /*
         * for (int i = 0; i < N; ++i) for (int j = 0; j < N; ++j)
         */
        for (int[] x : B)
            for (int y : x)
                sum += y;
        double tbc = sum * 1.0 / m;
        System.out.println(tbc);
    }
}
