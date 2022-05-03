import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //task3();
        //task4();
        //fibo();
        //matrix();
        //task6();
        //task7();
        task8();

    }
    public static void task8(){
        int[] mas = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (mas[i]+mas[j]==-2){
                    System.out.println("сумма этих чисел равна -2: " + mas[i] + " + " + mas[j] + " = -2");
                }
            }
        }
    }
    public static void task7(){
        int[] masError = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(masError));
        for (int i = 0; i < 3; i++) {
            int a = masError[i];
            masError[i]=masError[masError.length-1-i];
            masError[masError.length-1-i] = a;
        }
        System.out.println(Arrays.toString(masError));

    }
    public static void task6(){
        int[] masError = {5, 4, 3, 2, 1};
        int[] masTrue = new int[5];
        for (int i = 0; i < 5; i++) {
            masTrue[i]=masError[masError.length-1-i];
        }
        System.out.println(Arrays.toString(masError));
        System.out.println(Arrays.toString(masTrue));
    }
    public static void matrix(){
        int[][] matrix = new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==j||i+j==2){
                    matrix[i][j]=1;
                }
            }
        }

        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
    public static void fibo(){
        int[] fibo = new int[10];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i < 10; i++) {
            fibo[i]=fibo[i-1]+fibo[i-2];
        }
        System.out.println(Arrays.toString(fibo));
    }
    public static void task4(){
        for (int i = 1; i < 30; i++) {
            System.out.print(i+": ");
            if (i%3==0){
                System.out.print("Ping ");
            }
            if (i%5==0){
                System.out.print("Pong ");
            }
            System.out.println();

        }
    }
    public static void task3(){
        int currentYear = LocalDate.now().getYear();;
        int startYear = currentYear-200;
        int endYear = currentYear+100;
        for (int year = startYear; year <= endYear; year++){
            if (year%79==0){
                while (year<=endYear) {
                    System.out.println(year);
                    year = year + 79;
                }
                break;
            }
        }
    }
}