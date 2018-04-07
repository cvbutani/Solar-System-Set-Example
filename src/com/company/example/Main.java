package com.company.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<SolarSystem.Key, SolarSystem> solarSystemMap = new HashMap<>();
    private static Set<SolarSystem> solarSystemSet = new HashSet<>();

    public static void main(String[] args) {
        SolarSystem system = new Planet("Earth", 365);
        solarSystemMap.put(system.getKey(), system);
        solarSystemSet.add(system);

        SolarSystem systemMoon = new Moon("Moon of Earth", 76);
        solarSystemMap.put(systemMoon.getKey(), systemMoon);
        system.addSatellite(systemMoon);

        system = new Planet("Jupiter", 85);
        solarSystemMap.put(system.getKey(), system);
        solarSystemSet.add(system);

        systemMoon = new Moon("Io", 18);
        solarSystemMap.put(systemMoon.getKey(), systemMoon);
        system.addSatellite(systemMoon);

        systemMoon = new Moon("Europa", 35);
        solarSystemMap.put(systemMoon.getKey(), systemMoon);
        system.addSatellite(systemMoon);

        systemMoon = new Moon("Ganymede", 71);
        solarSystemMap.put(systemMoon.getKey(), systemMoon);
        system.addSatellite(systemMoon);

        System.out.println("Planets");
        for (SolarSystem planet : solarSystemSet) {
            System.out.println("\t" + planet.getKey());
        }

        SolarSystem body = solarSystemMap.get(SolarSystem.makeKey("Earth", SolarSystem.BodyTypes.PLANET));
        for (SolarSystem temp : body.getSolarSys()) {
            System.out.println("Earth Moon is as \t" + temp.getKey());
        }

        Set<SolarSystem> moons = new HashSet<>();
        for (SolarSystem moon : solarSystemSet) {
            System.out.println("\t" + moon.getSolarSys());
        }

        System.out.println("All Moons");
        for(SolarSystem moon: moons){
            System.out.println("\t" + moon.getKey());
        }
        SolarSystem earth = new Planet("Earth",320);
        solarSystemSet.add(earth);

        for (SolarSystem planet : solarSystemSet) {
            System.out.println(planet.getKey() + ": " + planet.getOrbitalSpeed());
        }

        solarSystemMap.put(earth.getKey(), earth);
        System.out.println(solarSystemMap.get(SolarSystem.makeKey("Earth", SolarSystem.BodyTypes.PLANET)));
        System.out.println("======================================");
        for (SolarSystem solarSystem : solarSystemMap.values()) {

            System.out.println(solarSystem);
        }
    }
}
