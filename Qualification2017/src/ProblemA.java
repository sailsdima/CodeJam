/**
 * Created by sails on 08.04.2017.
 */

//Problem A. Oversized Pancake Flipper

public class ProblemA {

    private boolean checkAllSmile(char[] str) {
        for (char c : str) {
            if (!"+".equals(c))
                return false;
        }
        return true;
    }

    private char[] flipFromCoord(char[] str, int range, int startCoord) {
        if (range + startCoord > str.length)
            return str;

        for (int i = 0; i < range; i++) {
            int c = startCoord + i;
            if (str[c] == '+')
                str[c] = '-';
            else if (str[c] == '-')
                str[c] = '+';
        }
        return str;
    }

    public int solve(char[] str, int range) {
        int count = 0;
        for(int i = 0; i < str.length; i++){
            if(str[i] == '-'){
                flipFromCoord(str, range, i);
                count++;

            }
        }
        for(int i = 0; i < str.length; i++){
            if(str[i] == '-'){
               return -1;
            }
        }

        return count;
    }

}
