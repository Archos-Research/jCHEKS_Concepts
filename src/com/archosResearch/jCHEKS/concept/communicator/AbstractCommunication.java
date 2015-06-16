package com.archosResearch.jCHEKS.concept.communicator;

/**
 *
 * @author Thomas Lepage thomas.lepage@hotmail.ca
 */
public abstract class AbstractCommunication {
    
    protected String systemId;
    protected String cipher;
    protected String cipherCheck;
    
    public abstract String getCommunicationString();
    
    public AbstractCommunication(){}
    
    public AbstractCommunication(String cipher, String cipherCheck, String systemId){
        this.cipher = cipher;
        this.cipherCheck = cipherCheck;
        this.systemId = systemId;
    }
    
    public String getSystemId() {        
        return this.systemId;
    }
    
    public String getCipher() {
        return this.cipher;
    }
    
    public String getCipherCheck() {
        return this.cipherCheck;
    }
}
