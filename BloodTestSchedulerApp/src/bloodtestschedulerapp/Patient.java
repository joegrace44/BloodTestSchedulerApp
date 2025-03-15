/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestschedulerapp;

/**
 *
 * @author joegr
 */
public class Patient implements PatientInterface, SchedulableInterface {

    private String name;
    private String gpDetails;
    private int priority;
    private boolean comingFromHospital;

    public Patient(String name, int priority, boolean comingFromHospital, String gpDetails) {
        this.name = name;
        this.priority = priority;
        this.comingFromHospital = comingFromHospital;
        this.gpDetails = gpDetails;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGPDetails() {
        return gpDetails;
    }

    @Override
    public void scheduleTest() {
        System.out.println(name + " has been scheduled for a blood test.");
    }

    public int getPriority() {
        return priority;
    }

    public boolean isComingFromHospital() {
        return comingFromHospital;
    }
}
