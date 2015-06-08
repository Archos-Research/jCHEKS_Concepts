package com.archosResearch.jCHEKS.concept.ioManager;

import com.archosResearch.jCHEKS.concept.engine.AbstractEngine;
import com.archosResearch.jCHEKS.concept.engine.ModelObserver;

/**
 *
 * @author Michael Roussel <rousselm4@gmail.com>
 */

//Todo In concept project?
public interface InputOutputManager extends ModelObserver {

    public void setEngine(AbstractEngine engine);

    public void forwardOutgoingMessage(String messageContent);

    public void setSelectedContactName(String name);
}
