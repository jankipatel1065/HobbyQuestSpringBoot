package com.example.HobbyQuest.model.repostiory;

import com.example.HobbyQuest.model.entities.AppClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AppClientRepository extends JpaRepository<AppClient, Long> {
    Optional<AppClient> findByUsername(String username);
}
