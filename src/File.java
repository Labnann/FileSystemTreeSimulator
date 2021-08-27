public class File extends FileSystemEntity {


    File(String name, String type) {
        super(name, type);
    }


    @Override
    public void doubleClick() {
        System.out.println(this.name + "is opened");
        System.out.println();
    }
}


