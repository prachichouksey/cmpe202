

public class GumballMachine {
 
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State waitingLimitState;
 
    State state = soldOutState;
    int count = 0,limit=0,currentValue=0;
    String type;
    public GumballMachine(int numberGumballs,String type) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        waitingLimitState = new WaitingLimitState(this);
        this.currentValue=0;
        this.count = numberGumballs;
        this.type=type;
        if (numberGumballs > 0) {
            state = noQuarterState;
        } 
        switch(type)
        {
            case "quarter25":limit=25;
                             break;
            case "quarter50":limit=50;
                             break;
            case "any50"    :limit=50;
                             break;
            default:         limit=0;
                             break;
        }
    }
 
    public void insertQuarter(int value) {
        
        state.insertQuarter(value);
    }
 
    public void ejectQuarter() {
        state.ejectQuarter();
    }
 
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }
 
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }
 
    int getCount() {
        return count;
    }
    int getCurrentValue()
    {
        return currentValue;
    }
    String getType()
    {
        return type;
    }
    int getLimit()
    {
        return limit;
    }
    void setCurrentValue(int currentValue)
    {
        this.currentValue=currentValue;
    }
   
    void refill(int count) {
        this.count = count;
        state = noQuarterState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }
    public State getWaitingLimitState(){
        return waitingLimitState;
    }
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + this.count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + this.state + "\n");
        return result.toString();
    }
}
