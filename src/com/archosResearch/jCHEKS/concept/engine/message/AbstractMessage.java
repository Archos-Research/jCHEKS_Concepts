package com.archosResearch.jCHEKS.concept.engine.message;

/**
 *
 * @author Michael Roussel <rousselm4@gmail.com>
 */
public abstract class AbstractMessage {

    private final String content;

    public AbstractMessage(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }
    
    //public ... polymorphicMethod(){}
}
