package main.java.com.olehhilchenko.javadesigntemplates.structural.composite;

public class FlightRunner {

    public static void main(String[] args) {

        AviatorTeam aviatorTeam = new AviatorTeam();
        Aviator firstPilot = new Pilot();
        Aviator secondPilot = new Pilot();
        Aviator aircraftMechanic = new AircraftMechanic();

        aviatorTeam.addAviator(firstPilot);
        aviatorTeam.addAviator(secondPilot);
        aviatorTeam.addAviator(aircraftMechanic);
        aviatorTeam.flight();
    }
}
