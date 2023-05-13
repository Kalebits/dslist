package com.kalebits.dslist.controllers;

import com.kalebits.dslist.dto.CartoonListDTO;
import com.kalebits.dslist.services.CartoonListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class CartoonListController {

    @Autowired
    private CartoonListService cartoonListService;

    @GetMapping
    public List<CartoonListDTO> findAll(){
        List<CartoonListDTO> result = cartoonListService.findAll();
        return result;
    }


}
