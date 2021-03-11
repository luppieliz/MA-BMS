package com.berthms.backend.service.VesselDetsService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.berthms.backend.entity.VesselDets;
import com.berthms.backend.repository.VesselDetsRepository;
import com.berthms.backend.repository.VesselDetsRepository;

@Service
public class VesselDetsService implements VesselDetsFilterableCrudService<VesselDets> {

	public static final String MODIFY_LOCKED_VesselDets_NOT_PERMITTED = "VesselDets has been locked and cannot be modified or deleted";
	private static final String DELETING_SELF_NOT_PERMITTED = "You cannot delete your own account";
	private final VesselDetsRepository vesselDetsRepository;

	@Autowired
	public VesselDetsService(VesselDetsRepository vesselDetsRepository) {
		this.vesselDetsRepository = vesselDetsRepository;
	}

	
	
	@Override
	public VesselDetsRepository getRepository() {
		return vesselDetsRepository;
	}

	public Page<VesselDets> find(Pageable pageable) {
		return getRepository().findBy(pageable);
	}

	@Override
	public VesselDets save(VesselDets currentVessel, VesselDets entity) {
		return getRepository().saveAndFlush(entity);
	}

	@Override
	@Transactional
	public void delete(VesselDets currentVessel, VesselDets VesselDetsToDelete) {
		
		VesselDetsFilterableCrudService.super.delete(currentVessel, VesselDetsToDelete);
	}

	
	@Override
	public VesselDets createNew(VesselDets currentVessel) {
		return new VesselDets();
	}

}
