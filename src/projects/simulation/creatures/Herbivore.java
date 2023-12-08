package projects.simulation.creatures;

import projects.simulation.Map;
import projects.simulation.abstractEntity.Creature;
//import projects.simulation.entity.Void;

public class Herbivore extends Creature {

    public Herbivore() {
        this.setSpeed(1);
    }

    @Override
    public String toString() {
        return "\uD83E\uDDA3";
    }

    @Override
    public void makeMove(Map map) {
        if (map.getObject(this.getX()+1, this.getY()) == null) {
            map.setEntity(this.getX()+1, this.getY(), this);
            map.setEntity(this.getX(), this.getY(), null);
        }
    }
}
