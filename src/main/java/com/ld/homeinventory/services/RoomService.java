package com.ld.homeinventory.services;

import com.ld.homeinventory.domain.Item;
import com.ld.homeinventory.domain.Room;

import java.util.List;

public interface RoomService {

    List<Room> getRooms();
    Room setRoom(Room room);

}
