import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    private static int timeTurn(Double[][] arr) {
        int maxTurn = 0;
        int indexMaxTurn = 0;
        for (int i = 0; i < arr[0].length; i++) {
            int tutn = 0;
            for (int j = 0; j < arr.length; j++) {
                tutn += arr[j][i];
            }
            if (tutn > maxTurn){
                maxTurn = tutn;
                indexMaxTurn = i;
            }
        }
        return indexMaxTurn+1;
    }

    public static void main(String[] args) {

        File file1 = new File("Cash1.txt");
        File file2 = new File("Cash2.txt");
        File file3 = new File("Cash3.txt");
        File file4 = new File("Cash4.txt");
        File file5 = new File("Cash5.txt");

        Scanner sc = null;

        Double[][] result = new Double[5][16];
        try {
            sc = new Scanner(file1);
        } catch (FileNotFoundException e) {
            System.out.println("Файла нет");
        }
        int index = 0;
        while (sc.hasNextLine()){
            result[0][index++] = Double.parseDouble(sc.nextLine());
        }

        try {
            sc = new Scanner(file2);
        } catch (FileNotFoundException e) {
            System.out.println("Файла нет");
        }
        index = 0;
        while (sc.hasNextLine()){
            result[1][index++] = Double.parseDouble(sc.nextLine());
        }

        try {
            sc = new Scanner(file3);
        } catch (FileNotFoundException e) {
            System.out.println("Файла нет");
        }
        index = 0;
        while (sc.hasNextLine()) {
            result[2][index++] = Double.parseDouble(sc.nextLine());
        }

        try {
            sc = new Scanner(file4);
        } catch (FileNotFoundException e) {
            System.out.println("Файла нет");
        }
        index = 0;
        while (sc.hasNextLine()){
            result[3][index++] = Double.parseDouble(sc.nextLine());
        }

        try {
            sc = new Scanner(file5);
        } catch (FileNotFoundException e) {
            System.out.println("Файла нет");
        }
        index = 0;
        while (sc.hasNextLine()){
            result[4][index++] = Double.parseDouble(sc.nextLine());
        }

        int interval = timeTurn(result);
        System.out.println(interval);
    }
}
