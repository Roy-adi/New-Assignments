import java.util.Scanner;
public class circle {
 float radius;
  float pi = 3.5f;

  public circle() {
	  radius = 1.5f;
  }
  public circle(float radius) {
	  this.radius=radius;
  }
  public circle (float radius, float pi) {
	  this(radius);
	  this.pi=3.5f;
  }
  public float circleArea(float radius) {
	  return pi*radius*radius;
  }
  public float circumference(float radius) {
	  return 2*pi*radius;
  }
   public static void main(String[]args) {
	   circle obj = new circle();
	   Scanner sc = new Scanner(System.in);
	   System.out.println("input radius");
	   float a = sc.nextFloat();
	   System.out.println("area"+ obj.circleArea(a));
	   System.out.println("circumference"+obj.circumference(a));
   }
}
