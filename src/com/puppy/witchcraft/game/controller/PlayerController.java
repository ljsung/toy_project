package com.puppy.witchcraft.game.controller;

import com.puppy.witchcraft.game.model.dto.PlayerDTO;
import com.puppy.witchcraft.game.model.service.PlayerService;

public class PlayerController {

	private PlayerService playerservice = new PlayerService();
	
	public void insertplayer(PlayerDTO player) {

		int result = playerservice.insertplayer(player);
		//임시로 해둔거
		if(result > 0) {
			System.out.println("등록 성공");
		} else {
			System.out.println("등록 실패");
		}
	}

		

}
