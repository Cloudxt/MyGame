package com.pmdm.mygame;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.pmdm.mygame.MyGame;

public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new
				AndroidApplicationConfiguration();
//Deshabilitamos el uso del acelerómetro y la brújula.
		config.useAccelerometer = false;
		config.useCompass = false;
//Lanzamos el juego.
		initialize(new MyGame(), config);
	}
}

