package com.example.HobbyQuest.model.repostiory;

import com.example.HobbyQuest.model.entities.Hobby;
import com.example.HobbyQuest.model.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HobbyRepository extends JpaRepository<Hobby, Long> {

    List<Hobby> findAllByBusinessOwnerBusinessName(String businessName);

    List<Hobby> findAllByLocation(Location location);
}
