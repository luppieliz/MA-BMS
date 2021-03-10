package com.berthms.backend.service.VesselDetsService;

import javax.persistence.EntityNotFoundException;

import org.springframework.data.jpa.repository.JpaRepository;

import com.berthms.backend.entity.AbstractEntity;
import com.berthms.backend.entity.VesselDets;

public interface VesselDetsCrudService<T> {

	JpaRepository<T, String> getRepository();

	default T save(VesselDets currentVesselDets, T entity) {
		return getRepository().saveAndFlush(entity);
	}

	default void delete(VesselDets currentVesselDets, T entity) {
		if (entity == null) {
			throw new EntityNotFoundException();
		}
		getRepository().delete(entity);
	}

	default void delete(VesselDets currentVesselDets, String Vsl_Voy) {
		delete(currentVesselDets, load(Vsl_Voy));
	}

	default long count() {
		return getRepository().count();
	}

	default T load(String Vsl_Voy) {
		T entity = getRepository().findById(Vsl_Voy).orElse(null);
		if (entity == null) {
			throw new EntityNotFoundException();
		}
		return entity;
	}

	T createNew(VesselDets currentVesselDets);
}
