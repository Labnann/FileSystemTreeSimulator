public abstract class FileSystemElement implements ClickableNode {
    String name;
    String type;

    FileSystemElement(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getData() {
        return ("Name: " + this.name + ", Type: " + this.type);
    }


    @Override
    public void singleClick() {
        System.out.println("Name: " + this.name + ", Type: " + this.type);
    }

    public abstract void doubleClick();
}
