package projects.simulation.abstractEntity;

import projects.simulation.enums.Direction;

public abstract class Entity {
    private int x;
    private int y;

//    public Entity(Point point) {
//        this.point = point;
//    }

    public int getX(){
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY(){
        return y;
    }

    public abstract boolean isResource();
}
