/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.archosResearch.jCHEKS.concept.communicator;

import com.archosResearch.jCHEKS.concept.exception.AbstractCommunicatorException;

/**
 *
 * @author Thomas Lepage
 */
public abstract class AbstractCommunicator extends CommunicatorObservable{
    public abstract void sendCommunication(AbstractCommunication communication) throws AbstractCommunicatorException;
    
}