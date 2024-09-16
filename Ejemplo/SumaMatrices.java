
public class SumaMatrices {
    public static void main(String[] args) {
        int[][] matriz1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matriz2 = {
                {8, 4, 5},
                {1, 5, 8},
                {6, 4, 9}
        };
        
        for (i = 0; i < 3; ++i) {
            for (j = 0; j < 3; ++j) {
                sumaMatrices[i][j] = matriz1[i][j] + matriz2[i][j];
            };
        }
        
        System.out.println("La suma de las dos matrices es:");
        for (i = 0; i < 3; ++i) {
            for (j = 0; j < 3; ++j) {
                System.out.print(sumaMatrices[i][j] + "\t");
            };
            System.out.println();
        }
    }
}