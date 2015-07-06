package com.archosResearch.jCHEKS.concept.chaoticSystem;

/**
 *
 * @author jean-francois
 */
public abstract class AbstractChaoticSystem {

    //<editor-fold defaultstate="collapsed" desc="Properties">
    protected String systemId;
    protected int keyLength;
    protected final int maxImpact = 32;
    protected byte[] lastGeneratedKey;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Abstract methods">
    public abstract void evolveSystem(int factor);

    public abstract byte[] getKey(int requiredLength) throws Exception;

    public abstract void resetSystem();

    public abstract AbstractChaoticSystem cloneSystem() throws Exception;

    public abstract String serialize();

    //TODO shouldn't this method be a static factory ?
    public abstract void Deserialize(String serialization);

    protected abstract void generateSystem(int keyLength) throws Exception;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    /*public AbstractChaoticSystem() {
        this.systemId = java.util.UUID.randomUUID().toString();
        this.keyLength = 128;
    }*/
    
    public AbstractChaoticSystem(int keyLength) throws Exception {
        this(keyLength, java.util.UUID.randomUUID().toString());
    }
    
    public AbstractChaoticSystem(int keyLength, String systemId) throws Exception {
        this.systemId = systemId;
        this.keyLength = keyLength;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Methods">
    public byte[] getKey() {
        return this.lastGeneratedKey;
    }

    public void evolveSystem() {
        this.evolveSystem(0);
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Accessors">
    public String getSystemId() {
        return this.systemId;
    }

    public int getImpact() {
        return this.maxImpact;
    }
    //</editor-fold>

}
