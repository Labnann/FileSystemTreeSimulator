public abstract class FileSystemEntity implements FileSystemElement {
    String name;
    String type;

    FileSystemEntity(String name, String type) {
        this.name = name;
        this.type = type;
    }


    public String getData() {
        return ("Name: " + this.name + ", Type: " + this.type);
    }


    @Override
    public void singleClick() {
        System.out.println("Name: " + this.name + ", Type: " + this.type);
    }

    public abstract void doubleClick();
}
