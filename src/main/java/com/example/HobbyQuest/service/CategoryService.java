package com.example.HobbyQuest.service;

import com.example.HobbyQuest.model.entities.Category;
import com.example.HobbyQuest.model.entities.enums.CategoryNameEnum;

import java.util.List;

public interface CategoryService {
    Category findByName(CategoryNameEnum category);

    List<Category> initCategories();
}
