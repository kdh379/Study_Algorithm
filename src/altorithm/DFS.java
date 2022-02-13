package altorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class DFS {
    public static boolean[] visited = new boolean[9];
    public static ArrayList<ArrayList<Integer>> gragh = new ArrayList<>();

    //DFS함수 정의
    public static void dfs(int x) {
        //현재 노드를 방문 처리
        visited[x] = true;
        System.out.print(x + " ");
        //현재 노드와 연결된 다른 노드를 재귀적으로 방문
        for(int i = 0; i < gragh.get(x).size(); i++) {
            int y = gragh.get(x).get(i);
            if (!visited[y]) dfs(y);
        }
    }

    public static void main(String[] args) {
        int[][] num = {
                { },
                { 2, 3, 8 },
                { 1, 7 },
                { 1, 4, 5 },
                { 3, 5 },
                { 3, 4 },
                { 7 },
                {2, 6, 8},
                {1, 7}
        };
        for(int i=0; i<num[0].length; i++) {
            ArrayList<Integer> integerArray = (ArrayList<Integer>) Arrays.stream(num[i]).boxed().collect(Collectors.toList());
            gragh.add(integerArray);
        }
        dfs(1);





    }
}
