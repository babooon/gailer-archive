import java.awt.*;
import java.util.*;
import java.applet.*;
import javafx.*;

class linie extends Applet
{
  public void paint ( Graphics graph )
  {
    Point pointA = new Point( 10, 20 );
    Point pointB = new Point( 30, 70 );
    graph.drawLine( pointA.x, pointA.y, pointB.x, pointB.y );

    pointA.move( 20 , 20 );
    pointB.move( 40, 70 );

    graph.drawLine( pointA.x, pointA.y, pointB.x, pointB.y );

  }
}