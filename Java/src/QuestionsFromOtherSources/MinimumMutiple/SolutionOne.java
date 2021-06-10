package QuestionsFromOtherSources.MinimumMutiple;

/**
 * @author: haixuanguo
 * @date: 4/23/21 12:16 PM
 */
public class SolutionOne {
    public static int minimumMultiple(int n){
        int m = 1;

        while(m * 10 < n){
            m *= 10;
        }

        while(Integer.toString(m).length() <= 25){
            if(m >= n && m % n == 0) return m;

            m = binaryAddition(m);
        }

        return -1;
    }

    public static int binaryAddition(int m){ //11000
        int carry = 1;//100
        while(m >= carry){
            if((m / carry & 1) == 0){
                m += carry;
                return m;
            }
            carry *= 10;
            m = m / carry * carry; //11/10 * 10 = 10

        }

        m = carry;
        return m;
    }

    public static void main(String[] args) {
        int[] inputs = {11111,1,3,4};
        int[] outputs = {11111,1, 111, 100};

        for(int i = 0; i < inputs.length; i++){
            int result = minimumMultiple(inputs[i]);

            if(result == outputs[i]){
                System.out.println(inputs[i] + "-" + outputs[i] + "-" + result + ": test pass");
            }else{
                System.out.println(inputs[i] + "-" + outputs[i] + "-" + result + ": test fail");
            }
//            break;
        }
    }
}
