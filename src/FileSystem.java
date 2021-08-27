interface FileSystemElement {
    void singleClick();
    void doubleClick();
    String getData();
}


interface ExpandableElement extends FileSystemElement {
    void add(FileSystemElement fileSystemElement);
    void remove(FileSystemElement fileSystemElement);
}


