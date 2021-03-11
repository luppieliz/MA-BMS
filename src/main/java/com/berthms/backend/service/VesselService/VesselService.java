package com.berthms.backend.service.VesselService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.berthms.backend.entity.Vessel;
import com.berthms.backend.repository.VesselRepository;

@Service
public class VesselService implements VesselFilterableCrudService<Vessel> {

	public static final String MODIFY_LOCKED_Vessel_NOT_PERMITTED = "Vessel has been locked and cannot be modified or deleted";
	private static final String DELETING_SELF_NOT_PERMITTED = "You cannot delete your own account";
	private final VesselRepository vesselRepository;

	@Autowired
	public VesselService(VesselRepository vesselRepository) {
		this.vesselRepository = vesselRepository;
	}	

	

	@Override
	public VesselRepository getRepository() {
		return vesselRepository;
	}


	public Page<Vessel> find(Pageable pageable) {
		return getRepository().findBy(pageable);
	}


	
	@Override
	public Vessel save(Vessel currentVessel, Vessel entity) {		
		return getRepository().saveAndFlush(entity);
	}

	@Override
	@Transactional
	public void delete(Vessel currentVessel, Vessel VesselToDelete) {
		
		VesselFilterableCrudService.super.delete(currentVessel, VesselToDelete);
	}
	

	@Override
	public Vessel createNew(Vessel currentVessel) {
		return new Vessel();
	}

}
