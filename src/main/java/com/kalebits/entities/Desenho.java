package com.kalebits.entities;

import jakarta.persistence.*;

import java.util.Objects;


@Entity
@Table(name="tbl_Desenho")
public class Desenho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private Integer ano;
    private String genero;
    private String imgUrl;
    private String descricaoCurta;
    private String descicaoLonga;

    public Desenho(){}

    public Desenho(Long id, String titulo, Integer ano, String genero,
                   String imgUrl, String descricaoCurta, String descicaoLonga) {
        this.id = id;
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.imgUrl = imgUrl;
        this.descricaoCurta = descricaoCurta;
        this.descicaoLonga = descicaoLonga;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDescricaoCurta() {
        return descricaoCurta;
    }

    public void setDescricaoCurta(String descricaoCurta) {
        this.descricaoCurta = descricaoCurta;
    }

    public String getDescicaoLonga() {
        return descicaoLonga;
    }

    public void setDescicaoLonga(String descicaoLonga) {
        this.descicaoLonga = descicaoLonga;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Desenho desenho)) return false;
        return Objects.equals(id, desenho.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}