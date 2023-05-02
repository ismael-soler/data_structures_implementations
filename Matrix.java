public class Matrix {
    private int[][] matrix;
    private int size;

    public Matrix(){
        this.size = 1;
        setMatrix();
    }

    public Matrix(int n){
        this.size = n;
        setMatrix();
    }

    private void setMatrix() {
        this.matrix = new int[this.size][this.size];

        int val = 1;
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                matrix[i][j] = val;
                val++;
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                if (j == this.size - 1)
                    System.out.println(matrix[i][j]);
                else
                    System.out.print(matrix[i][j] + " ");
            }
        }
    }

    public void printRotatedMatrix() {
        for (int j = this.size - 1; j >= 0; j--) {
            for (int i = 0; i < this.size; i++) {
                if (i == this.size - 1)
                    System.out.println(matrix[i][j]);
                else
                    System.out.print(matrix[i][j] + " ");
            }
        }
    }

    public void modifyDimensions(int n) {
        this.size = n;
        setMatrix();
    }
}

class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(4);
        matrix.printRotatedMatrix();
    }
}