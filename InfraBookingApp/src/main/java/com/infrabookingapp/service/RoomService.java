package com.infrabookingapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infrabookingapp.dao.RoomDAO;
import com.infrabookingapp.entity.Room;

@Service
public class RoomService {
	
	@Autowired
	private RoomDAO roomDAO;
	
	public Room addRoom(Room room) {
		return this.roomDAO.save(room);
	}

}
