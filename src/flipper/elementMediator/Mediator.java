package flipper.elementMediator;

import flipper.element.Element;

public interface Mediator {
    void notify(Element element, String event);
}
