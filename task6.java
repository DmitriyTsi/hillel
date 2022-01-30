package Hillel1;

// Создать 2мерный массив (матрица) M*N  и заполнить его случайными числами.
// Отсортировать числа по возрастанию, чтобы с левом верхнем углу было самое маленькое число, справа от него следующее по значению,
// int a = 10 + (int) Math.round (Math.random() * 10);

public class task6 {
    public static void main(String[] args) {

        int i = 0;
        int[][] myAr = new int[10][10];

        ///Создания массива со случ числами
        for(i=0; i<9; i++) {
            myAr[0][i] = (int) Math.round (Math.random() *10);
            myAr[1][i] = (int) Math.round (Math.random() *10);
        }


        //Сортировка массива
        for(int v=0; v<9; v++) {

            for(int vv=0; vv<9; vv++) {
                if(myAr[0][vv]>myAr[0][v]){
                    int numOne =  myAr[0][vv];
                    int numTwo =  myAr[0][v];
                    myAr[0][vv] = numTwo;
                    myAr[0][v] = numOne;
                }
            }
        }

        System.out.println();
        for(int v=0; v<9; v++) {

            for(int vv=0; vv<9; vv++) {
                if(myAr[1][vv]>myAr[1][v]){
                    int numOne =  myAr[1][vv];
                    int numTwo =  myAr[1][v];
                    myAr[1][vv] = numTwo;
                    myAr[1][v] = numOne;
                }
            }
        }

        //Вывод массива
        for(i=0; i<9; i++) {
            System.out.print( myAr[0][i] + " ");
        }
        System.out.println(" ");
        for(i=0; i<9; i++) {
            System.out.print( myAr[1][i] + " ");
        }


    }


}
