package matrix;

import java.util.Random;
public class InputDataGenerator {
    public Matrix matrixGenerator(int rows, int cols, int seed) {
        Matrix matrix = new Matrix(rows, cols);
        Random random = new Random(seed);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix.setSlow(i, j, random.nextDouble());
            }
        }
        return matrix;
    }
}
