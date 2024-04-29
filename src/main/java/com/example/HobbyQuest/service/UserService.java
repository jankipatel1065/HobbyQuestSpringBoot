package com.example.HobbyQuest.service;

import com.example.HobbyQuest.model.entities.AppClient;
import com.example.HobbyQuest.model.entities.BusinessOwner;
import com.example.HobbyQuest.model.entities.Hobby;
import com.example.HobbyQuest.model.entities.UserEntity;
import com.example.HobbyQuest.model.service.RegisterBusinessServiceModel;
import com.example.HobbyQuest.model.service.SignUpServiceModel;

import java.util.List;

public interface UserService {
    List<UserEntity> seedUsersAndUserRoles();

    AppClient register(SignUpServiceModel signUpServiceModel);

    BusinessOwner findCurrentUserBusinessOwner();

    AppClient findCurrentUserAppClient();

    String findCurrentUsername();

    BusinessOwner registerBusiness(RegisterBusinessServiceModel map);

    BusinessOwner saveUpdatedUser(BusinessOwner businessOwner);

    AppClient saveUpdatedUserClient(AppClient appClient);

    UserEntity findUserById(Long userId);

    void deleteUser(Long id);

    BusinessOwner findBusinessOwnerById(Long id);

    UserEntity findUserByUsername(String username);

    boolean userExists(String username, String email);

    void deleteBusinessOwner(Long id);

    void deleteAppClient(Long id);

    AppClient findAppClientById(Long clientId);

    void findAndRemoveHobbyFromClientsRecords(Hobby hobby);

    void expireUserSessions();

    boolean businessExists(String businessName);

    boolean emailExists(String email);

    boolean businessNameExists(String businessName, Long userId);
}


