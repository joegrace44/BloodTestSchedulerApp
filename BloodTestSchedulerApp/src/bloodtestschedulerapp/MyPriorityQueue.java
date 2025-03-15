/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestschedulerapp;

import java.util.ArrayList;

/**
 *
 * @author joegr
 */
public class MyPriorityQueue implements PQInterface {

    private ArrayList<PQElement> thePQueue;

    public MyPriorityQueue() {
        thePQueue = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return thePQueue.isEmpty();
    }

    @Override
    public int size() {
        return thePQueue.size();
    }

    @Override
    public void enqueue(int priority, Object patient) {
        PQElement newElement = new PQElement(priority, patient);
        int index = findInsertPosition(priority);

        if (index >= thePQueue.size()) {
            thePQueue.add(newElement); // Add to the end if lowest priority
        } else {
            thePQueue.add(index, newElement); // Insert at the correct position
        }
    }

    // Prioritize by urgency: Urgent > Medium > Low
    private int findInsertPosition(int newPriority) {
        for (int i = 0; i < thePQueue.size(); i++) {
            PQElement curElement = thePQueue.get(i);
            if (curElement.getPriority() < newPriority) {
                return i;
            }
        }
        return thePQueue.size(); // Default is to add to the end
    }

    @Override
    public Object dequeue() {
        return isEmpty() ? null : thePQueue.remove(0);
    }

    @Override
    public String printPQueue() {
        StringBuilder sb = new StringBuilder("Patients in Priority Queue:\n");
        for (PQElement elem : thePQueue) {
            Patient p = (Patient) elem.getElement();
            sb.append("Priority: ").append(elem.getPriority()).append(" - ").append(p.getName()).append("\n");
        }
        return sb.toString();
    }
}
