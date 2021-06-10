package QuestionsFromOtherSources.MeetingScheduler;

import java.util.Arrays;

/**
 * @author: haixuanguo
 * @date: 4/29/21 1:00 PM
 */
public class Test {
    public static void main(String[] args) {
        int[][] slots1 = {{10,50},{60,120},{140,210}};
        int[][] slots2 = {{0,15},{60,70}};
        int duration = 10;
        int[] output = {60,70};

//        int[][] slots1 = {{10,50}};
//        int[][] slots2 = {{0,15},{60,70}};
//        int duration = 8;
//        int[] output = {};

        int[] result = SolutionOne.meetingScheduler(slots1, slots2, duration);
        if(Arrays.equals(output, result)){
            System.out.println("Solution pass. Answer: " + Arrays.toString(output) + ". Your result: " + Arrays.toString(result));
        }else{
            System.out.println("Solution fail. Answer:  "+ Arrays.toString(output) + ". Your result: " + Arrays.toString(result));
        }

    }
}
