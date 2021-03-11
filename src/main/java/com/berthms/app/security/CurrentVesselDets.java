package com.berthms.app.security;

import com.berthms.backend.entity.VesselDets;

@FunctionalInterface
public interface CurrentVesselDets {

	VesselDets getVesselDets();
}
