package com.ld.homeinventory.controllers;

import com.ld.homeinventory.domain.Item;
import com.ld.homeinventory.services.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author luisdany pernillo
 * @version 1.0
 */

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

    @PostMapping()
    public Item saveItem(@RequestBody Item item){
        return itemService.setItem(item);
    }



}
