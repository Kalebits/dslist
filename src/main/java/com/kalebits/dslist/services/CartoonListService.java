package com.kalebits.dslist.services;

import com.kalebits.dslist.dto.CartoonDTO;
import com.kalebits.dslist.dto.CartoonListDTO;
import com.kalebits.dslist.dto.CartoonMinDTO;
import com.kalebits.dslist.entities.Cartoon;
import com.kalebits.dslist.entities.CartoonList;
import com.kalebits.dslist.projections.CartoonMinProjection;
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

    @Autowired
    private CartoonRepository cartoonRepository;
    @Transactional(readOnly = true)
    public List<CartoonListDTO> findAll(){
        List<CartoonList> result = cartoonListRepository.findAll();
        List<CartoonListDTO> dto = result.stream().map(x -> new CartoonListDTO(x)).toList();
        return dto;
        // return result.stream().map(x -> new CartoonListDTO(x)).toList();
    }


    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex){
        List<CartoonMinProjection> list = cartoonRepository.searchByList(listId);

        CartoonMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;

        int max = destinationIndex < sourceIndex ? sourceIndex : destinationIndex;

        for(int i = min; i <= max; i++){
            cartoonListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }
    }
}
