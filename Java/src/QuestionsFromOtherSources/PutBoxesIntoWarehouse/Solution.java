package QuestionsFromOtherSources.PutBoxesIntoWarehouse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author: haixuanguo
 * @date: 5/12/21 2:48 PM
 */
public class Solution {
    public static int putBoxesIntoWarehouse(int[] boxes, int[] warehouse){
        Arrays.sort(boxes);

        int room = 0;
        for(int i = boxes.length - 1; i >= 0; i--){
            if(boxes[i] <= warehouse[room]){
                room++;
            }
            if(room >= warehouse.length){
                return room;
            }
        }
        return room;

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
