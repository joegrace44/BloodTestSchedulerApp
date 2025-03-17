/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestschedulerapp;

import java.util.ArrayList;

/**
 *
 * @author joegr
 * MyQueue is a FIFO (First-In-First-Out) queue implementation for storing
 * the last 5 no-show patients in the Blood Test Scheduler application.
 * It ensures that only the most recent 5 no-show patients are kept in memory.
 */

public class MyQueue implements QueueInterface {

    private ArrayList<Patient> queue;
    private static final int MAX_SIZE = 5;

    public MyQueue() {
        queue = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public void enqueue(Object newItem) {
        if (queue.size() == MAX_SIZE) {
            queue.remove(0); // Remove the oldest no-show patient
        }
        queue.add((Patient) newItem);
    }

    @Override
    public Object dequeue() {
        return isEmpty() ? null : queue.remove(0);
    }

    public void displayNoShowPatients() {
        System.out.println("Last 5 No-Show Patients:");
        for (Patient p : queue) {
            System.out.println("- " + p.getName());
        }
    }
}
