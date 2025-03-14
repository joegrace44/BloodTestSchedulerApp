/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestschedulerapp;

/**
 *
 * @author joegr
 */
public interface QueueInterface {

    boolean isEmpty();

    int size();

    void enqueue(Object newItem);

    Object dequeue();
}
