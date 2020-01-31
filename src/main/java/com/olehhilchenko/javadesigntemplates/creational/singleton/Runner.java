package main.java.com.olehhilchenko.javadesigntemplates.creational.singleton;


import java.util.concurrent.Semaphore;

public class Runner {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        FilePreparation.getFilePreparation().setPathFile(ScanPathFile.scanPathFile());
        FilePreparation.getFilePreparation().setQueueList(FilePreparation.getFilePreparation().getFileList());

        Semaphore semaphore = new Semaphore(1, true);

        FileProcessing fileProcessing = new FileProcessing(semaphore,"One");
        FileProcessing fileProcessing2 =new FileProcessing(semaphore,"Two");
        FileProcessing fileProcessing3 =new FileProcessing(semaphore,"Three");

        try {
            fileProcessing.t.join();
            fileProcessing2.t.join();
            fileProcessing3.t.join();
        }catch (InterruptedException e){
            System.out.println("main thread interrupted");
        }

        System.out.println("end main thread ");
        long endTime = System.currentTimeMillis();
        System.out.println(startTime);
        System.out.println(endTime);
    }
}
