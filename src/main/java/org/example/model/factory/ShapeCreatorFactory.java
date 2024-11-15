package org.example.model.factory;

import org.example.model.MyShape;
import org.example.model.fill.Fill;
import org.example.model.fill.FillBehavior;
import org.example.model.fill.NoFill;

import java.awt.geom.RectangularShape;

public class ShapeCreatorFactory {


    private ShapeCreatorFactory(){

    }
    public void config(MenuState state){
        this.state = state;
    }
    public MyShape createShape(){
        MyShape newShape = new MyShape();
        RectangularShape shape = state.getShapeType().createShape();
        FillBehavior fillBehavior = state.isFill() ? new Fill() : new NoFill();
        fillBehavior.setShape(shape);
        fillBehavior.setColor(state.getColor());

        newShape.setFb(fillBehavior);

        return newShape;
    }
}
