package com.kalebits.dslist.services;

import com.kalebits.dslist.dto.CartoonDTO;
import com.kalebits.dslist.dto.CartoonListDTO;
import com.kalebits.dslist.dto.CartoonMinDTO;
import com.kalebits.dslist.entities.Cartoon;
import com.kalebits.dslist.entities.CartoonList;
import com.kalebits.dslist.repositories.CartoonListRepository;
import com.kalebits.dslist.repositories.CartoonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CartoonListService {

    @Autowired
    private CartoonListRepository cartoonListRepository;

    @Transactional(readOnly = true)
    public List<CartoonListDTO> findAll(){
        List<CartoonList> result = cartoonListRepository.findAll();
        List<CartoonListDTO> dto = result.stream().map(x -> new CartoonListDTO(x)).toList();
        return dto;
        // return result.stream().map(x -> new CartoonListDTO(x)).toList();
    }

}
