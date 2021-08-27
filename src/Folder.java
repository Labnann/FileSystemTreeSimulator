import java.util.ArrayList;
import java.util.List;

public class Folder extends FileSystemElement implements ClickableInnerNode {

    List<ClickableNode> clickableNodeList = new ArrayList<>();

    Folder(String  name, String type){
        super(name,type);
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
    public void doubleClick() {
        System.out.println(super.name +" Folder is opened.");
        System.out.println("Contents: ");
        for(ClickableNode clickableNode: clickableNodeList){
            System.out.println(clickableNode.getData());
        }
    }
}
