package flipper.abstractFactory;

public class RetroDisplayFactory implements DisplayFactory{
    @Override
    public DisplayProduct createDisplay() {
        return new RetroDisplayProduct();
    }
}
