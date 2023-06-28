package com.simplon.concepthotelmineur.controller;

import com.simplon.concepthotelmineur.entity.Hostel;
import com.simplon.concepthotelmineur.entity.Room;
import com.simplon.concepthotelmineur.entity.Type;
import com.simplon.concepthotelmineur.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class RoomController {

    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/rooms/types/{type}")
    public List<Room> getRoomsByType(Type type){
        return roomService.findRoomByType(type);
    }

    @GetMapping("/rooms/types/{hostel}")
    public List<Room> getRoomsByHostel(Hostel hostel){
        return roomService.findRoomByHostel(hostel);
    }
}
