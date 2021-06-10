package Ch07_ObjectOrientedDesign.CallCenter;

/**
 * @author: haixuanguo
 * @date: 4/24/21 8:45 PM
 */
public class Call {
    private Employee handler;
    private Rank rank;

    public Call(){
        rank = Rank.Respondent;
    }
    public Employee getHandler() {
        return handler;
    }

    public void setHandler(Employee handler) {
        this.handler = handler;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(int value) {
        this.rank.setValue(value);
    }

    public void incrementRank(){
        if(rank == Rank.Respondent){
            rank = Rank.Manager;
        }else if(rank == Rank.Manager){
            rank = Rank.Director;
        }
    }

    public void reply(String message){
        System.out.println(message);
    }
}
