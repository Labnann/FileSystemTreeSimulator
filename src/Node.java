interface Node {
    String  getData();
}


interface InnerNode extends Node{
    void addChild(Node node);
    void removeChild(Node node);
}


