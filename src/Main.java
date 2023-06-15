
public class Main {
    public static void main(String[] args) {
        int a = 278925;
        System.out.println("Стоимость билета - " + a + " рублей");
        int b = 20; // 20рублей=1миля
        int c = a / b;
        if (a >= 20) {
            System.out.println("Начисленно миль - " + c);}
            else{
                System.out.println("Начисленно миль - 0");
            }
        }
    }