package projects.simulation;

import projects.simulation.abstractEntity.Entity;

import java.util.HashMap;
//import projects.simulation.entity.Void;

public class Map {
    private Entity[][] map;

    protected Map(int n, int m) {
        map = new Entity[n][m];
    }

    public int getMaxX() {
        return map[0].length;
    }

    public int getMaxY() {
        return map.length;
    }

    public Entity[] getLine(int y) {
        return map[y];
    }
    public void setEntity(int x, int y, Entity entity) {
        map[y][x] = entity;
    }

    public Entity getObject(int x, int y) {
        return map[y][x];
    }


    public void render() {
        for (Entity[] list: map) {
            for (Entity entity: list) {
                if (entity == null) {
                    System.out.print("\uD83D\uDFE9 " );
                }
                else {
                    System.out.print(entity + " ");
                }

            }
            System.out.println();
        }
    }
}