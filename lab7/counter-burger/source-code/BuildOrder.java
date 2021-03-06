  

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
        CustomBurger customBurger1 = new CustomBurger( "Build Your Own Burger" ) ;
        Burger b1 = new Burger( "Burger Options" ) ;
        String[] bo = { "Organic Bison*", "1/2lb.", "On A Bun" } ;
        b1.setOptions( bo ) ;
        Cheese c1 = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jalapeno Jack" } ;
        c1.setOptions( co ) ;
        c1.wrapDecorator( b1 ) ;
        PremiumCheese pc1 = new PremiumCheese( "Premium Cheese Options" );
        String[] pco = { "Danish Blue Cheese" };
        pc1.setOptions( pco );
        pc1.wrapDecorator( c1 ) ;
        Toppings t1 = new Toppings( "Toppings Options" ) ;
        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles" } ;
        t1.setOptions( to ) ;
        t1.wrapDecorator( pc1 ) ;
        PremiumToppings p1 = new PremiumToppings( "Premium Topping Options" ) ;
        String[] po = { "Marinated Tomatoes" } ;
        p1.setOptions( po ) ;
        p1.wrapDecorator( t1 ) ;
        Sauce s1 = new Sauce( "Sauce Options" ) ;
        String[] so = { "Mayonnaise" , "Thai Peanut Sauce" } ;
        s1.setOptions( so ) ;
        s1.wrapDecorator( p1 ) ;
        Bun bun1 = new Bun( "Bun Options" ) ;
        String[] bunOption = { "Ciabatta(Vegan)" };
        bun1.setOptions( bunOption ) ;
        bun1.wrapDecorator( s1 ) ;
        Side side1 = new Side( "Side Options" ) ;
        String[] sideOptions = { "Shoestring Fries" } ;
        side1.setOptions( sideOptions ) ;
        side1.wrapDecorator( bun1 ) ;
        customBurger1.setDecorator( side1 ) ;
        customBurger1.addChild( b1 ) ;
        customBurger1.addChild( c1 ) ;
        customBurger1.addChild( pc1 ) ;
        customBurger1.addChild( s1 ) ;
        customBurger1.addChild( t1 ) ;
        customBurger1.addChild( p1) ;
        customBurger1.addChild( bun1 ) ;
        customBurger1.addChild( side1 ) ;
        
        CustomBurger customBurger2 = new CustomBurger( "Build Your Own Burger" ) ;
        Burger b2 = new Burger( "Burger Options" ) ;
        String[] bo2 = { "Hormone & Antibiotic Free Beef*", "1/3lb.", "On A Bun" } ;
        b2.setOptions( bo2 ) ;
        Cheese c2 = new Cheese( "Cheese Options" ) ;
        String[] co2 = {  "Smoked Gouda", "Greek Feta" } ;
        c2.setOptions( co2 ) ;
        c2.wrapDecorator( b2 ) ;
        PremiumCheese pc2 = new PremiumCheese( "Premium Cheese Options" );
        String[] pco1 = { "Fresh Mozzarella" };
        pc2.setOptions( pco1 );
        pc2.wrapDecorator( c2 ) ;
        Toppings t2 = new Toppings( "Toppings Options" ) ;
        String[] to2 = { "Crushed Peanuts" } ;
        t2.setOptions( to2 ) ;
        t2.wrapDecorator( pc2 ) ;
        PremiumToppings p2 = new PremiumToppings( "Premium Topping Options" ) ;
        String[] po2 = { "Sunny Side Up Egg*" , "Marinated Tomatoes" } ;
        p2.setOptions( po2 ) ;
        p2.wrapDecorator( t2 ) ;
        Sauce s2 = new Sauce( "Sauce Options" ) ;
        String[] so2 = { "Habanero Salsa" } ;
        s2.setOptions( so2 ) ;
        s2.wrapDecorator( p2 ) ;
        Bun bun2 = new Bun( "Bun Options" ) ;
        String[] bunOption2 = { "Gluten-Free Bun" };
        bun2.setOptions( bunOption2 ) ;
        bun2.wrapDecorator( s2 ) ;
        Side side2 = new Side( "Side Options" ) ;
        String[] sideOptions2 = { "Shoestring Fries " } ;
        side2.setOptions( sideOptions2 ) ;
        side2.wrapDecorator( bun2 ) ;
        customBurger2.setDecorator( side2 ) ;
        customBurger2.addChild( b2 ) ;
        customBurger2.addChild( c2 ) ;
        customBurger2.addChild( pc2 ) ;
        customBurger2.addChild( s2 ) ;
        customBurger2.addChild( t2) ;
        customBurger2.addChild( p2 ) ;
        customBurger2.addChild( bun2 ) ;
        customBurger2.addChild( side2 ) ;
        order.addChild( customBurger1 );
        order.addChild( customBurger2 );
        return order;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/