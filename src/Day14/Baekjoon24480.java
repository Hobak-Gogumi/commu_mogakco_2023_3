package Day14;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Baekjoon24480 {

    static ArrayList<Integer>[] A;
    static boolean[] visited;

    static int[] order;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //첫번째 줄 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        A = new ArrayList[N+1];
        visited = new boolean[N+1];
        order = new int[N+1];

        for(int i = 1; i <= N; i++){
            A[i] = new ArrayList<Integer>();
        }

        //간선 정보 입력
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            A[u].add(v);
            A[v].add(u);
        }

        //내림차순 정렬
        for(int i = 1; i <= N; i++){
            Collections.sort(A[i], Collections.reverseOrder());
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