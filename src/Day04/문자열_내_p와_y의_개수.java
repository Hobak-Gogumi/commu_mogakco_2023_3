package Day04;

public class 문자열_내_p와_y의_개수 {

    class Solution {
        boolean solution(String s) {

            int p_count = 0;
            int y_count = 0;

            for(int i = 0; i < s.length(); i++){
                if((s.charAt(i) == 'P') || (s.charAt(i) == 'p'))
                    p_count++;
                else if((s.charAt(i) == 'Y') || (s.charAt(i) == 'y'))
                    y_count++;
            }

            if(p_count != y_count)
                return false;
            else
                return true;

        }
    }

}