package Day12;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Baekjoon24479 {

    static ArrayList<Integer>[] A;
    static boolean[] visited;

    static int[] order;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //첫째 줄 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //정점의 수
        int M = Integer.parseInt(st.nextToken()); //간선의 수
        int R = Integer.parseInt(st.nextToken()); //시작 정점

        A = new ArrayList[N+1];

        for(int i = 1; i <= N; i++){
            A[i] = new ArrayList<Integer>();
        }

        visited = new boolean[N+1];

        order = new int[N+1];

        //간선 입력받기
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            A[a].add(b);
            A[b].add(a);
        }

        //오름차순으로 정렬하기
        for(int i = 1; i <= N; i++){
            Collections.sort(A[i]);
        }

        DFS(R);

        for(int i = 1; i <= N; i++){
            bw.write(order[i] + "\n");
        }

        bw.flush();
        bw.close();

    }

    static void DFS(int s){
        if(visited[s]){
            return;
        } else{
            visited[s] = true;
            count++;
            order[s] = count;
            for(int r : A[s]){
                if(!visited[r])
                    DFS(r);
            }
        }
    }

}