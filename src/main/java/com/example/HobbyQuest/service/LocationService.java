package com.example.HobbyQuest.service;

import com.example.HobbyQuest.model.entities.Location;
import com.example.HobbyQuest.model.entities.enums.LocationEnum;

import java.util.List;

public interface LocationService {
    List<Location> initLocations();

    Location getLocationByName(LocationEnum locationEnum);
}
