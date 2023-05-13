package com.kalebits.dslist.repositories;

import com.kalebits.dslist.entities.Cartoon;
import com.kalebits.dslist.projections.CartoonMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CartoonRepository extends JpaRepository<Cartoon, Long> {

    @Query(nativeQuery = true, value = """
		SELECT tbl_cartoon.id, tbl_cartoon.title, tbl_cartoon.cartoon_year AS cartoonYear, tbl_cartoon.img_url AS imgUrl,
		tbl_cartoon.short_description AS shortDescription, tb_belonging.position
		FROM tbl_cartoon
		INNER JOIN tb_belonging ON tbl_cartoon.id = tb_belonging.cartoon_id
		WHERE tb_belonging.list_id = :listId
		ORDER BY tb_belonging.position
			""")
    List<CartoonMinProjection> searchByList(Long listId);

}
