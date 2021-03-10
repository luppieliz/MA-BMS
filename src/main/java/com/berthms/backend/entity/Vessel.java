package com.berthms.backend.entity;

import java.io.Serializable;

import javax.persistence.*;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "records")
@IdClass(VesselID.class)
public class Vessel implements Serializable{


	@Id
	@NotBlank
	private String abbrVslM; //Vessel Short Name/ 
	@Id
	@NotBlank
	private String inVoyN; //(abbrVsIM,inVoyN) will be unique
    
    private String fullVslM; //Vessel Long Name; used with InVoyN as param for second api  
	   
    private String fullInVoyN; // upto 12 characters whereas inVoyN is shorter *8 characters inVoyN and fullInVoyN can be the same
   
	private String outVoyN; // Outgoing Voyage number (abbrVsIM, outVoyN) will be unique
  
	private String bthgDt; //Berth Time Required (BTR) in ISO 8601 At PSA, this is the berthing time (when they can "park" at port terminal)  
 
	private String unbthgDt; // planned time given (port stay:etdDT - btrDt) 
 
   	private String berthN; // berth Number(e.g. P01)
  
	private String status; // possible values BERTHING-on the way ALONGSIDE-at berth UNBERTHED-left the berth

	public Vessel(){}


	
	public String getAbbrVslM() {
		return abbrVslM;
	}

	public void setAbbrVslM(String abbrVslM) {
		this.abbrVslM = abbrVslM;
	}

	public String getInVoyN() {
		return inVoyN;
	}

	public void setInVoyN(String inVoyN) {
		this.inVoyN = inVoyN;
	}

	public String getFullVslM() {
		return fullVslM;
	}

	public void setFullVslM(String fullVslM) {
		this.fullVslM = fullVslM;
	}

	public String getFullInVoyN() {
		return fullInVoyN;
	}


	public void setFullInVoyN(String fullInVoyN) {
		this.fullInVoyN = fullInVoyN;
	}

	public String getOutVoyN() {
		return outVoyN;
	}
	public void setOutVoyN(String outVoyN) {
		this.outVoyN = outVoyN;
	}

	public String getBthgDt() {
		return bthgDt;
	}

	public void setBthgdt(String bthgdt) {
		this.bthgDt = bthgdt;
	}

	public String getUnbthgDt() {
		return unbthgDt;
	}

	public void setUnbthgDt(String unbthgDt) {
		this.unbthgDt = unbthgDt;
	}

	public String getBerthN() {
		return berthN;
	}

	public void setBerthN(String berthN) {
		this.berthN = berthN;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Vessel [abbrVslM=" + abbrVslM + ", berthN=" + berthN + ", btrDt=" + bthgDt + ", fullInVoyN=" + fullInVoyN
				+ ", fullVslM=" + fullVslM + ", inVoyN=" + inVoyN + ", outVoyN=" + outVoyN + ", status=" + status
				+ ", unbthgDt=" + unbthgDt + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((abbrVslM == null) ? 0 : abbrVslM.hashCode());
		result = prime * result + ((berthN == null) ? 0 : berthN.hashCode());
		result = prime * result + ((bthgDt == null) ? 0 : bthgDt.hashCode());
		result = prime * result + ((fullInVoyN == null) ? 0 : fullInVoyN.hashCode());
		result = prime * result + ((fullVslM == null) ? 0 : fullVslM.hashCode());
		result = prime * result + ((inVoyN == null) ? 0 : inVoyN.hashCode());
		result = prime * result + ((outVoyN == null) ? 0 : outVoyN.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((unbthgDt == null) ? 0 : unbthgDt.hashCode());
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
		Vessel other = (Vessel) obj;
		if (abbrVslM == null) {
			if (other.abbrVslM != null)
				return false;
		} else if (!abbrVslM.equals(other.abbrVslM))
			return false;
		if (berthN == null) {
			if (other.berthN != null)
				return false;
		} else if (!berthN.equals(other.berthN))
			return false;
		if (bthgDt == null) {
			if (other.bthgDt != null)
				return false;
		} else if (!bthgDt.equals(other.bthgDt))
			return false;
		if (fullInVoyN == null) {
			if (other.fullInVoyN != null)
				return false;
		} else if (!fullInVoyN.equals(other.fullInVoyN))
			return false;
		if (fullVslM == null) {
			if (other.fullVslM != null)
				return false;
		} else if (!fullVslM.equals(other.fullVslM))
			return false;
		if (inVoyN == null) {
			if (other.inVoyN != null)
				return false;
		} else if (!inVoyN.equals(other.inVoyN))
			return false;
		if (outVoyN == null) {
			if (other.outVoyN != null)
				return false;
		} else if (!outVoyN.equals(other.outVoyN))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (unbthgDt == null) {
			if (other.unbthgDt != null)
				return false;
		} else if (!unbthgDt.equals(other.unbthgDt))
			return false;
		return true;
	}

	

}