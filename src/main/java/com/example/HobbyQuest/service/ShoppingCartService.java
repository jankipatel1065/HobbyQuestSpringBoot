package com.example.HobbyQuest.service;

import com.example.HobbyQuest.model.entities.Abo;
import com.example.HobbyQuest.model.entities.Hobby;

import java.math.BigDecimal;
import java.util.List;

public interface ShoppingCartService {
    void addAboToCart(Hobby hobieById);

    void removeProductFromCart(Long hobbyId);

    BigDecimal getTotal();

    List<Abo> getAbosInCart();

    void checkout();
}
