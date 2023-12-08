package projects.simulation.abstractEntity;

import projects.simulation.Map;
import projects.simulation.enums.Direction;

public abstract class Creature extends Entity {
    private int speed;
    private int hp = 100;

    public abstract void makeMove(Map map);
    @Override
    public boolean isResource() {
        return false;
    }

    public int getHp() {
        return hp;
    }

    public int getSpeed() {
        return speed;
    }

    protected void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }


}
