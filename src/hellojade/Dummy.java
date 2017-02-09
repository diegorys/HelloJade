/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellojade;

import jade.core.Agent;

/**
 *
 * @author Diego
 */
public class Dummy extends Agent {

    @Override
    protected void setup() {
        System.out.println("Hello! agent " + getAID().getName() + " ready to start.");
    }
    
    @Override
    protected void takeDown() {
        System.out.println("Bye!");
    }
}
