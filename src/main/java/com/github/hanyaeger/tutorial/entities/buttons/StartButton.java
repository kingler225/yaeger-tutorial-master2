package com.github.hanyaeger.tutorial.entities.buttons;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.tutorial.Waterworld;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class StartButton extends TextEntity {
    private Waterworld waterworld;

    public StartButton(Coordinate2D initialLocation){
        super(initialLocation,"Play game");
        setFill(Color.PURPLE);
        setFont(Font.font("Roboto", FontWeight.BOLD, 30));
        this.waterworld = waterworld;
    }

    public void mouseButtonPressedListener() {

    }
    public void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2D){
        waterworld.setActiveScene(1);
    }

}
