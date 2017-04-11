import java.util.Arrays;

/**
 * Created by sails on 08.04.2017.
 */

//Problem B. Tidy Numbers

public class ProblemB {

    public long[] getIntArrayFromNumber(long number){
        long[]arr = new long[String.valueOf(Math.abs(number)).length()];
        int i = arr.length;
        while(number>0) {
            arr[--i] = number%10;
            number = number / 10;
        }

        return arr;
    }



    public long solve(long num){
        long[] number = getIntArrayFromNumber(num);

        for(int i = 1; i < number.length; i++){
            if(number[i] < number[i - 1]) {
                if(number[i]==0) {
                    number[i] = 9;
                    number[i-1]--;
                }
                else number[i]--;
                for(int j = i + 1; j < number.length; j++){
                    number[j] = 9;
                }
            }
        }
        System.out.println(Arrays.toString(number));

        return num;
    }

}
