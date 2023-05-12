package com.kalebits.dslist.services;

import com.kalebits.dslist.dto.CartoonMinDTO;
import com.kalebits.dslist.entities.Cartoon;
import com.kalebits.dslist.repositories.CartoonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartoonService {

    @Autowired
    private CartoonRepository cartoonRepository;

    public List<CartoonMinDTO> findAll(){
        List<Cartoon> result = cartoonRepository.findAll();
        List<CartoonMinDTO> dto = result.stream().map(x -> new CartoonMinDTO(x)).toList();
        return dto;
        // return result.stream().map(x -> new CartoonMinDTO(x)).toList();
    }
}
