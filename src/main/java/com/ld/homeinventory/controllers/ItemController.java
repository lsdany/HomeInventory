package com.ld.homeinventory.controllers;

import com.ld.homeinventory.domain.Item;
import com.ld.homeinventory.services.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {

    private ItemService itemService;

    public ItemController(ItemService itemService){
        this.itemService = itemService;
    }

    @GetMapping()
    public List<Item> getItems(){
        return itemService.getItems();
    }



}
