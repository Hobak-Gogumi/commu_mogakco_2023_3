package Day06;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon1978 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int count = 0;
        boolean isPrimeNumber;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int x = Integer.parseInt(st.nextToken());

            isPrimeNumber = true;

            if(x == 1){
                isPrimeNumber = false;
            } else{
                for(int j = 2; j <= Math.sqrt(x); j++){
                    if((x % j) == 0){
                        isPrimeNumber = false;
                        break;
                    }
                }
            }

            if(isPrimeNumber)
                count++;

        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

}
