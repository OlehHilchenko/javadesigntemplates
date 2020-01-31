package main.java.com.olehhilchenko.javadesigntemplates.behavioral.observer;

public class EventRunner {
    public static void main(String[] args) {
        EventAgency eventAgency = new EventAgency();

        eventAgency.addEvent("Paintball");
        eventAgency.addEvent("Laser tag");

        Observer firstParticipant = new Participant("Peter");
        Observer secondParticipant = new Participant("Oleg");
        Observer thirdParticipant = new Participant("Yaroslav");

        eventAgency.addObserver(firstParticipant);
        eventAgency.addObserver(secondParticipant);
        eventAgency.addObserver(thirdParticipant);

        eventAgency.addEvent("Karting");

        eventAgency.removeEvent("Karting");
    }
}
