package com.company.example;

public class Planet extends SolarSystem {
    public Planet(String name, int orbitalSpeed) {
        super(name, orbitalSpeed, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(SolarSystem moons) {
        if (moons.getKey().getBodyTypes() == BodyTypes.MOON) {
            return super.addSatellite(moons);
        } else {
            return false;
        }
    }
}
