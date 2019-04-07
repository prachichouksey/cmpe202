public interface IDisplayDecorator extends IDisplayComponent, IKeyEventHandler{
    String decorateDisplay();
    void setDecorator(IDisplayComponent component);
}
