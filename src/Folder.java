import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

public class Folder implements InnerNode{
    private final String data;
    List<Node> nodeList = new ArrayList<>();

    Folder(String  data){
        this.data = data;
    }

    @Override
    public String getData() {
        StringBuilder constructedData = new StringBuilder(this.data + " [ ");
        for(Node node: nodeList){
            constructedData.append(node.getData()).append(" , ");
        }

        constructedData.append(" ] ");

        return constructedData.toString();
    }

    @Override
    public void addChild(Node node) {
        nodeList.add(node);
    }

    @Override
    public void removeChild(Node node) {
        nodeList.remove(node);
    }
}
