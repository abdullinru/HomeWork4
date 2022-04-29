public class Main {
    public static void main(String[] args) {
        task1();

    }
    public static void task1(){
        int i =1;
        while (i<11){
            System.out.print(i++ + " ");
        }
        System.out.println();
        i=10;
        for (;i>0;i--){
            System.out.print(i + " ");
        }
    }
}