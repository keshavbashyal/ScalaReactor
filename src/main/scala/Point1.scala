/**
 * Created by keshavbashyal on 7/20/15.
 */
class Point1(xc: Int, yc: Int) {

  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
  }
  override def toString(): String = "(" + x + ", " + y + ")";

  def add (): Int ={
    return x+y
  }
}
