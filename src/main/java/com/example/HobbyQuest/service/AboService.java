package com.example.HobbyQuest.service;

import com.example.HobbyQuest.model.entities.Abo;
import com.example.HobbyQuest.model.entities.AppClient;
import com.example.HobbyQuest.view.AboViewModel;

import java.util.List;

public interface AboService {
    List<Abo> saveAbos(List<Abo> inCart);

    List<AboViewModel> getUserAbos(Long id);

    void updateAbosWithEntries(List<Abo> abos);

    Long findAboId(Long id);

    List<AboViewModel> getAbosPerBusiness();
    
    AppClient getClientDetails(Long id);

    AboViewModel findAboById(Long id);

    List<Abo> getExcistingAbosForClient(Long id);

    void deleteAbo(Long id);

    void findExcistingAbosWithHobbyId(Long id);

    Abo findAbo(Long id);
}
