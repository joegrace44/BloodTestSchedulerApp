/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestschedulerapp;

/**
 *
 * @author joegr
 * The QueueInterface defines the required operations for a basic queue.
 * Any class implementing this interface must provide methods to add, remove,
 * check size, and determine if the queue is empty.
 */

public interface QueueInterface {

    boolean isEmpty();

    int size();

    void enqueue(Object newItem);

    Object dequeue();
}
