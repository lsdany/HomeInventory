package com.ld.homeinventory.repository;

import com.ld.homeinventory.domain.Room;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RoomRepository extends CrudRepository<Room, Long> {

    List<Room> findAll();

}
