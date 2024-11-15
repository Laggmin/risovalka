package org.example.controller;

import org.example.model.MyShape;
import org.example.model.factory.ShapeType;

import javax.swing.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class MenuController {
    private static MenuController instance;
    private JMenuBar menuBar;
    private ActionDraw actionDraw;
    private MenuController(){
        menuBar = createMenuBar();
    }
    public static MenuController getInstance(){
        if (instance == null){
            instance = new MenuController();
        }
        return instance;
    }
    public JMenuBar createMenuBar(){
        JMenuBar menuBar = new JMenuBar();
        JMenu shapeMenu = createShapeMenu();
        menuBar.add(shapeMenu);

        return menuBar;
    }

//    public enum ShapeType{
//        RECTANGULAR, ELLIPSE
//    }


    private JMenu createShapeMenu() {

        JMenu shapeMenu = new JMenu("Фигура");
        ButtonGroup group = new ButtonGroup();
        //поменять на фабрику
        JRadioButtonMenuItem square = new JRadioButtonMenuItem("Прямоугольник");
        square.addActionListener(e -> state.setShapeType(ShapeType.ELLIPSE));
        shapeMenu.add(square);
        group.add(square);
        JRadioButtonMenuItem ellipse = new JRadioButtonMenuItem("Эллипс");
        ellipse.addActionListener(e -> state.setShapeType(ShapeType.ELLIPSE));
        shapeMenu.add(ellipse);
        group.add(ellipse);
        return shapeMenu;
    }

    public void setActionDraw(ActionDraw actionDraw) {
        this.actionDraw = actionDraw;
    }
}