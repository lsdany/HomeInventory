package com.ld.homeinventory.services.impl;

import com.ld.homeinventory.domain.Item;
import com.ld.homeinventory.repository.ItemRepository;
import com.ld.homeinventory.services.ItemService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    private ItemRepository itemRepository;

    public ItemServiceImpl(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    @Override
    public List<Item> getItems() {
        return itemRepository.findAll();
    }

    @Override
    public Item setItem(Item item) {
        return itemRepository.save(item);
    }
}
