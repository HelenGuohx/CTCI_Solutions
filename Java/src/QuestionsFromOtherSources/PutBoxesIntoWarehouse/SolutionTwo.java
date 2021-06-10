package QuestionsFromOtherSources.PutBoxesIntoWarehouse;

import java.util.Arrays;

/**
 * @author: haixuanguo
 * @date: 5/12/21 3:18 PM
 */
public class SolutionTwo {
    public static int putBoxesIntoWarehouse(int[] boxes, int[] warehouse){
        for(int i = 1; i < warehouse.length; i++){
            if(warehouse[i] > warehouse[i - 1]){
                warehouse[i] = warehouse[i - 1];
            }
        }

        Arrays.sort(boxes);

        int room = warehouse.length - 1;
        int count = 0;
        for(int box: boxes){
            while(room >= 0 && box > warehouse[room]){
                room--;
            }
            if(room < 0) return count;

            if(box <= warehouse[room]){
                count++;
                room--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] boxes = new int[]{1,2,2,3,4};
        int[] warehouse = new int[]{3,4,1,2};
        System.out.println(putBoxesIntoWarehouse(boxes, warehouse));

        boxes = new int[]{4,3,4,1};
        warehouse = new int[]{5,3,3,4,1};
        System.out.println(putBoxesIntoWarehouse(boxes, warehouse));
    }
}
