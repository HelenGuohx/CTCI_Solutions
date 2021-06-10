package QuestionsFromOtherSources.MeetingScheduler;

import java.util.Arrays;

/**
 * @author: haixuanguo
 * @date: 4/29/21 10:19 AM
 */
public class SolutionOne {
    public static int[] meetingScheduler(int[][] slots1, int[][] slots2, int duration){
        Arrays.sort(slots1, (a, b) -> a[0] - b[0]);
        Arrays.sort(slots2, (a, b) -> a[0] - b[0]);

        int i = 0;
        int j = 0;

        while(i < slots1.length && j < slots1.length){
            int lower = Math.max(slots1[i][0], slots2[j][0]);
            int upper = Math.min(slots1[i][1], slots2[j][1]);
            if(upper - lower >= duration){
                return new int[]{lower, lower + duration};
            }
            if(slots1[i][1] < slots2[j][1]){
                i++;
            }else{
                j++;
            }
        }

        return new int[]{};
    }
}
