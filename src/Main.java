public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int sum = 12345;
        int bonus = 20;

        int milly = sum / bonus;
        System.out.println("За эту покупку получено " + milly + " бонусных миль\n");

        //Задание 2
        System.out.println("Задание 2");
        int gift = 0;
        int balance = 123;
        int refill = 456;
        if (refill > 1000) {
            gift = refill / 100;
            balance = balance + refill + gift;
        } else {
            balance = balance + refill;
        }
        System.out.println("Ваш итоговый счет: " + balance);
        if (gift > 0) {
            System.out.println("Количество бонусных рублей = " + gift);
        }
    }
}