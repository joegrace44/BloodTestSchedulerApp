/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestschedulerapp;

/**
 *
 * @author joegr
 * The PQElement class represents an element in the priority queue.
 * It stores the patient object along with its priority level.
 */
public class PQElement {

    private int priority;
    private Object element;

    public PQElement(int priority, Object element) {
        this.priority = priority;
        this.element = element;
    }

    public int getPriority() {
        return priority;
    }

    public Object getElement() {
        return element;
    }
}
