/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestschedulerapp;

/**
 *
 * @author joegr
 */
public interface PQInterface {

    void enqueue(int priority, Object patient);

    int size();

    boolean isEmpty();

    Object dequeue();

    String printPQueue();
}
