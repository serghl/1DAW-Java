

package equalsHashcodeToString;

import java.util.HashSet;

public class Point {
  private int x;
  private int y;
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
  public int getX() {
    return x;
  }
  public void setX(final int x) {
    this.x = x;
  }
  public int getY() {
    return y;
  }
  public void setY(final int y) {
    this.y = y;
  }
  
  @Override
  public String toString() {
    return "Point = {"+ super.toString() + ", x = " + this.x 
      + ", y = " + this.y + "}\n";
  }
  
  
  @Override
  public boolean equals(final Object object) {
    if (this == object) return true;
    if (!(object instanceof Point)) return false;
    final Point punt = (Point) object;
    return (this.x == punt.x) && (this.y == punt.y);
  }
  
  
  @Override
  public int hashCode() {
    return x * 31 + y;
  }
  

}