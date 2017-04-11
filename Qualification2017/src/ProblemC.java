import java.util.*;

/**
 * Created by sails on 08.04.2017.
 */
public class ProblemC {

    public void solve(int num, long stallsCount, long personCount) {
        long[] solution = solve(stallsCount, personCount);

        if (solution[0] < solution[1])
        {
            long tmp = solution[0];
            solution[0] = solution[1];
            solution[1] = tmp;
        }
        System.out.format("Case #%d: %d %d%n", num, solution[0], solution[1]);


    }


    public long[] solve(long stallsCount, long personCount) {

        if (personCount == 1 || personCount == 0)
            return new long[]{(stallsCount - 1) / 2, stallsCount / 2};

        if (personCount % 2 == 0)
            return solve(stallsCount / 2, personCount / 2);

        return solve((stallsCount - 1) / 2, personCount / 2);
    }


}



