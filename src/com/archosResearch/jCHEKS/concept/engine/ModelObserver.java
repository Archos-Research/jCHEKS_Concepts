package com.archosResearch.jCHEKS.concept.engine;

import com.archosResearch.jCHEKS.concept.engine.message.*;

/**
 *
 * @author Michael Roussel
 */
public interface ModelObserver {

    public void messageSent(OutgoingMessage message, String contactName);

    public void messageReceived(IncomingMessage message, String contactName);

    public void contactAdded(String contactName);
}
