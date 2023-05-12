package com.kalebits.dslist.repositories;

import com.kalebits.dslist.entities.Cartoon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartoonRepository extends JpaRepository<Cartoon, Long> {
}
