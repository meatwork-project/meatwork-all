package com.meatwork.app.module;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;
import com.meatwork.app.event.DatabaseConfiguration;
import com.meatwork.app.event.OnStartup;
import com.meatwork.tools.api.ApplicationStartup;

/*
 * Copyright (c) 2016 Taliro.
 * All rights reserved.
 */
public class AppModule extends AbstractModule {

	@Override
	protected void configure() {
		Multibinder
				.newSetBinder(
						binder(),
						ApplicationStartup.class
				)
				.addBinding()
				.to(OnStartup.class);
		Multibinder
				.newSetBinder(
						binder(),
						ApplicationStartup.class
				)
				.addBinding()
				.to(DatabaseConfiguration.class);
	}
}
