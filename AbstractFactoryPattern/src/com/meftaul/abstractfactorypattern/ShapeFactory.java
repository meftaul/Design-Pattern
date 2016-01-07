/**
 * @author meftaul
 * Jan 7, 2016
 *
 */

package com.meftaul.abstractfactorypattern;

import com.meftaul.abstractfactorypattern.colorfactory.Color;
import com.meftaul.abstractfactorypattern.shapefactory.Circle;
import com.meftaul.abstractfactorypattern.shapefactory.Rectangle;
import com.meftaul.abstractfactorypattern.shapefactory.Shape;
import com.meftaul.abstractfactorypattern.shapefactory.Square;

public class ShapeFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
	return null;
    }

    @Override
    Shape getShape(String shapeType) {

	if (shapeType == null) {
	    return null;
	}

	if (shapeType.equalsIgnoreCase("CIRCLE")) {
	    return new Circle();

	} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
	    return new Rectangle();

	} else if (shapeType.equalsIgnoreCase("SQUARE")) {
	    return new Square();
	}

	return null;
    }

}
