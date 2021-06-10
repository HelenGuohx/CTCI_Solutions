package Ch07_ObjectOrientedDesign.CallCenter;

/**
 * @author: haixuanguo
 * @date: 4/24/21 8:43 PM
 */
public enum Rank {
    Respondent (0),
    Manager (1),
    Director (2);

    private int value;


    Rank(int v) {
        value = v;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
