package Day08;

import java.io.*;
import java.util.LinkedList;

public class Baekjoon2164 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 1; i <= N; i++){
            list.add(i);
        }

        while(list.size() > 1){
            list.remove();

            int n = list.remove();
            list.add(n);
        }

        bw.write(list.get(0) + "\n");
        bw.flush();
        bw.close();

    }

}