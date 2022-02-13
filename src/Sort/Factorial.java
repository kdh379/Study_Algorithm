package Sort;

import java.util.ArrayList;

public class Factorial {

    public int factorialFunc(int n) {
        if (n > 1) {
            return n * this.factorialFunc(n - 1);
        } else {
            return n;
        }
    }

    public int factorialFunc(ArrayList<Integer> dataList) {
        if(dataList.size()<=0) {
            return 0;
        }
        return dataList.get(0) + this.factorialFunc(new ArrayList<>(dataList.subList(1, dataList.size())));
    }

    public static void main(String[] args) {
        Factorial fobj = new Factorial();
        ArrayList<Integer> testList = new ArrayList<>();
        for(int i=0; i<10; i++)
            testList.add(i);
        int n = fobj.factorialFunc(5);
        int num = fobj.factorialFunc(testList);
        System.out.println(n + " " + num);
    }
}
