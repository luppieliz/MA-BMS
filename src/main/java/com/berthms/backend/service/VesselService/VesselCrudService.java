package com.berthms.backend.service.VesselService;

import javax.persistence.EntityNotFoundException;

import org.springframework.data.jpa.repository.JpaRepository;

import com.berthms.backend.entity.AbstractEntity;
import com.berthms.backend.entity.Vessel;
import com.berthms.backend.entity.VesselID;

public interface VesselCrudService<T> {

	JpaRepository<T, VesselID> getRepository();

	default T save(Vessel currentVessel, T entity) {
		return getRepository().saveAndFlush(entity);
	}

	default void delete(Vessel currentVessel, T entity) {
		if (entity == null) {
			throw new EntityNotFoundException();
		}
		getRepository().delete(entity);
	}

	default void delete(Vessel currentVessel, VesselID vid) {
		delete(currentVessel, load(vid));
	}

	default long count() {
		return getRepository().count();
	}

	default T load(VesselID vid) {
		T entity = getRepository().findById(vid).orElse(null);
		if (entity == null) {
			throw new EntityNotFoundException();
		}
		return entity;
	}

	T createNew(Vessel currentVessel);
}
