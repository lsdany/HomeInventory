package com.ld.homeinventory.services;

import com.ld.homeinventory.domain.Item;

import java.util.List;

public interface ItemService {

    List<Item> getItems();
    Item setItem(Item item);

}
