public class Main {
    public static void main(String[] args) {
        Node readmeFile = new File("readme.md");
        Node configFile = new File("config.ts");
        InnerNode projectFolder = new Folder("Project");
        projectFolder.addChild(readmeFile);

        InnerNode mainFolder = new Folder("Main");
        projectFolder.addChild(mainFolder);

        mainFolder.addChild(new File("data1.ts"));
        mainFolder.addChild(new File("Data2.ts"));

        InnerNode mainSubFolder = new Folder("Extra");
        mainSubFolder.addChild(new File("SubFile1.fl"));
        mainSubFolder.addChild(new File("SubFile2.fl"));
        mainSubFolder.addChild(new File("SubFile3.fl"));
        mainFolder.addChild(mainSubFolder);

        projectFolder.addChild(new File("start.exe"));

        System.out.println(projectFolder.getData());
    }
}


