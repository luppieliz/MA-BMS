package com.berthms.backend.entity;

import javax.persistence.*;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import javax.validation.constraints.NotBlank;

@Entity
@NamedQuery(name = "Vessel.findByStatus",
  query = "SELECT m FROM Vessel m WHERE m.status= ?1")

@NamedQuery(name = "Vessel.findByAbbrVslMandinVoyN",
  query = "select u from Vessel u where u.abbrVslM = ?1 and u.inVoyN = ?2")



@Table(name = "records")

public class Vessel {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rid", nullable = false)
	private Long Rid;
    @NotBlank
	private String abbrVslM; //Vessel Short Name/ 
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


	public Long getRid() {
		return Rid;
	}

	public void setRid(Long rid) {
		Rid = rid;
	}

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

}