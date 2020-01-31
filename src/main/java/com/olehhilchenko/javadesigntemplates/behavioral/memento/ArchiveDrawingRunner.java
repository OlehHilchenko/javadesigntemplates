package main.java.com.olehhilchenko.javadesigntemplates.behavioral.memento;

public class ArchiveDrawingRunner {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        Store store = new Store();
        try {
            System.out.println("New drawing, ver. 1");
            drawing.setVersionAndDate("Version 1");

            System.out.println(drawing);

            System.out.println("Saving current version to Store......");
            store.setArchive(drawing.archive());

            System.out.println("Modify the drawing to ver. 2");
            Thread.sleep(5000);
            System.out.println("Doubtful modifications....");
            drawing.setVersionAndDate("Version 2");

            System.out.println(drawing);

            System.out.println("Doubtful modifications not approved......");
            System.out.println("Back to Version 1");
            drawing.extract(store.getArchive());

            System.out.println("drawing after rollback...");
            System.out.println(drawing);
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
