interface Clickable{
    void singleClick();
    void doubleClick();
}

interface ClickableNode extends Clickable {
    String  getData();
}


interface ClickableInnerNode extends ClickableNode {
    void add(ClickableNode clickableNode);
    void remove(ClickableNode clickableNode);
}


