package Hillel1;

public class task2 {
    public static void main(String[] args) {

        int[] arrElements = new int[10];
        int sredneye = 0;

        for (int i = 0; i < 10; i++) {

            int a = 10 + (int) Math.round (Math.random() * 10);
            sredneye = sredneye + a;

            arrElements[i] = a;
            System.out.print(arrElements[i] + " ");
        }
         System.out.println("\nСреднее число массива: " +sredneye/10);

    }
}
