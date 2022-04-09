package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.tutorial.Waterworld;

public class GameLevel extends DynamicScene {
    @Override
    public void setupScene() {
        setBackgroundAudio("waterworld.mp3");
        setBackgroundImage("backgrounds/background2.jpg");

    }

    @Override
    public void setupEntities() {

    }
}
