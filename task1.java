package Hillel1;

public class task1 {

public static void main(String[] args) {


for (int i=1; i<=100; i++) {
    int numTri, numPyat;

    numPyat = i%5;
    if (numPyat ==0) {
        System.out.print(" Hello ");
    }

    numTri = i%3;
    if (numTri == 0) {
        System.out.print(" World ");
    }

        if (numTri != 0 && numPyat !=0) {
        System.out.print(i+ " ");
    }





    }


}
}






