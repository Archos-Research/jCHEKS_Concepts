package com.archosResearch.jCHEKS.concept.communicator;

/**
 *
 * @author Thomas Lepage thomas.lepage@hotmail.ca
 */
public interface CommunicatorObserver {
    public void ackReceived();
    public String communicationReceived(AbstractCommunication communication);
}
