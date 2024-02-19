package org.example.Package;

import org.example.Destination.Destination;
import org.example.Passenger.Passenger;

import java.util.List;

public class Package {
    private String name;
    private int pcapacity;
    private List<Destination> destinations;
    private List<Passenger> passengers;

    public Package(String name, int pcapacity, List<Destination> destinations, List<Passenger> passengers) {
        this.name = name;
        this.pcapacity = pcapacity;
        this.destinations = destinations;
        this.passengers = passengers;
    }
}
