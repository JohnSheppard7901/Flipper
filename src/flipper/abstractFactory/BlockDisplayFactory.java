package flipper.abstractFactory;

public class BlockDisplayFactory implements DisplayFactory{
    @Override
    public DisplayProduct createDisplay() {
        return new BlockDisplayProduct();
    }
}
