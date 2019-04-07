public class SpaceDecorator implements IDisplayDecorator {

    IDisplayComponent creditCardNum;
    SpaceDecorator(IDisplayComponent CreditCardNum)
    {
        this.creditCardNum=CreditCardNum;
    }
    @Override
    public String decorateDisplay() {
        String content=creditCardNum.display();
        StringBuilder cardNumber = new StringBuilder();
        if (content.equals(""))
            cardNumber.append("[4444 4444 4444 4444]" + "  ");
         else  {
            cardNumber.append("[");
            for(int index=0;index<content.length();index++) {
                if(index==4 || index==8 || index==12)
                    cardNumber.append(" " + content.charAt(index));
                else
                    cardNumber.append( content.charAt(index));
            }
            cardNumber.append("]  ");
            System.err.println("Content : "+content);
        }
        return cardNumber.toString();

    }
    @Override
    public void setDecorator(IDisplayComponent decorated) {
        this.creditCardNum=decorated;

    }
    public void key(String ch, int cnt) {
        ((CreditCardNum) creditCardNum).key(ch,cnt);

    }

    @Override
    public void setNext(IKeyEventHandler next) {
        ((CreditCardNum) creditCardNum).setNext(next);
    }


    public String display() {
        return decorateDisplay();
    }


    public void addSubComponent(IDisplayComponent c) {

    }
}
