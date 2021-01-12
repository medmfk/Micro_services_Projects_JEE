package org.sid.securityservice.service;



import org.sid.securityservice.entities.AppRole;
import org.sid.securityservice.entities.AppUser;

import java.util.List;

public interface AccountService {
    AppUser addNewUser(AppUser appUser);
    AppRole addNewRole(AppRole appRole);
    void addRoleToUser(String username, String roleName);
    AppUser loadUserByUserName(String username);
    List<AppUser> allUsers();
}
