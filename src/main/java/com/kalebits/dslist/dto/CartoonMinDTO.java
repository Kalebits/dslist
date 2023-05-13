package com.kalebits.dslist.dto;

import com.kalebits.dslist.entities.Cartoon;
import com.kalebits.dslist.projections.CartoonMinProjection;

public class CartoonMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public CartoonMinDTO(){}

    public CartoonMinDTO(Cartoon entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public CartoonMinDTO(CartoonMinProjection projection) {
        id = projection.getId();
        title = projection.getTitle();
        year = projection.getCartoonYear();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
