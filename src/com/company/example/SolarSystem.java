package com.company.example;

import java.util.HashSet;
import java.util.Set;

public class SolarSystem {
    private final String name;
    private final int OrbitalSpeed;
    private final Set<SolarSystem> solarSys;

    public SolarSystem(String name, int orbitalSpeed) {
        this.name = name;
        OrbitalSpeed = orbitalSpeed;
        this.solarSys = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public int getOrbitalSpeed() {
        return OrbitalSpeed;
    }

    public Set<SolarSystem> getSolarSys() {
        return new HashSet<>(this.solarSys);
    }

    public void addMoon(SolarSystem moons) {
        this.solarSys.add(moons);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }
        String objName = ((SolarSystem) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 57;
    }
}
