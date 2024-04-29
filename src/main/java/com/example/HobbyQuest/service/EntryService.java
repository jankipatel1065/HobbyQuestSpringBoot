package com.example.HobbyQuest.service;

import com.example.HobbyQuest.model.entities.AppClient;
import com.example.HobbyQuest.model.entities.Entry;
import com.example.HobbyQuest.view.EntryViewModel;

import java.util.List;

public interface EntryService {
    List<EntryViewModel> getAboEntries(Long id);

    List<Entry> saveAboEntries(List<Entry> aboEntries);

    void saveUpdatedEntry(AppClient appClient, Long entryId);

    void confirmUpdatedEntry(Long entryId);

}
