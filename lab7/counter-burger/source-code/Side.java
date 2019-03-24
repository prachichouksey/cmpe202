
/**
 * Write a description of class Side here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Side extends LeafDecorator
{
    // instance variables - replace the example below with your own
    private String[] options;

    /**
     * Constructor for objects of class Side
     */
    public Side(String d)
    {
        // initialise instance variables
        super(d);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setOptions( String[] options )
    {
        this.options = options ;
        if ( options.length > 0 )
        {
           this.price += options.length * 3.00 ;
        }
    }
    
    public String getDescription() 
    {
        String desc = "";
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) 
                desc += " + " + options[i] ;
            else 
                desc = options[i] ;
        }        
        return desc + "\n" ;
    }
    
}
