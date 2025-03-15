/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestschedulerapp;

/**
 *
 * @author joegr
 */
public class Patient {

    private String name;
    private int priority;
    private int age; // Keep age but don't use it for priority
    private boolean comingFromHospital;
    private String gpDetails;

    public Patient(String name, int priority, int age, boolean comingFromHospital, String gpDetails) {
        this.name = name;
        this.priority = priority;
        this.age = age;
        this.comingFromHospital = comingFromHospital;
        this.gpDetails = gpDetails;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean isComingFromHospital() {
        return comingFromHospital;
    }

    public String getGPDetails() {
        return gpDetails;
    }

    public int getPriority() {
        return priority;
    }
}
