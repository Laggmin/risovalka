package org.example.model.factory;

import java.awt.geom.*;

public enum ShapeType {
    RECTANGULAR {
        @Override
        public RectangularShape createShape() {
            return new Rectangle2D.Double();
        }
    },

    ELLIPSE {
        @Override
        public RectangularShape createShape(){
            return new Ellipse2D.Double();
        }
    };
    public abstract RectangularShape createShape();
}
