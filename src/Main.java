import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task3();

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