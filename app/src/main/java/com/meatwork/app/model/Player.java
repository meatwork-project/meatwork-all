package com.meatwork.app.model;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.BelongsTo;
import org.javalite.activejdbc.annotations.IdGenerator;
import org.javalite.activejdbc.annotations.Table;

import java.util.UUID;

/*
 * Copyright (c) 2016 Taliro.
 * All rights reserved.
 */
@BelongsTo(parent = Weapon.class, foreignKeyName = "weapon_id")
@Table("player")
@IdGenerator("gen_random_uuid()")
public class Player extends Model {

	private enum Properties {
		ID,
		NAME,
		FORCE,
		ARMES
	}

	public Player() {

	}

	public String getId() {
		return getString(Properties.ID.name());
	}

	public String getName() {
		return getString(Properties.NAME.name());
	}

	public Integer getForce() {
		return getInteger(Properties.FORCE.name());
	}
	public Weapon getWeapon() {
		return (Weapon) get(Properties.ARMES.name());
	}

	public Player setName(String name) {
		return setString(Properties.NAME.name(), name);
	}

	public Player setForce(int force) {
		return setInteger(Properties.FORCE.name(), force);
	}

	public void setWeapon(Weapon weapon) {
		setParent(weapon);
	}

}
