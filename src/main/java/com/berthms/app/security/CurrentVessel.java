package com.berthms.app.security;

import com.berthms.backend.entity.Vessel;

@FunctionalInterface
public interface CurrentVessel {

	Vessel getVessel();
}
