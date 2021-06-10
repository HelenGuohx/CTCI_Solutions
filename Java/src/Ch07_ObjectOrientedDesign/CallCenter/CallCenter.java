package Ch07_ObjectOrientedDesign.CallCenter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author: haixuanguo
 * @date: 4/24/21 8:52 PM
 */
public class CallCenter {
    public final int LEVELS = 3;
    public final int NUM_RESPONDENT = 10;
    public final int NUM_MANAGER = 5;
    public final int NUM_DIRECTOR = 3;

    List<List<Employee>> employeeTable;
    List<List<Call>> callWaitingList;

    public CallCenter(){
        employeeTable = new ArrayList<>(LEVELS);
        callWaitingList = new ArrayList<>(LEVELS);

        List<Employee> respondents = new ArrayList<>(NUM_RESPONDENT);
        for(int i = 0; i < NUM_RESPONDENT; i++){
            respondents.add(new Respondent());
        }
        employeeTable.add(respondents);

        List<Employee> managers = new ArrayList<>(NUM_MANAGER);
        for(int i = 0; i < NUM_MANAGER; i++){
            managers.add(new Manager());
        }
        employeeTable.add(managers);

        List<Employee> directors = new ArrayList<>(NUM_DIRECTOR);
        for(int i = 0; i < NUM_DIRECTOR; i++){
            directors.add(new Director());
        }
        employeeTable.add(directors);

    }
    public Employee getFirstFreeHandle(Call call){
        for(int level = call.getRank().getValue(); level < LEVELS; level++){
            for(Employee emp: employeeTable.get(level)){
                if(emp.isFree()){
                    return emp;
                }
            }
        }

        return null;
    }


    //a call arrives, dispatch the call to corresponding employee the rank of call
    public void dispatchCall(Call call){
        Employee emp = getFirstFreeHandle(call);
        if(emp != null){
            emp.receiveCall(call);
            call.setHandler(emp);
        }else{
            call.reply("Please wait for free employ to reply");
            callWaitingList.get(call.getRank().getValue()).add(call);
        }

    }

    //when an employee is free, assign call
    public boolean assignCall(Employee emp){
        for(int level = emp.getRank().getValue(); level >= 0; level--) {
            List<Call> waitingList = callWaitingList.get(level);
            while (!waitingList.isEmpty()) {
                Call call = waitingList.remove(0);
                emp.receiveCall(call);
                call.setHandler(emp);
                return true;
            }

        }
        return false;
    }
}
