package com.berthms.backend.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
//import java.util.Date;


@Entity
@Table(name = "vessel")
public class VesselDets {
        @Id 
		private String VSL_VOY; //Parameter that was used for the query
        
        @Column(name="AVG_SPEED")
        private String AVG_SPEED;//Average speed of the vessel
        
        @Column(name="DISTANCE_TO_GO")
        private String DISTANCE_TO_GO; //Distance to reaching the berth
        
        @Column(name="IS_PATCHING_ACTIVATED")
        private String IS_PATCHING_ACTIVATED;//The value of the field will be used to determine which field to be used as the predicted berthing time       
        //1 -> use PATCHING_PREDICTED_BTR
        //0 -> use PREDICTED_BTR
        
        @Column(name="MAX_SPEED")
        private String MAX_SPEED;//Maximum speed of the vessel
   
        @Column(name="PATCHING_PREDICTED_BTR")
        private String PATCHING_PREDICTED_BTR;//Predicted berthing time (Patching) Refer to the logic described under IS_PATCHING_ACTIVATED

        @Column(name="PREDICTED_BTR")
        private String PREDICTED_BTR;//Predicted berthing time Refer to the logic described under IS_PATCHING_ACTIVATED

        @Column(name="VESSEL_NAME")
        private String VESSEL_NAME; //Name of vessel
        
        @Column(name="VOYAGE_CODE_INBOUND")
        private String VOYAGE_CODE_INBOUND;//Incoming Voyage number (equivalent to "flight number" in flight schedule)
        
        // @Column(nullable = false, updatable = false)
        // @Temporal(TemporalType.TIMESTAMP)
        // @CreatedDate
        // private Date createdAt;

        // @Column(nullable = false)
        // @Temporal(TemporalType.TIMESTAMP)
        // @LastModifiedDate
        // private Date updatedAt;


		public String getAVG_SPEED() {
			return AVG_SPEED;
		}
		public void setAVG_SPEED(String aVG_SPEED) {
			AVG_SPEED = aVG_SPEED;
		}
		public String getDISTANCE_TO_GO() {
			return DISTANCE_TO_GO;
		}
		public void setDISTANCE_TO_GO(String dISTANCE_TO_GO) {
			DISTANCE_TO_GO = dISTANCE_TO_GO;
		}
		public String getIS_PATCHING_ACTIVATED() {
			return IS_PATCHING_ACTIVATED;
		}
		public void setIS_PATCHING_ACTIVATED(String iS_PATCHING_ACTIVATED) {
			IS_PATCHING_ACTIVATED = iS_PATCHING_ACTIVATED;
		}
		public String getMAX_SPEED() {
			return MAX_SPEED;
		}
		public void setMAX_SPEED(String mAX_SPEED) {
			MAX_SPEED = mAX_SPEED;
		}
		public String getPATCHING_PREDICTED_BTR() {
			return PATCHING_PREDICTED_BTR;
		}
		public void setPATCHING_PREDICTED_BTR(String pATCHING_PREDICTED_BTR) {
			PATCHING_PREDICTED_BTR = pATCHING_PREDICTED_BTR;
		}
		public String getPREDICTED_BTR() {
			return PREDICTED_BTR;
		}
		public void setPREDICTED_BTR(String pREDICTED_BTR) {
			PREDICTED_BTR = pREDICTED_BTR;
		}
		public String getVESSEL_NAME() {
			return VESSEL_NAME;
		}
		public void setVESSEL_NAME(String vESSEL_NAME) {
			VESSEL_NAME = vESSEL_NAME;
		}
		public String getVOYAGE_CODE_INBOUND() {
			return VOYAGE_CODE_INBOUND;
		}
		public void setVOYAGE_CODE_INBOUND(String vOYAGE_CODE_INBOUND) {
			VOYAGE_CODE_INBOUND = vOYAGE_CODE_INBOUND;
		}
		public String getVSL_VOY() {
			return VSL_VOY;
		}
		public void setVSL_VOY(String vSL_VOY) {
			VSL_VOY = vSL_VOY;
		}

        // public Date getCreatedAt() {
        //     return createdAt;
        // }
    
        // public void setCreatedAt(Date createdAt) {
        //     this.createdAt = createdAt;
        // }
    
        // public Date getUpdatedAt() {
        //     return updatedAt;
        // }
    
        // public void setUpdatedAt(Date updatedAt) {
        //     this.updatedAt = updatedAt;
        // }

		@Override
		public String toString() {
			return "VesselDets [AVG_SPEED=" + AVG_SPEED + ", DISTANCE_TO_GO=" + DISTANCE_TO_GO
					+ ", IS_PATCHING_ACTIVATED=" + IS_PATCHING_ACTIVATED + ", MAX_SPEED=" + MAX_SPEED
					+ ", PATCHING_PREDICTED_BTR=" + PATCHING_PREDICTED_BTR + ", PREDICTED_BTR=" + PREDICTED_BTR
					+ ", VESSEL_NAME=" + VESSEL_NAME + ", VOYAGE_CODE_INBOUND=" + VOYAGE_CODE_INBOUND + ", VSL_VOY="
					+ VSL_VOY + "]";
		}
	
    
}

