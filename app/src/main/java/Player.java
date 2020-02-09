import java.util.List;

public class Player extends MovableObject {

    @Override
    public List<GameWorldObject> getOtherObjects() {
        return null;
    }

    @Override
    public boolean canIntersect()
    {
        return false;
    }
}
