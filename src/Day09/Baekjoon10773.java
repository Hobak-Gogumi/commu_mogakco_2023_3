package Day09;

import java.io.*;
import java.util.Stack;

public class Baekjoon10773 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int K = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < K; i++){
            int n = Integer.parseInt(br.readLine());

            if(n == 0){
                stack.pop();
            } else{
                stack.push(n);
            }
        }

        int size = stack.size();
        int sum = 0;
        for(int i = 0; i < size; i++){
           sum += stack.pop();
        }

        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }

}
