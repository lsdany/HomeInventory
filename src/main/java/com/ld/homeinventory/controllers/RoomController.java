package com.ld.homeinventory.controllers;

import com.ld.homeinventory.domain.Room;
import com.ld.homeinventory.services.RoomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Luisdany Pernillo
 * @version 1.0
 */

@RestController
public class RoomController {

    private RoomService roomService;

    public RoomController(RoomService roomService){
        this.roomService = roomService;
    }


    @GetMapping("/rooms")
    public List<Room> getRoom(){
        return roomService.getRooms();
    }

    @PostMapping("/room")
    public Room setRoom(@RequestBody Room room){
        return roomService.setRoom(room);
    }


}
