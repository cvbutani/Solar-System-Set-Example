package com.company.example;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SolarSystem {
    private final int OrbitalSpeed;
    private final Set<SolarSystem> solarSys;
    private final Key key;

    public enum BodyTypes {
        STAR,
        PLANET,
        MOON
    }

    public SolarSystem(String name, int orbitalSpeed, BodyTypes bodyType) {
        this.key = new Key(name, bodyType);
        OrbitalSpeed = orbitalSpeed;
        this.solarSys = new HashSet<>();
    }

    public Key getKey() {
        return key;
    }

    public int getOrbitalSpeed() {
        return OrbitalSpeed;
    }

    public Set<SolarSystem> getSolarSys() {
        return new HashSet<>(this.solarSys);
    }

    public boolean addSatellite(SolarSystem moons) {
        return this.solarSys.add(moons);
    }

    public void addBodyType(SolarSystem bodyType) {
        this.solarSys.add(bodyType);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SolarSystem) {
            SolarSystem theObject = (SolarSystem) obj;
            return this.key.equals(theObject.getKey());
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.key.hashCode();
    }

    @Override
    public String toString() {
        return this.key.name + ": " + this.key.bodyTypes + ": " + this.getOrbitalSpeed();
    }

    public static Key makeKey(String name, BodyTypes bodyType) {
        return new Key(name, bodyType);
    }

    public static final class Key {
        private String name;
        private BodyTypes bodyTypes;

        public Key(String name, BodyTypes bodyTypes) {
            this.name = name;
            this.bodyTypes = bodyTypes;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyTypes() {
            return bodyTypes;
        }

        @Override
        public boolean equals(Object o) {
            Key key = (Key) o;
            if (this.name.equals(key.getName())) {
                return this.bodyTypes == key.getBodyTypes();
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyTypes.hashCode();
        }

        @Override
        public String toString() {
            return this.name + ": " + this.bodyTypes;
        }

    }
}
