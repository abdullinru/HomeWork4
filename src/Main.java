public class Main {
    public static void main(String[] args) {
        task2();

    }
    public static void task2(){
        int i =5;
        do {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            i+=7;
        }
        while (i<32);
    }
}