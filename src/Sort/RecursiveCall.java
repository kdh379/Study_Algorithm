package Sort;

public class RecursiveCall {
    public int factorialFunc(int data){
        if(data <= 1) {
            return data;
        }
        System.out.println(data);
        return this.factorialFunc(data -1) + this.factorialFunc(data -2);
    }

    public static void main(String[] args) {
        RecursiveCall obj = new RecursiveCall();
        int num = obj.factorialFunc(6);
        System.out.println();
        System.out.println(num);
    }
}
