package nl.han.ica.brorio;

import nl.han.ica.OOPDProcessingEngineHAN.Engine.GameEngine;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;
import nl.han.ica.OOPDProcessingEngineHAN.Tile.Tile;
import nl.han.ica.OOPDProcessingEngineHAN.Tile.TileMap;
import nl.han.ica.OOPDProcessingEngineHAN.Tile.TileType;
import nl.han.ica.OOPDProcessingEngineHAN.View.View;
import processing.core.PImage;

import java.awt.*;


public class Launcher extends GameEngine {

    View view;
    private int width = 1000, height = 700;

    public static void main(String args[]) {
        Launcher launcher = new Launcher();
        launcher.runSketch();

    }

    @Override
    public void setupGame() {
        view = new View(width, height);
        setView(view);
        size(width, height);
        initializeMap();

    }

    @Override
    public void update() {
        view.setBackground(0, 0, 255);


    }


    private void initializeMap() {
        Sprite sprite_sheet = new Sprite("src/main/java/nl/han/ica/brorio/resources/textures/tiles_spritesheet.png");
        Tile tile = new Tile(sprite_sheet);

   
    }
}