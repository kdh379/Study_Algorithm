package Sort;

import java.util.ArrayList;
import java.util.Arrays;

public class Split {
    public void splitFunc(ArrayList<Integer> dataList) {
        if(dataList.size() <= 1) {
            return;
        }
        int medium = dataList.size() / 2;

        ArrayList<Integer> leftArr = new ArrayList<>();
        ArrayList<Integer> rightArr = new ArrayList<>();

        leftArr = new ArrayList<>(dataList.subList(0, medium)); //0부터 medium-1
        rightArr = new ArrayList<>(dataList.subList(medium, dataList.size()));

        System.out.println(leftArr);
        System.out.println(rightArr);
    }

    public static void main(String[] args) {
        Split obj = new Split();
        obj.splitFunc(new ArrayList<Integer>(Arrays.asList(4,1,2,3,5,7)));
    }
}
