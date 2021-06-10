package QuestionsFromOtherSources.MeetingScheduler;

import Ch02_LinkedList.Q2_2_ReturnKthToLast.Node;

import java.util.Arrays;

/**
 * @author: haixuanguo
 * @date: 4/29/21 12:50 PM
 */
public class SolutionTwo {
    public static int[] meetingScheduler(int[][] slots1, int[][] slots2, int duration){

        int[][] slots = new int[slots1.length + slots2.length][2];
        int k = 0;
        for(int i = 0; i < slots1.length; i++){
            slots[k++] = slots1[i];
        }
        for(int i = 0; i < slots2.length; i++){
            slots[k++] = slots2[i];
        }

        Arrays.sort(slots, (a, b) -> (a[0] == b[0])? a[1] - b[1] : a[0] - b[0] );

        for(int i = 1; i < slots.length; i++){
            if(slots[i][0] < slots[i - 1][1]){
                int time_range = Math.min(slots[i][1], slots[i - 1][1]) - slots[i][0];
                if(time_range >= duration){
                    return new int[]{slots[i][0], slots[i][0] + duration};
                }
            }
        }
        return new int[]{};
    }


}
