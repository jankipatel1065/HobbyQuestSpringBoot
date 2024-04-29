package com.example.HobbyQuest.service.impl;

import com.example.HobbyQuest.model.entities.AppClient;
import com.example.HobbyQuest.model.entities.Hobby;
import com.example.HobbyQuest.model.entities.Test;
import com.example.HobbyQuest.model.repostiory.TestRepository;
import com.example.HobbyQuest.model.service.TestServiceModel;
import com.example.HobbyQuest.service.HobbyService;
import com.example.HobbyQuest.service.TestService;
import com.example.HobbyQuest.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TestServiceImpl implements TestService {
    private final TestRepository testRepository;
    private final ModelMapper modelMapper;
    private final UserService userService;
    private final HobbyService hobbyService;

    @Autowired
    public TestServiceImpl(TestRepository testRepository, ModelMapper modelMapper, UserService userService, HobbyService hobbyService) {
        this.testRepository = testRepository;
        this.modelMapper = modelMapper;
        this.userService = userService;
        this.hobbyService = hobbyService;
    }

    @Override
    public void saveTest(TestServiceModel testServiceModel) {
        Test test = this.modelMapper.map(testServiceModel, Test.class);
        AppClient currentUserAppClient = this.userService.findCurrentUserAppClient();
        test.setAppClient(currentUserAppClient);
        test.setLocation((testServiceModel.getLocation()));
        if (currentUserAppClient.getTestResults() != null) {
            test.setId(currentUserAppClient.getTestResults().getId());
        }
        this.testRepository.save(test);
        currentUserAppClient.setTestResults(test);
        List<Hobby> hobbyMatches = this.hobbyService.findHobbyMatches(currentUserAppClient);
        currentUserAppClient.setHobby_matches(hobbyMatches);
        this.userService.saveUpdatedUserClient(currentUserAppClient);
    }
}
