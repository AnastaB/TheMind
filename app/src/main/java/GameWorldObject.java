import android.graphics.PointF;

public abstract class GameWorldObject implements IIntersectable {
    protected PointF _location;
    protected PointF _size;

    @Override
    public boolean isIntersect(PointF location, PointF size) {
        return (_location.x > location.x+size.x || _location.x+_size.x < location.x) &&
                (_location.y > location.y+size.y || _location.y+_size.y < location.y);
    }
}

