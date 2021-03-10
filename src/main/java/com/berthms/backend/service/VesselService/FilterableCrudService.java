package com.berthms.backend.service.VesselService;

import java.util.Optional;

import com.berthms.backend.entity.AbstractEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FilterableCrudService<T> extends VesselCrudService<T> {

}
