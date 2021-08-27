public class File implements ClickableNode {

    String name;
    String type;

    File(String  name, String type){
        this.name = name;
        this.type = type;
    }

    @Override
    public String getData() {
        return "Name: "+this.name+", Type: "+this.type;
    }

    @Override
    public void singleClick() {
        System.out.println();
    }

    @Override
    public void doubleClick() {

    }
}


