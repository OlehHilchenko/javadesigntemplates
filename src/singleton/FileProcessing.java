package singleton;

import java.io.File;
import java.util.concurrent.Semaphore;

public class FileProcessing implements Runnable {
    Semaphore sem;
    String name;
    Thread t;
    String fullFileName;

    FileProcessing(Semaphore s, String threadName){
        sem = s;
        name = threadName;
        t = new Thread(this, name);
        System.out.println("new thread: " + t);
        t.start();
    }

    @Override
    public void run() {
        int size = FilePreparation.getSizeQueueList();
        do {
            try {
                sem.acquire();
                fullFileName = FilePreparation.getFilePreparation().getFileName();
                if (fullFileName != null) {
                    String fullPathFile = FilePreparation.getFilePreparation().getPathFile() + "/" + fullFileName;
                    File file = new File(fullPathFile);
                    if (file.isDirectory()) {
                        System.out.println(name + " iterate: " + "this is a directory: " + file.getName());
                    } else {
                        String exp = "";

                        boolean trig = false;
                        for (int j = 0; j < fullFileName.length(); j++) {
                            if (fullFileName.charAt(j) == '.')
                                trig = true;

                            if (trig) {
                                exp += fullFileName.charAt(j);
                            }
                        }
                        System.out.println(name + " iterate: " + fullFileName + " " + "form: " + exp + " size: " + file.length());
                    }
                }
                sem.release();
                size = FilePreparation.getSizeQueueList();
            }catch (InterruptedException e) {
                System.out.println(e);
            }
        }while (size > 0);
    }
}
