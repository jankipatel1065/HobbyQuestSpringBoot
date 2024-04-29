package com.example.HobbyQuest.service;

import com.example.HobbyQuest.model.entities.UserRoleEntity;
import com.example.HobbyQuest.model.entities.enums.UserRoleEnum;

public interface UserRoleService {
    UserRoleEntity getUserRoleByEnumName(UserRoleEnum userRoleEnum);

    UserRoleEntity saveRole(UserRoleEntity userRoleEntity);
}
