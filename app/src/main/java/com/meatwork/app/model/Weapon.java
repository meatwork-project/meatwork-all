package com.meatwork.app.model;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.HasMany;
import org.javalite.activejdbc.annotations.IdGenerator;
import org.javalite.activejdbc.annotations.Table;

import java.util.UUID;

/*
 * Copyright (c) 2016 Taliro.
 * All rights reserved.
 */
@HasMany(child = Player.class, foreignKeyName = "weapon_id")
@Table("Weapon")
@IdGenerator("gen_random_uuid()")
public class Weapon extends Model {

	private enum Properties {
		ID,
		NAME,
		DOMMAGE
	}

	public Weapon() {}

	public String getId() {
		return getString(Properties.ID.name());
	}

	public String getName() {
		return getString(Properties.NAME.name());
	}

	public Integer getDommage() {
		return getInteger(Properties.DOMMAGE.name());
	}

	public Weapon setName(String name) {
		return setString(Properties.NAME.name(), name);
	}

	public Weapon setDommage(int dommage) {
		return setInteger(Properties.DOMMAGE.name(), dommage);
	}

	public void addPlayer(Player player) {
		add(player);
	}
}
