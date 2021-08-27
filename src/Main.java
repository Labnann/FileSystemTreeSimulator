public class Main {
    public static void main(String[] args) {


        FileSystemElement strategy = new File("Strategy Pattern", "ppt");
        FileSystemElement observer = new File("Observer Pattern", "pdf");
        FileSystemElement midSyllabus = new File("Mid Syllabus", "doc");
        FileSystemElement composite = new File("Composite Pattern", "ppt");
        FileSystemElement finalSyllabus = new File("Final Syllabus", "pdf");
        FileSystemElement assignment1 = new File("Assignment-1", "pdf");
        FileSystemElement assignment2 = new File("Assignment-2", "pdf");
        FileSystemElement readME = new File("readME", "text");
        ExpandableElement midExam = new Folder("Mid Exam", "Folder");
        ExpandableElement finalExam = new Folder("Final Exam", "Folder");

        ExpandableElement Lectures = new Folder("Lectures", "Folder");
        ExpandableElement assignments = new Folder("Assignments", "Folder");
        ExpandableElement designPattern = new Folder("Design Pattern", "Folder");

        midExam.add(strategy);
        midExam.add(observer);
        midExam.singleClick();
        midExam.doubleClick();


        midExam.add(midSyllabus);
        finalExam.add(composite);
        finalExam.add(finalSyllabus);
        Lectures.add(midExam);
        Lectures.add(finalExam);
        assignments.add(assignment1);
        assignments.add(assignment2);
        designPattern.add(Lectures);
        designPattern.add(readME);
        designPattern.add(assignments);
        designPattern.singleClick();


        designPattern.doubleClick();


        designPattern.remove(readME);
        designPattern.doubleClick();


    }
}


