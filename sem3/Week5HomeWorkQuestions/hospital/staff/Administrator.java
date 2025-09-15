package com.hospital.staff;

import java.util.List;
import java.util.Objects;

/**
 * Administrator with permissions list that controls what they can do
 */
public class Administrator {
    private final String adminId;
    private final List<String> accessPermissions;

    public Administrator(String adminId, List<String> accessPermissions) {
        this.adminId = Objects.requireNonNull(adminId);
        this.accessPermissions = accessPermissions;
    }

    public boolean hasPermission(String permission) {
        return accessPermissions != null && accessPermissions.contains(permission);
    }

    @Override
    public String toString() {
        return "Administrator{id=" + adminId + ", permissions=" + accessPermissions + "}";
    }
}
