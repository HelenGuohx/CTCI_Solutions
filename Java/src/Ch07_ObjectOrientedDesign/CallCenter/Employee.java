package Ch07_ObjectOrientedDesign.CallCenter;

/**
 * @author: haixuanguo
 * @date: 4/24/21 8:41 PM
 */
public abstract class Employee {
    Rank rank;
    Call currentCall;
    public void receiveCall(Call call){
        currentCall = call;
    }
    public void completeCall(){
        currentCall = null;
    }
    public void escalateCall(){
        currentCall.incrementRank();
    }

    public Call getCurrentCall() {
        return currentCall;
    }
    public Rank getRank(){
        return rank;
    }

    public boolean isFree(){
        return currentCall == null;
    }
}
