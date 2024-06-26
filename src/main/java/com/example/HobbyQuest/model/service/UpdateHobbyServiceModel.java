package com.example.HobbyQuest.model.service;

import com.example.HobbyQuest.model.entities.enums.CategoryNameEnum;
import com.example.HobbyQuest.model.entities.enums.LocationEnum;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;

public class UpdateHobbyServiceModel {
    private Long id;
    private String name;
    private String description;
    private CategoryNameEnum category;
    private String photos;
    private BigDecimal price;
    private LocationEnum location;
    private MultipartFile img;


    public UpdateHobbyServiceModel() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CategoryNameEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryNameEnum category) {
        this.category = category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getPhotos() {
        return photos;
    }

    public void setPhotos(String photos) {
        this.photos = photos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocationEnum getLocation() {
        return location;
    }

    public void setLocation(LocationEnum location) {
        this.location = location;
    }

    public MultipartFile getImg() {
        return img;
    }

    public void setImg(MultipartFile img) {
        this.img = img;
    }
}
