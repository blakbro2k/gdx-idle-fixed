package com.github.czyzby.gdx.idle.gwt;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import com.github.czyzby.autumn.gwt.scanner.GwtClassScanner;
import com.github.czyzby.autumn.mvc.application.AutumnApplication;
import com.github.czyzby.gdx.idle.Config;

public class GwtLauncher extends GwtApplication {
    @Override
    public GwtApplicationConfiguration getConfig() {
        return new GwtApplicationConfiguration(512, 512);
    }

    @Override
    public ApplicationListener createApplicationListener() {
        return new AutumnApplication(new GwtClassScanner(), Config.class);
    }
}