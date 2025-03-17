/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestschedulerapp;

/**
 *
 * @author joegr
 * The PatientInterface defines the required behaviors for a Patient object.
 * Any class implementing this interface must provide methods to retrieve 
 * patient details such as name, age, priority, hospital status, and GP details.
 */

public interface PatientInterface {

    String getName();

    String getGPDetails();
}
