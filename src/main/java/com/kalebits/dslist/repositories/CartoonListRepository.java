package com.kalebits.dslist.repositories;

import com.kalebits.dslist.entities.CartoonList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartoonListRepository extends JpaRepository<CartoonList, Long> {
}
