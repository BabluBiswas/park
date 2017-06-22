package Calc;

public class Triangle
{
  private double b,h;
  public Triangle(double d1, double d2)
        {
            b=d1;
            h=d2;
          }
      public void triangle()
          {
             System.out.println("area=" + (0.5*b*h));
          }
}