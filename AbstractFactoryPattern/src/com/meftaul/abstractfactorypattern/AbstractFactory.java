/**
 * @author meftaul
 * Jan 7, 2016
 *
 */

package com.meftaul.abstractfactorypattern;

import com.meftaul.abstractfactorypattern.colorfactory.Color;
import com.meftaul.abstractfactorypattern.shapefactory.Shape;

public abstract class AbstractFactory {
    
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);

}
