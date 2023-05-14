package com.kalebits.dslist.repositories;

import com.kalebits.dslist.entities.CartoonList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface CartoonListRepository extends JpaRepository<CartoonList, Long> {

    @Modifying
    @Query(nativeQuery = true, value = "UPDATE tb_belonging SET position = :newPosition " +
            "WHERE list_id = :listId AND cartoon_id = :cartoonId")
    void updateBelongingPosition(Long listId, Long cartoonId, Integer newPosition);
}
