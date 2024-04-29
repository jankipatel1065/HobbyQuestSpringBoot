package com.example.HobbyQuest.model.repostiory;

import com.example.HobbyQuest.model.entities.Entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EntryRepository extends JpaRepository<Entry, Long> {

    List<Entry> findAllByAboId(Long id);
}
