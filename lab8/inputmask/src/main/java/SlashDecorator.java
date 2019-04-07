public class SlashDecorator implements IDisplayDecorator {

    IDisplayComponent creditCardExp;
    SlashDecorator(IDisplayComponent CreditCardExp)
    {
        this.creditCardExp=CreditCardExp;
    }
    @Override
    public String decorateDisplay() {
        String content=creditCardExp.display();
        StringBuilder cardExpiry = new StringBuilder();
        if (content.equals(""))
            cardExpiry.append("[MM/YY]" + "  ");
         else  {
            cardExpiry.append("[");
            for(int index=0;index<content.length();index++) {
                if(index==2)
                    cardExpiry.append("/" + content.charAt(index));
                else
                    cardExpiry.append( content.charAt(index));
            }
            cardExpiry.append("]  ");
            System.err.println("Content : "+content);
        }
        return cardExpiry.toString();

    }
    @Override
    public void setDecorator(IDisplayComponent decorated) {
        this.creditCardExp=decorated;

    }
    public void key(String ch, int cnt) {
        ((CreditCardExp) creditCardExp).key(ch,cnt);

    }

    @Override
    public void setNext(IKeyEventHandler next) {
        ((CreditCardExp) creditCardExp).setNext(next);
    }


    public String display() {
        return decorateDisplay();
    }


    public void addSubComponent(IDisplayComponent c) {

    }
}
