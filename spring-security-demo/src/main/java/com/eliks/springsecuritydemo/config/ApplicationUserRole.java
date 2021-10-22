package com.eliks.springsecuritydemo.config;

import com.google.common.collect.Sets;

import java.util.Set;

import static com.eliks.springsecuritydemo.config.ApplicationUserPermission.ACCOUNT_READ;
import static com.eliks.springsecuritydemo.config.ApplicationUserPermission.ACCOUNT_WRITE;

public enum ApplicationUserRole {
    USER(Sets.newHashSet(ACCOUNT_READ)),
    ADMIN(Sets.newHashSet(ACCOUNT_READ, ACCOUNT_WRITE));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }
}
