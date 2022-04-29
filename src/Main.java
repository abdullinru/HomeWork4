import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task3();

    }
    public static void task3(){
        int currentYear = 2022;
        int startYear = currentYear-200;
        int endYear = currentYear+100;
        for (int year = startYear; year < endYear; year++){
            if (year%79==0){
                System.out.println(year);
            }
        }
    }
}