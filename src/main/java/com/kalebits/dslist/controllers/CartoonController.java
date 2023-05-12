package com.kalebits.dslist.controllers;


import com.kalebits.dslist.dto.CartoonMinDTO;
import com.kalebits.dslist.entities.Cartoon;
import com.kalebits.dslist.services.CartoonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/cartoons")
public class CartoonController {

    @Autowired
    private CartoonService cartoonService;

    @GetMapping
    public List<CartoonMinDTO> findAll(){
        List<CartoonMinDTO> result = cartoonService.findAll();
        return result;
    }

}
