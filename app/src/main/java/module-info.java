import com.google.inject.Module;
import com.meatwork.app.module.AppModule;
import com.meatwork.tools.api.ApplicationStartup;

/*
 * Copyright (c) 2016 Taliro.
 * All rights reserved.
 */
module com.meatwork.app {
	requires com.google.guice;
	requires com.meatwork.tools;
	requires com.meatwork.model;
	requires activejdbc;
	requires java.sql;
	opens com.meatwork.app;

	uses Module;
	uses ApplicationStartup;

	provides Module with AppModule;

	exports com.meatwork.app.event;
	exports com.meatwork.app.model;
}