package com.kalebits.dslist.controllers;

import com.kalebits.dslist.dto.CartoonListDTO;
import com.kalebits.dslist.dto.CartoonMinDTO;
import com.kalebits.dslist.services.CartoonListService;
import com.kalebits.dslist.services.CartoonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class CartoonListController {

    @Autowired
    private CartoonListService cartoonListService;

    @Autowired
    private CartoonService cartoonService;

    @GetMapping
    public List<CartoonListDTO> findAll(){
        List<CartoonListDTO> result = cartoonListService.findAll();
        return result;
    }

    @GetMapping(value ="/{listId}/games")
    public List<CartoonMinDTO> findByList(@PathVariable Long listId){
        List<CartoonMinDTO> result = cartoonService.findByList(listId);
        return result;
    }

}
