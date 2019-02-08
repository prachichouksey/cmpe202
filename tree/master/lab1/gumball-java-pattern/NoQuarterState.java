

public class NoQuarterState implements State {
    GumballMachine gumballMachine;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertQuarter(int value) {
        System.out.println("You inserted a quarter");
        int newValue=0;
        if ((value == 25 &&(gumballMachine.getType()=="quarter50"|| gumballMachine.getType()=="quarter25"))
        ||gumballMachine.getType()=="any50")
        {
            newValue=gumballMachine.getCurrentValue()+value;
            gumballMachine.setCurrentValue(newValue);
        }
        
        if(gumballMachine.getCurrentValue()>=gumballMachine.getLimit())
        {   
            gumballMachine.setState(gumballMachine.getHasQuarterState());
        }
        else
        {
            gumballMachine.setState(gumballMachine.getWaitingLimitState());
        }
    }
 
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }
 
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
     }
 
    public void dispense() {
        System.out.println("You need to pay first");
    } 
 
    public String toString() {
        return "waiting for quarter";
    }
}
