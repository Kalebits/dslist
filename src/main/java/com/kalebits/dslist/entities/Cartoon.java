package com.kalebits.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;


@Entity
@Table(name = "tbl_Cartoon")
public class Cartoon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @Column(name = "cartoon_year")
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;

    @Column(columnDefinition = "TEXT")
    private String shortDescription;

    @Column(columnDefinition = "TEXT")
    private String longDescription;

    public Cartoon(){}

    public Cartoon(Long id, String title, Integer year, String genre,
                   String platforms, Double score, String imgUrl,
                   String shortDescription, String longDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platforms = platforms;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String titulo) {
        this.title = titulo;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer ano) {
        this.year = ano;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genero) {
        this.genre = genero;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String descricaoCurta) {
        this.shortDescription = descricaoCurta;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String descicaoLonga) {
        this.longDescription = descicaoLonga;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cartoon cartoon)) return false;
        return Objects.equals(id, cartoon.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
