package altorithm;

import java.util.Scanner;

public class DFSQuestion1 {

    static int n;
    static int m;
    static int[][] graph;

    //DFS로 특정 노드 방문하고 연결된 모든 노드 방문
    public static boolean dfs(int x, int y) {
        //n m 범위 벗어나는 경우 즉시 종료
        if (x <= -1 || x >= n || y <= -1 || y >= m ) {
            return false;
        }
        //현재 노드를 아직 방문하지 않았다면
        if (graph[x][y] == 0) {
            graph[x][y] = 1;
            //상하좌우 위치들도 재귀적으로 호출
            dfs(x - 1, y);
            dfs(x, y - 1);
            dfs(x + 1, y);
            dfs(x, y+1);
            return true;
        }
        return false;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("가로: ");
        n = sc.nextInt();
        System.out.print("세로: ");
        m = sc.nextInt();
        sc.nextLine();

        graph = new int[n][m];

        for(int i=0; i < m; i++) {
            System.out.print("모형(0,1  " + m + "개):");
            String str = sc.nextLine();
            for(int j=0; j < n; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        //모든 노드에 대하여 음료수 채우기
        int result = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(i, j)) {
                    result += 1;
                }
            }
        }
        System.out.println(result);


    }
}
