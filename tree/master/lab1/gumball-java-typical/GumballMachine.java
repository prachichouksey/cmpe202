
public class GumballMachine
{

    private int num_gumballs;
    private boolean has_quarter;
    private int state;
    private int limit;
    private String type;
    public GumballMachine( int size,String type)
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
        this.type=type;
        state=0;
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

    public void insertQuarter(int coin)
    {
        
        if (coin == 25 &&(type=="quarter50"|| type=="quarter25"))
        {
            state=state+25;
        }
           else
                state=state+coin;
        if(state>=limit)
            this.has_quarter=true;
        
             
    }
    
    public void turnCrank()
    {
        if ( this.has_quarter==true && state>=limit)
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_quarter = false ;
                System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
                state=0;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else 
        {
            System.out.println( "Please insert more coins" ) ;
        }        
    }
}
