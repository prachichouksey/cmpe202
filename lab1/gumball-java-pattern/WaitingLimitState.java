

public class WaitingLimitState implements State {
    GumballMachine gumballMachine;
 
    public WaitingLimitState(GumballMachine gumballMachine) {
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
        
    }
 
    public void ejectQuarter() {
        System.out.println("Can't return your coin");
    }
 
    public void turnCrank() {
        System.out.println("You turned, but haven't payed enough. Insert more coins");
     }
 
    public void dispense() {
        System.out.println("You need to insert more coins");
    } 
 
    public String toString() {
        return "waiting for quarter";
    }
}
