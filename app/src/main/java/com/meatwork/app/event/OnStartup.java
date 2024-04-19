package com.meatwork.app.event;

import com.meatwork.app.model.Player;
import com.meatwork.app.model.Weapon;
import com.meatwork.tools.api.ApplicationStartup;
import org.javalite.activejdbc.Base;
import org.javalite.activejdbc.DB;
import org.javalite.activejdbc.Model;

/*
 * Copyright (c) 2016 Taliro.
 * All rights reserved.
 */
public class OnStartup implements ApplicationStartup {
	@Override
	public void run(String[] args) throws Exception {
		try(DB db = Base.open()) {
			Weapon couteau = new Weapon()
					.setName("couteau")
					.setDommage(10);
			couteau.saveIt();
			Player player = new Player();
			player.setName("toto");
			player.setForce(10);
			player.setWeapon(couteau);
			player.saveIt();

			Player id = Player.findById(player.getId());
			System.out.println("ok");
		}
	}
}
