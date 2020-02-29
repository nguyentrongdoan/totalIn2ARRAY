import java.util.Scanner;

public class Total {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("nhap so dong cho mang:");
        int a = input.nextInt();
        System.out.println("nhap so cot cho mang: ");
        int b = input.nextInt();
        int[][] A = new int[a][b];
        System.out.println("nhap phan tu cho ma tran: ");
        for (int i = 0 ; i < a; i++){
            for (int j = 0; j < b; j++){
                System.out.print("A[" + i + "][" + j + "]");
                A[i][j] = input.nextInt();
            }
        }

        int sum = 0;

        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                if (i == j){
                    sum += A[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
