package equalsHashcodeToString;

import java.util.HashSet;

public class PointTUI{
  
    public static void main(String[] args) {
    final Point p1 = new Point(10, 20);
    final Point p2 = new Point(60, 30);
    final Point p3 = new Point(10, 20);
    final HashSet<Point> points = new HashSet<Point>();
    points.add(p1);
    points.add(p2);
    points.add(p3);
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    System.out.println("--------------------\n");
    System.out.println(points);
    
  }
  
}