public class Main {
    public static void main(String[] args) {
        ClickableNode readmeFile = new File("readme.md","MarkDown");
        ClickableNode configFile = new File("config.ts","TypeScript");
        ClickableInnerNode projectFolder = new Folder("Project","Folder");
        projectFolder.add(readmeFile);

        ClickableInnerNode mainFolder = new Folder("Main","Folder");
        projectFolder.add(mainFolder);

        mainFolder.add(new File("data1.ts","Typescript"));
        mainFolder.add(new File("Data2.ts","Typescript"));

        ClickableInnerNode mainSubFolder = new Folder("Extra","Typescript");
        mainSubFolder.add(new File("SubFile1.fl","Fl"));
        mainSubFolder.add(new File("SubFile2.fl","Fl"));
        mainSubFolder.add(new File("SubFile3.fl","Fl"));
        mainFolder.add(mainSubFolder);

        projectFolder.add(new File("start.exe","Executable"));

        System.out.println(projectFolder.getData());
    }
}


