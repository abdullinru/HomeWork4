public class Main {
    public static void main(String[] args) {
        task3();

    }
    public static void task3(){
        int currentYear = 2022;
        int startYear = currentYear-200;
        int endYear = currentYear+100;
        int i = startYear+79;
        while(i<endYear){
            System.out.println(i);
            i+=79;

        }
    }
}