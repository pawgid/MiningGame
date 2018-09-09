package com.mining.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mining.game.MiningGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.title = "mining-game";
		config.useGL30 = false;
		config.width = 480;
		config.height = 320;

		new LwjglApplication(new MiningGame(), config);
	}
}
