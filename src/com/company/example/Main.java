package com.company.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, SolarSystem> solarSystemMap = new HashMap<>();
    private static Set<SolarSystem> solarSystemSet = new HashSet<>();

    public static void main(String[] args) {
        SolarSystem system = new SolarSystem("Earth", 365);
        solarSystemMap.put(system.getName(), system);
        solarSystemSet.add(system);

        SolarSystem systemMoon = new SolarSystem("Moon", 27);
        solarSystemMap.put(systemMoon.getName(), systemMoon);
        system.addMoon(systemMoon);

        system = new SolarSystem("Mercury", 88);
        solarSystemMap.put(system.getName(), system);
        solarSystemSet.add(system);

        system = new SolarSystem("Venus", 224);
        solarSystemMap.put(system.getName(), system);
        solarSystemSet.add(system);

        system = new SolarSystem("Mars", 687);
        solarSystemMap.put(system.getName(), system);
        solarSystemSet.add(system);

        systemMoon = new SolarSystem("Deimos", 54);
        solarSystemMap.put(systemMoon.getName(), systemMoon);
        system.addMoon(systemMoon);

        systemMoon = new SolarSystem("Phobos", 78);
        solarSystemMap.put(systemMoon.getName(), systemMoon);
        system.addMoon(systemMoon);

        system = new SolarSystem("Jupiter", 4332);
        solarSystemMap.put(system.getName(), system);
        solarSystemSet.add(system);

        systemMoon = new SolarSystem("Ganymede", 77);
        solarSystemMap.put(systemMoon.getName(), systemMoon);
        system.addMoon(systemMoon);

        systemMoon = new SolarSystem("Callisto", 15);
        solarSystemMap.put(systemMoon.getName(), systemMoon);
        system.addMoon(systemMoon);

        systemMoon = new SolarSystem("Io", 118);
        solarSystemMap.put(systemMoon.getName(), systemMoon);
        system.addMoon(systemMoon);

        systemMoon = new SolarSystem("Europa", 99);
        solarSystemMap.put(systemMoon.getName(), systemMoon);
        system.addMoon(systemMoon);

        system = new SolarSystem("Saturn", 10756);
        solarSystemMap.put(system.getName(), system);
        solarSystemSet.add(system);

        SolarSystem systemMap = solarSystemMap.get("Earth");
        System.out.println("Planets in Solar System:");
        for (SolarSystem solar : solarSystemSet) {
            System.out.println("\t" + solar.getName());
        }

        System.out.println("Moon of planet " + systemMap.getName());
        for (SolarSystem earthMoon : systemMap.getSolarSys()) {
            System.out.println("\t" + earthMoon.getName());
        }

    }
}
