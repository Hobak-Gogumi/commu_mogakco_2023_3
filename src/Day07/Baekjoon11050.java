package Day07;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon11050 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int answer = fac(N) / (fac(K) * fac(N-K));

        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }


    static int fac(int x){
        if(x <= 1){
            return 1;
        }
        return x * fac(x-1);
    }
}
