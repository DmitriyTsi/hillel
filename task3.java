package Hillel1;

public class task3 {



    public static void main(String[] args) {
        int num = 10000;
        int count = 0;




        for (int i = 1; i<=num; i++) {
            int res = num/i; int res1 = num%i;

            //Простое число
            if(res1 ==0) {
                count++;
            }
        }


        //Простое число
        if (count ==2) {
            System.out.println("Чмсло простое");
        }

        if (count >2) {
            System.out.println("\nВсе делители числа: " +num);
            for (int i = 1; i<=num; i++) {
                int res = num/i; int res1 = num%i;


                if(res1 ==0) {
                    System.out.print(res + " ");

                }

            }
        }






    }

}
