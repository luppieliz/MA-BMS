package com.berthms.app.security;

import com.berthms.backend.entity.User;

@FunctionalInterface
public interface CurrentUser {

	User getUser();
}
