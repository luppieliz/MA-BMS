package com.berthms.backend.service.UserService;

import java.util.Optional;

import com.berthms.backend.entity.AbstractEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserFilterableCrudService<T extends AbstractEntity> extends UserCrudService<T> {

	Page<T> findAnyMatching(Optional<String> filter, Pageable pageable);

	long countAnyMatching(Optional<String> filter);

}
