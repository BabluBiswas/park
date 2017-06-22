package Calc;

import Calc.Triangle;
import Calc.Rectangle;
import Calc.Square;
import Calc.Circle;

class Area

{
   public static void main(String args[])
     {
      Triangle obj1=new Triangle(10,5);
      obj1.triangle();

       Rectangle obj2=new Rectangle(10,5);
      obj2.rectangle();

      Square obj3=new Square(5);
      obj3.square();

      Circle obj4=new Circle(10);
      obj4.circle();
}
}
