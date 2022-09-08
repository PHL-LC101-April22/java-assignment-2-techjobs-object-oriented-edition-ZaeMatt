package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;


    public Job() {
        this.id = nextId;
        nextId++;
    }

   public Job( String aName, Employer aEmployer, Location aLocation, PositionType aPositionType,CoreCompetency aCoreCompetency){

       this();

       name = aName;
       employer = aEmployer;
       location = aLocation;
       positionType = aPositionType;
       coreCompetency = aCoreCompetency;
       //nextId++;

    }

    public Employer getEmployer() {
        return employer;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;

    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String dan = "Data not available";
        if (name == null || name == "") {
            name = dan;
        }
        if (employer == null || employer.getValue() == "") {
            employer.setValue(dan);
        }
        if(location == null || location.getValue() ==""){
            location.setValue(dan);
        }
        if (positionType == null || positionType.getValue() ==""){
            positionType.setValue(dan);
        }
        if(coreCompetency == null || coreCompetency.getValue() == ""){
            coreCompetency.setValue(dan);
        }
        return "\n" + "ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Employer: " + employer + "\n" +
                "Location: " + location + "\n" +
                "Position Type: " + positionType + "\n" +
                "Core Competency: " + coreCompetency + "\n";
    }
}

