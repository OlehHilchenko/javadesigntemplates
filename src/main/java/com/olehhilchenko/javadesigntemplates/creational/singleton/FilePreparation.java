package main.java.com.olehhilchenko.javadesigntemplates.creational.singleton;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

public class FilePreparation {
    private static FilePreparation filePreparation;
    private static Queue<String> queueList;
    private static String pathFile;


    private FilePreparation() {
    }

    public static FilePreparation getFilePreparation(){
        if(filePreparation == null){
            filePreparation = new FilePreparation();
        }

        return filePreparation;
    }

    public String getPathFile (){
        return pathFile;
    }
    public void setPathFile (String pathFile){
        this.pathFile = pathFile;
    }

    public void setQueueList (LinkedList<String> queueList){
        this.queueList = queueList;
    }

    public String getFileName() {
        return queueList.poll();
    }

    public static int getSizeQueueList() {
        return queueList.size();
    }

    public LinkedList<String> getFileList() {
        File file = new File(pathFile);
        LinkedList<String> linkedList = new LinkedList<>();

        if (file.isDirectory()) {
            System.out.println("is a directory");

            String fileList[] = file.list();
            for (String element : fileList) {
                linkedList.add(element);
            }


            for (String s1 : fileList)
                System.out.println(s1);

            System.out.println();
            return linkedList;
        }
        return null;
    }
}