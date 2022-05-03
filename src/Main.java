import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //task3();
        task4();

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