import android.graphics.PointF;

import java.util.List;

public abstract class MovableObject extends GameWorldObject {
    private float _speed;
    protected Direction _direction;

    public PointF getLocation(){
        return _location;
    }

    protected PointF getNextLocation(){
        switch (_direction){
            case Up:
                return new PointF(_location.x, _location.y - _speed);
            case Down:
                return new PointF(_location.x, _location.y  + _speed);
            case Left:
                return new PointF(_location.x - _speed, _location.y );
            case Right:
                return new PointF(_location.x + _speed, _location.y );
            default:
                    return getLocation();
        }
    }

    public boolean canMove(){
        boolean canIMove = true;
        PointF nextLocation = getNextLocation();
        for (GameWorldObject obj: getOtherObjects())
            if(!obj.canIntersect())
                canIMove &= obj.isIntersect(nextLocation, _size);
        return canIMove;
    }

    public void move(){
        if(canMove())
            _location = getNextLocation();
    }

    public abstract List<GameWorldObject> getOtherObjects();


}
