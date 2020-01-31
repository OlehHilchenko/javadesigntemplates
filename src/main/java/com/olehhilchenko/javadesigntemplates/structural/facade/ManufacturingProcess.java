package main.java.com.olehhilchenko.javadesigntemplates.structural.facade;

public class ManufacturingProcess {

    Job job = new Job();
    Locksmith locksmith = new Locksmith();
    Welder welder = new Welder();

    public void doJob(){
        job.productManufacturing();
        locksmith.receiptOfWorkpiece();
        locksmith.blankPreparation();
        welder.preWeldingPreparation();
        welder.weldingWork();
        locksmith.treatment();
    }
}
