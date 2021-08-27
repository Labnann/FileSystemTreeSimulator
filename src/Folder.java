import java.util.ArrayList;
import java.util.List;


public class Folder extends FileSystemEntity implements ExpandableElement {

    List<FileSystemElement> fileSystemElements = new ArrayList<>();

    Folder(String  name, String type){
        super(name,type);
    }


    @Override
    public void add(FileSystemElement fileSystemElement) {
        fileSystemElements.add(fileSystemElement);
    }

    @Override
    public void remove(FileSystemElement fileSystemElement) {
        fileSystemElements.remove(fileSystemElement);
    }


    @Override
    public void doubleClick() {
        System.out.println(super.name +" Folder is opened.");
        System.out.println("Contents: ");
        for(FileSystemElement fileSystemElement: fileSystemElements){
            System.out.println(fileSystemElement.getData());
        }
        System.out.println();
    }
}
