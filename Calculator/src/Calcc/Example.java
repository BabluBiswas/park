package Calcc;

import Calcc.Multiply;
import Calcc.Divide;
import Calcc.Add;
import Calcc.Sub;

class Example

{
   public static void main(String args[])
     {
      Multiply obj1= new Multiply(10,5);
      obj1.mult();

       Divide obj2=new Divide(10,2);
      obj2.divide();
      
      Add obj3= new Add(20,5);
      obj3.sum();
      
      Sub obj4= new Sub(10,5);
      obj4.subtract();
}
}
