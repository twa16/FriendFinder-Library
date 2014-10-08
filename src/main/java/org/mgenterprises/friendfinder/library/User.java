package org.mgenterprises.friendfinder.library;

import java.util.UUID;

/**
 * Created by mgauto on 10/8/14.
 */
public class User {
    private UUID uuid;
    private String email;
    private String username;
    private String passwordHash;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }
}
