package Day11;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2644 {

    static int n, from, to;
    static int depth = 0;
    static int[][] matrix;
    static boolean[] visited;
    static int answer = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //첫째 줄 입력, 인접 행렬, 방문 배열 크기 지정
        n = Integer.parseInt(br.readLine());
        matrix = new int[n+1][n+1];
        visited = new boolean[n+1];

        //두번째 줄 입력
        st = new StringTokenizer(br.readLine());
        from = Integer.parseInt(st.nextToken());
        to = Integer.parseInt(st.nextToken());

        //세번째 줄 입력
        int m = Integer.parseInt(br.readLine());

        //m개의 관계 입력받기, 인접행렬에 추가
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            matrix[x][y] = 1;
            matrix[y][x] = 1;
        }

        answer = -1;

        DFS(from, depth);

        bw.write(answer + "\n");
        bw.flush();
        bw.close();

    }

    static void DFS(int s, int d){
        if(s == to){
            answer = d;
            return;
        }

        if(visited[s]){
           return;
        } else{
            visited[s] = true;
            for(int i = 1; i <= n; i++){
                if((matrix[s][i] == 1) && (visited[i] == false))
                    DFS(i, d+1);
            }
        }
    }

}