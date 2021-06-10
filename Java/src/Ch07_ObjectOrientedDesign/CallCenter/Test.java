package Ch07_ObjectOrientedDesign.CallCenter;

/**
 * @author: haixuanguo
 * @date: 4/24/21 9:25 PM
 */
public class Test {
    public static void main(String[] args) {
        CallCenter callCenter = new CallCenter();

        callCenter.dispatchCall(new Call());
        callCenter.dispatchCall(new Call());

    }
}
