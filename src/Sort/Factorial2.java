package Sort;

public class Factorial2 {

    public int factorialFunc(int data) {
        if (data == 1) {
            return 1;
        }
        if (data == 2) {
            return 2;
        }
        if (data == 3) {
            return 4;
        }
        return this.factorialFunc(data - 1) + this.factorialFunc(data - 2) + this.factorialFunc( data - 3);
    }

    public static void main(String[] args) {
        Factorial2 fac = new Factorial2();
        int num = fac.factorialFunc(6);
        System.out.println(num);
    }

}
