import android.graphics.PointF;

public interface IMovable extends  IIntersectable {
    PointF getNextLocation();
    boolean canMove();
    void move();
}
