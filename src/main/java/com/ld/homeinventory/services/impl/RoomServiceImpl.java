package com.ld.homeinventory.services.impl;


import com.ld.homeinventory.domain.Room;
import com.ld.homeinventory.repository.RoomRepository;
import com.ld.homeinventory.services.RoomService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    private RoomRepository roomRepository;

    public RoomServiceImpl(RoomRepository roomRepository){
        this.roomRepository = roomRepository;
    }

    @Override
    public List<Room> getRooms() {
        return roomRepository.findAll();
    }

    @Override
    public Room setRoom(Room room) {
        return roomRepository.save(room);
    }
}
