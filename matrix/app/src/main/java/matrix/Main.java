package matrix;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        InputDataGenerator generator = new InputDataGenerator();
        // //Task 4 Transpose optimal S
        // String csvFile4 = "transposeOptimalS.csv";
        // BufferedWriter writer4 = new BufferedWriter(new FileWriter(csvFile4));
        // String header4 = "Size,S,Time";
        // writer4.write(header4);
        // writer4.newLine();
        // writer4.flush();
        // System.out.println("Working on optimal transpose s... ");
        // for (int i = 2048; i <= 4096; i+=1024) {
        //     for (int k = 0; k < 5; k++) {
        //         Matrix matrixA = generator.matrixGenerator(i,i, (k+1)*2);
        //         Matrix matrixB = generator.matrixGenerator(i,i, (k+1)*30);
        //         for (int j = i; j >= 2; j = j/2) {
        //             double time = benchmarkElementaryMultiplicationTransposedOptimal(matrixA, matrixB, j);
        //             String row =""+i+","+j+","+time;
        //             writer4.write(row);
        //             writer4.newLine();
        //             writer4.flush();
        //             System.out.println("Rep: "+k+" Size: "+i+" s: "+j+" Time: "+time);
        //         }
        //     }
        // }
        // writer4.close();

        // String csvFile5 = "TransposeRecTime.csv";
        // BufferedWriter writer5 = new BufferedWriter(new FileWriter(csvFile5));
        // String header5 = "Algorithm,Size,Time";
        // writer5.write(header5);
        // writer5.newLine();
        // writer5.flush();
        // System.out.println("Working on TransposeRec times...");
        // for (int i = 2048; i <= 4096; i+=1024) {
        //     for (int k = 0; k < 10; k++) {
        //         Matrix matrixA = generator.matrixGenerator(i,i, (k+1)*2);
        //         Matrix matrixB = generator.matrixGenerator(i,i, (k+1)*30);
        //         double time = benchmarkTransposeRec(matrixA, matrixB,36);
        //         String row ="TransposeRec,"+i+","+time;
        //         writer5.write(row);
        //         writer5.newLine();
        //         writer5.flush();
        //         System.out.println("Rep: "+k+" Size: "+i+" Time: "+time);
        //     }
        // }
        // writer5.close();

        // //Task 7 Tiled Optimal test
        // String csvFile1 = "TiledMultOptimalS.csv";
        // BufferedWriter writer1 = new BufferedWriter(new FileWriter(csvFile1));
        // String header1 = "Size,S,Time";
        // writer1.write(header1);
        // writer1.newLine();
        // writer1.flush();
        // System.out.println("Working on TiledMultOptimalS... ");
        // for (int i = 2048; i <= 4096; i+=1024) {
        //     for (int k = 0; k < 10; k++) {
        //         Matrix matrixA = generator.matrixGenerator(i,i, (k+1)*2);
        //         Matrix matrixB = generator.matrixGenerator(i,i, (k+1)*30);
        //         for (int j = i; j >= 2; j = j/2) {
        //             double time = benchmarkTiledMultiplication(matrixA, matrixB, j);
        //             String row =""+i+","+j+","+time;
        //             writer1.write(row);
        //             writer1.newLine();
        //             writer1.flush();
        //             System.out.println("Rep: "+k+" Size: "+i+" s: "+j+" Time: "+time);
        //         }
        //     }
        // }
        // writer1.close();

        // //Task 8 recursive optimal S
        // String csvFile3 = "recursiveOptimalS.csv";
        // BufferedWriter writer3 = new BufferedWriter(new FileWriter(csvFile3));
        // String header3 = "Size,S,Time";
        // writer3.write(header3);
        // writer3.newLine();
        // writer3.flush();
        // System.out.println("Working on recursiveOptimalS... ");
        // for (int i = 2048; i <= 4096; i+=1024) {
        //     for (int k = 0; k < 5; k++) {
        //         Matrix matrixA = generator.matrixGenerator(i,i, (k+1)*2);
        //         Matrix matrixB = generator.matrixGenerator(i,i, (k+1)*30);
        //         Matrix matrixC = new Matrix(i,i);
        //         for (int j = i; j >= 2; j = j/2) {
        //             double time = benchmarkRecursiveMultiplication(matrixA, matrixB, matrixC, j);
        //             String row =""+i+","+j+","+time;
        //             writer3.write(row);
        //             writer3.newLine();
        //             writer3.flush();
        //             System.out.println("Rep: "+k+" Size: "+i+" s: "+j+" Time: "+time);
        //         }
        //     }
        // }
        // writer3.close();

        // String csvFile = "matrix_multiplication_benchmark.csv";
        // BufferedWriter writer = new BufferedWriter(new FileWriter(csvFile));
        // String header = "Algorithm,Size,Time";
        // writer.write(header);
        // writer.newLine();
        // writer.flush();
        
        //Task 12 Horse Race
        // //elementaryMultiplication
        // for (int i = 0; i < 10; i++) {
        //     Matrix matrixA = generator.matrixGenerator(2048,2048, (i+1)*2);
        //     Matrix matrixB = generator.matrixGenerator(2048,2048, (i+1)*30);
        //     double elapsedTime = benchmarkMatrixMultiplication(matrixA, matrixB);
        //     String row = "elementaryMultiplication,2048," + elapsedTime;
        //     writer.write(row);
        //     writer.newLine();
        //     writer.flush();
        // }
        // for (int i = 0; i < 10; i++) {
        //     Matrix matrixA = generator.matrixGenerator(3072,3072, (i+1)*2);
        //     Matrix matrixB = generator.matrixGenerator(3072,3072, (i+1)*3);
        //     double elapsedTime = benchmarkMatrixMultiplication(matrixA, matrixB);
        //     String row = "elementaryMultiplication,3072," + elapsedTime;
        //     writer.write(row);
        //     writer.newLine();
        //     writer.flush();
        // }
        // for (int i = 0; i < 10; i++) {
        //     Matrix matrixA = generator.matrixGenerator(4096,4096, (i+1)*2);
        //     Matrix matrixB = generator.matrixGenerator(4096,4096, (i+1)*3);
        //     double elapsedTime = benchmarkMatrixMultiplication(matrixA, matrixB);
        //     String row = "elementaryMultiplication,4096," + elapsedTime;
        //     writer.write(row);
        //     writer.newLine();
        //     writer.flush();
        // }

        // //elementaryMultiplicationTransposed
        // for (int i = 0; i < 10; i++) {
        //     Matrix matrixA = generator.matrixGenerator(2048,2048, (i+1)*2);
        //     Matrix matrixB = generator.matrixGenerator(2048,2048, (i+1)*30);
        //     double elapsedTime = benchmarkElementaryMultiplicationTransposed(matrixA, matrixB);
        //     String row = "elementaryMultiplicationTransposed,2048," + elapsedTime;
        //     writer.write(row);
        //     writer.newLine();
        //     writer.flush();
        // }
        // for (int i = 0; i < 10; i++) {
        //     Matrix matrixA = generator.matrixGenerator(3072,3072, (i+1)*2);
        //     Matrix matrixB = generator.matrixGenerator(3072,3072, (i+1)*3);
        //     double elapsedTime = benchmarkElementaryMultiplicationTransposed(matrixA, matrixB)    ;
        //     String row = "elementaryMultiplicationTransposed,3072," + elapsedTime;
        //     writer.write(row);
        //     writer.newLine();
        //     writer.flush();
        // }
        // for (int i = 0; i < 10; i++) {
        //     Matrix matrixA = generator.matrixGenerator(4096,4096, (i+1)*2);
        //     Matrix matrixB = generator.matrixGenerator(4096,4096, (i+1)*3);
        //     double elapsedTime = benchmarkElementaryMultiplicationTransposed(matrixA, matrixB);
        //     String row = "elementaryMultiplicationTransposed,4096," + elapsedTime;
        //     //row is in nanoseconds, change it to seconds

        //     writer.write(row);
        //     writer.newLine();
        //     writer.flush();
        // }

        // //tiledMultiplication
        // for (int i = 0; i < 10; i++) {
        //     Matrix matrixA = generator.matrixGenerator(2048,2048, (i+1)*2);
        //     Matrix matrixB = generator.matrixGenerator(2048,2048, (i+1)*30);
        //     double elapsedTime = benchmarkMatrixMultiplication(matrixA, matrixB);
        //     String row = "tiledMultiplication,2048," + elapsedTime;
        //     writer.write(row);
        //     writer.newLine();
        //     writer.flush();
        // }
        // for (int i = 0; i < 10; i++) {
        //     Matrix matrixA = generator.matrixGenerator(3072,3072, (i+1)*2);
        //     Matrix matrixB = generator.matrixGenerator(3072,3072, (i+1)*3);
        //     double elapsedTime = benchmarkMatrixMultiplication(matrixA, matrixB);
        //     String row = "tiledMultiplication,3072," + elapsedTime;
        //     writer.write(row);
        //     writer.newLine();
        //     writer.flush();
        // }
        // for (int i = 0; i < 10; i++) {
        //     Matrix matrixA = generator.matrixGenerator(4096,4096, (i+1)*2);
        //     Matrix matrixB = generator.matrixGenerator(4096,4096, (i+1)*3);
        //     double elapsedTime = benchmarkMatrixMultiplication(matrixA, matrixB);
        //     String row = "tiledMultiplication,4096," + elapsedTime;
        //     writer.write(row);
        //     writer.newLine();
        //     writer.flush();
        // }
        // writer.close();
        
        // //RecursiveMultiplication
        // for (int i = 2048; i <= 4096; i+=1024) {
        //     for (int k = 0; k < 10; k++) {
        //         Matrix matrixA = generator.matrixGenerator(i,i, (k+1)*2);
        //         Matrix matrixB = generator.matrixGenerator(i,i, (k+1)*30);
        //         Matrix matrixC = new Matrix(i,i);
        //         double time;
        //         if(i == 2048){
        //             time = benchmarkRecursiveMultiplication(matrixA, matrixB, matrixC, 16); //change to optimal
        //         }
        //         else if(i == 3072){
        //             time = benchmarkRecursiveMultiplication(matrixA, matrixB, matrixC, 24); //change to optimal
        //         }
        //         else{
        //             time = benchmarkRecursiveMultiplication(matrixA, matrixB, matrixC, 128); //change to optimal
        //         }
        //         String row ="recursiveMultiplication,"+i+","+time;
        //         writer.write(row);
        //         writer.newLine();
        //         writer.flush();
        //         System.out.println(row);
        //     }
        // }

        // String csvFile2 = "TransposeTime.csv";
        // BufferedWriter writer2 = new BufferedWriter(new FileWriter(csvFile2));
        // String header2 = "Algorithm,Size,Time";
        // writer2.write(header2);
        // writer2.newLine();
        // writer2.flush();
        // System.out.println("Working on Transpose times...");
        // for (int i = 2048; i <= 4096; i+=1024) {
        //     for (int k = 0; k < 10; k++) {
        //         Matrix matrixA = generator.matrixGenerator(i,i, (k+1)*2);
        //         Matrix matrixB = generator.matrixGenerator(i,i, (k+1)*30);
        //         double time = benchmarkTranspose(matrixA, matrixB);
        //         String row ="Transpose,"+i+","+time;
        //         writer2.write(row);
        //         writer2.newLine();
        //         writer2.flush();
        //         System.out.println("Rep: "+k+" Size: "+i+" Time: "+time);
        //     }
        // }
        // writer2.close();        
    }




    public static double benchmarkMatrixMultiplication(Matrix matrixA, Matrix matrixB) {
            long startTime = System.nanoTime();
            Matrix.elementaryMultiplication(matrixA, matrixB);
            long endTime = System.nanoTime();
        return (endTime - startTime) / 1_000_000_000.0;
    }
    public static double benchmarkElementaryMultiplicationTransposed(Matrix matrixA, Matrix matrixB) {
            long startTime = System.nanoTime();
            Matrix.elementaryMultiplicationTransposed(matrixA, matrixB,36);
            long endTime = System.nanoTime();
        return (endTime - startTime) / 1_000_000_000.0;
    }
    public static double benchmarkElementaryMultiplicationTransposedOptimal(Matrix matrixA, Matrix matrixB, int s) {
            long startTime = System.nanoTime();
            Matrix.elementaryMultiplicationTransposed(matrixA, matrixB,s);
            long endTime = System.nanoTime();
        return (endTime - startTime) / 1_000_000_000.0;
    }
    public static double benchmarkTransposeRec(Matrix matrixA, Matrix matrixB, int s) {
        long startTime = System.nanoTime();
        Matrix.transposeRec(matrixA, matrixB,s);
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1_000_000_000.0;
    }
    public static double benchmarkTranspose(Matrix matrixA, Matrix matrixB) {
            long startTime = System.nanoTime();
            Matrix.transpose(matrixA, matrixB);
            long endTime = System.nanoTime();
        return (endTime - startTime) / 1_000_000_000.0;
    }
    public static double benchmarkTiledMultiplication(Matrix matrixA, Matrix matrixB, int s) {
            long startTime = System.nanoTime();
            Matrix.tiledMultiplication(matrixA, matrixB,s);
            long endTime = System.nanoTime();
        return (endTime - startTime) / 1_000_000_000.0;
    }
    public static double benchmarkRecursiveMultiplication(Matrix matrixA, Matrix matrixB, Matrix matrixC, int s) {
            long startTime = System.nanoTime();
            Matrix.recursiveMultiplication(matrixA, matrixB, matrixC,s);
            long endTime = System.nanoTime();
        return (endTime - startTime) / 1_000_000_000.0;
    }
}
