import java.util.Arrays;

public class Valley{

    /**
     * Compute the deepest valley and highest mountain
     * @param slopes A non-empty array of slope
     * @return An array of two element. The first is the
     *         depth of the deepest valley and the second
     *         the height of the highest mountain
     */
    public static int[] valley (int[] slopes){

        int [] toReturn = new int[2];
        int current = 0;
        int deepest = slopes[0];
        int highest = slopes[0];



        for(int i = 1 ; i < slopes.length ; i++){


            if( slopes[i] == slopes[i - 1] && slopes[i] == -1 ){
                System.out.println("down");
                highest = 0;
                deepest --;
                if ( -deepest >= toReturn[0] ){ toReturn[0] = deepest; }

            }

            if( slopes[i] == slopes[i - 1] && slopes[i] == 1 ){
                System.out.println("up");
                deepest = 0;
                highest ++;
                if( highest >= toReturn[1] ){ toReturn[1] = highest; }


            }
            if( slopes[i] != slopes[i-1] ){
                highest = 1;
                deepest = 1;
            }
        }
        toReturn[0] = Math.abs(toReturn[0]);

        return toReturn;
    }
}
