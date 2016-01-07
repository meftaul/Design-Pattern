/**
 * @author meftaul
 * Jan 7, 2016
 *
 */

package com.meftaul.abstractfactorypattern;

import com.meftaul.abstractfactorypattern.colorfactory.Blue;
import com.meftaul.abstractfactorypattern.colorfactory.Color;
import com.meftaul.abstractfactorypattern.colorfactory.Green;
import com.meftaul.abstractfactorypattern.colorfactory.Red;
import com.meftaul.abstractfactorypattern.shapefactory.Shape;

public class ColorFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
	if (color == null) {
	    return null;
	}

	if (color.equalsIgnoreCase("RED")) {
	    return new Red();

	} else if (color.equalsIgnoreCase("GREEN")) {
	    return new Green();

	} else if (color.equalsIgnoreCase("BLUE")) {
	    return new Blue();
	}
	
	return null;
    }

    @Override
    Shape getShape(String shape) {
	return null;
    }

}
