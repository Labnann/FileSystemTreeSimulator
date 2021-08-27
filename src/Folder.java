import java.util.ArrayList;
import java.util.List;

public class Folder implements ClickableInnerNode {
    private final String data;
    List<ClickableNode> clickableNodeList = new ArrayList<>();

    Folder(String  name, String type){
        this.data = "Name: "+name+", Type: "+type;
    }

    @Override
    public String getData() {
        StringBuilder constructedData = new StringBuilder(this.data + " : [ ");
        for(ClickableNode clickableNode : clickableNodeList){
            constructedData.append(clickableNode.getData()).append(" ; ");
        }

        constructedData.append(" .. ] ");

        return constructedData.toString();
    }

    @Override
    public void add(ClickableNode clickableNode) {
        clickableNodeList.add(clickableNode);
    }

    @Override
    public void remove(ClickableNode clickableNode) {
        clickableNodeList.remove(clickableNode);
    }

    @Override
    public void singleClick() {

    }

    @Override
    public void doubleClick() {

    }
}
