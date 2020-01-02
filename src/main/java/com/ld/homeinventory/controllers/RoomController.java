package com.ld.homeinventory.controllers;

import com.ld.homeinventory.domain.Item;
import com.ld.homeinventory.domain.Room;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Luisdany Pernillo
 */

@RestController
public class RoomController {

//    @GetMapping
//    public void insertItem(Item item){
//
//    }

    @GetMapping("/items")
    public List<Room> getRoom(){
        return null;
    }



    @GetMapping
    public String getDummy(){
        return "hello";
    }


}
