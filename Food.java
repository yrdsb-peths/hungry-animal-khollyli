import greenfoot.*;

import java.util.List;
import java.util.ArrayList;

/**
 * Animal. This is the base class for all animals. In addition to the standard Actor
 * methods, it provides methods to check for being at the edge of the world, as well as
 * seeing and eating other classes.
 * 
 * @author Michael Kolling
 * @version 2.0
 */
public abstract class Food extends Actor
{
    int value;
    
    public Food(int value)
    {
        this.value = value;
    }
}