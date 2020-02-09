import android.graphics.PointF;

public interface IIntersectable {

    boolean isIntersect(PointF location, PointF size);
    boolean canIntersect();
}
