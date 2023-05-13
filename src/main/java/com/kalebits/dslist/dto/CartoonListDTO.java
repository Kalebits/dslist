package com.kalebits.dslist.dto;

import com.kalebits.dslist.entities.CartoonList;

public class CartoonListDTO {

    private Long id;
    private String name;

    public CartoonListDTO(){}

    public CartoonListDTO(CartoonList entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
