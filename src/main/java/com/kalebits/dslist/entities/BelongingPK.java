package com.kalebits.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;


@Embeddable
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name = "cartoon_id")
    private Cartoon cartoon;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private CartoonList list;

    public BelongingPK(){}

    public BelongingPK(Cartoon cartoon, CartoonList list) {
        this.cartoon = cartoon;
        this.list = list;
    }

    public Cartoon getCartoon() {
        return cartoon;
    }

    public void setCartoon(Cartoon cartoon) {
        this.cartoon = cartoon;
    }

    public CartoonList getList() {
        return list;
    }

    public void setList(CartoonList list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BelongingPK that)) return false;
        return Objects.equals(cartoon, that.cartoon) && Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cartoon, list);
    }
}
