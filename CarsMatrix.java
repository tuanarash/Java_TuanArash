public class CarsMatrix {
    public static void main(String[] args) {
        String [][] matrix = new String[3][3];

        matrix[0][0] = "AMG"; matrix[0][1] = "Myvi"; matrix[0][2] = "G Wagon";
        matrix[1][0] = "Waja"; matrix[1][1] = "i8"; matrix[1][2] = "i7";
        matrix[2][0] = "Kancil"; matrix[2][1] = "Kelisa"; matrix[2][2] = "Axia";

        double [][] matrix2 = {
            {300000, 20000, 200000},
            {10000, 150000, 125000},
            {5000, 7000, 15000}
        };

        for (int row=0; row<matrix.length; row++) {
            for (int col=0; col<matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println("=====================================");
        for (double matrixRow[] : matrix2) {
            for (double matrixCol : matrixRow) {
                System.out.print(" RM " + matrixCol);
            }
            System.out.println();
        }

    }
}
