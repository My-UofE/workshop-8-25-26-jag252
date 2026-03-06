
public class MovableCircle implements Movable {
  private MovablePoint center;
  private int radius;

  // TASK: Add the constructor here
  public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
		center = new MovablePoint(x, y, xSpeed, ySpeed);
    this.radius = radius;

	}

  public String toString() {
		return String.format("MovableCircle[center=MovablePoint[%s],radius=%s]", center, radius);
	}
  // TASK: Implement all abstract methods declared in the interface
  @Override
  public void moveUp() {
	 center.moveUp();// move the center up
  }

  @Override
  public void moveDown() {
    center.moveDown();
  }

  @Override
  public void moveLeft() {
    center.moveLeft();
  }

  @Override
  public void moveRight() {
    center.moveRight();
  }
}
