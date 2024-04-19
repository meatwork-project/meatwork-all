package com.meatwork.app.event;

import com.meatwork.tools.api.ApplicationStartup;
import org.javalite.activejdbc.connection_config.DBConfiguration;

/*
 * Copyright (c) 2016 Taliro.
 * All rights reserved.
 */
public class DatabaseConfiguration implements ApplicationStartup {
	@Override
	public int priority() {
		return 1;
	}

	@Override
	public void run(String[] args) throws Exception {
		DBConfiguration.loadConfiguration("/database.properties");
	}
}
