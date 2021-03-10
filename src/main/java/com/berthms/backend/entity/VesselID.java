package com.berthms.backend.entity;

import java.io.Serializable;

public class VesselID implements Serializable{
    private String abbrVslM; //Vessel Short Name/
    private String inVoyN; //(abbrVsIM,inVoyN) will be unique

    public VesselID(){}

    public VesselID(String abbrVslM, String inVoyN) {
        this.abbrVslM = abbrVslM;
        this.inVoyN = inVoyN;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((abbrVslM == null) ? 0 : abbrVslM.hashCode());
        result = prime * result + ((inVoyN == null) ? 0 : inVoyN.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        VesselID other = (VesselID) obj;
        if (abbrVslM == null) {
            if (other.abbrVslM != null)
                return false;
        } else if (!abbrVslM.equals(other.abbrVslM))
            return false;
        if (inVoyN == null) {
            if (other.inVoyN != null)
                return false;
        } else if (!inVoyN.equals(other.inVoyN))
            return false;
        return true;
    }

    

}
