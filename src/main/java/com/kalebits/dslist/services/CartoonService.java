package com.kalebits.dslist.services;

import com.kalebits.dslist.dto.CartoonDTO;
import com.kalebits.dslist.dto.CartoonMinDTO;
import com.kalebits.dslist.entities.Cartoon;
import com.kalebits.dslist.projections.CartoonMinProjection;
import com.kalebits.dslist.repositories.CartoonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CartoonService {

    @Autowired
    private CartoonRepository cartoonRepository;



    @Transactional(readOnly = true)
    public CartoonDTO findByID(Long id){
        Cartoon result = cartoonRepository.findById(id).get();
        CartoonDTO dto = new CartoonDTO(result);
        return dto;
        // return new CartoonDTO(result);
    }

    @Transactional(readOnly = true)
    public List<CartoonMinDTO> findAll(){
        List<Cartoon> result = cartoonRepository.findAll();
        List<CartoonMinDTO> dto = result.stream().map(x -> new CartoonMinDTO(x)).toList();
        return dto;
        // return result.stream().map(x -> new CartoonMinDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public List<CartoonMinDTO> findByList(Long listId){
        List<CartoonMinProjection> result = cartoonRepository.searchByList(listId);
        List<CartoonMinDTO> dto = result.stream().map(x -> new CartoonMinDTO(x)).toList();
        return dto;
        // return result.stream().map(x -> new CartoonMinDTO(x)).toList();
    }
}
