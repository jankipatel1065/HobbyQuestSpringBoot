package com.example.HobbyQuest.service.impl;

import com.example.HobbyQuest.handler.NotFoundException;
import com.example.HobbyQuest.model.entities.UserRoleEntity;
import com.example.HobbyQuest.model.entities.enums.UserRoleEnum;
import com.example.HobbyQuest.model.repostiory.UserRoleRepository;
import com.example.HobbyQuest.service.UserRoleService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class UserRoleServiceImplTest {
    private UserRoleService mockUserRoleServiceToTest;
    private     UserRoleEntity userRoleEntity;
    private   UserRoleRepository mockUserRoleRepository;

    @BeforeEach
    public void setUp() {
       mockUserRoleRepository = mock(UserRoleRepository.class);
        mockUserRoleServiceToTest = new UserRoleServiceImpl(mockUserRoleRepository);
        userRoleEntity = new UserRoleEntity();
        userRoleEntity.setRole(UserRoleEnum.USER);
        when(mockUserRoleRepository.save(any(UserRoleEntity.class)))
                .thenAnswer(i -> i.getArguments()[0]);

    }

    @Test
    void getUserRoleByEnumName_Should_Work() {

        Mockito.when(mockUserRoleRepository.findByRole(UserRoleEnum.USER)).
                thenReturn(Optional.of(userRoleEntity));
        UserRoleEntity userRoleByEnumName = mockUserRoleServiceToTest.getUserRoleByEnumName(UserRoleEnum.USER);

        assertEquals(userRoleEntity.getRole(),userRoleByEnumName.getRole());
    }

    @Test
    void role_should_be_Saved() {
        Mockito.when(mockUserRoleRepository.save(any(UserRoleEntity.class))).
                thenReturn(userRoleEntity);
        UserRoleEntity userRole= mockUserRoleServiceToTest.saveRole(this.userRoleEntity);

        assertEquals(userRole.getId(), userRoleEntity.getId());
    }

  @Test
    void testUserNotFound() {
      Assertions.assertThrows(
                NotFoundException.class,
                () -> mockUserRoleServiceToTest.getUserRoleByEnumName(UserRoleEnum.USER));
    }



}