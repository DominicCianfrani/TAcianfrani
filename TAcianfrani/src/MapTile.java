import java.util.ArrayList;

public class MapTile {
    int x;
    int y;

    public MapTile(int x, int y){
        this.x = x;
        this.y = y;
    }

    // Used code seen in class as a reference to get started
/*        public ArrayList<Action> adjacent_moves(){
        ArrayList<Action> moves = new ArrayList<Action>();
        if (World.tile_exists(x , y +1) != null)
            moves.add(new MoveEast());
        if (World.tile_exists(x , y -1) != null)
            moves.add(new MoveWest());
        if (World.tile_exists(x -1, y) != null)
            moves.add(new MoveNorth());
        if (World.tile_exists(x +1, y) != null)
            moves.add(new MoveSouth());
        return moves;
        }*/

        public ArrayList<Action> adjacent_moves() {
            ArrayList<Action> moves = new ArrayList<Action>();
            if (x > 0 && World._world[y][x - 1] != null) {
                moves.add(new MoveNorth());
            }
            if (x < World._world[y].length - 1 && World._world[y][x + 1] != null) {
                moves.add(new MoveSouth());
            }
            if (y > 0 && World._world[y - 1][x] != null) {
                moves.add(new MoveWest());
            }
            if (y < World._world.length - 1 && World._world[y + 1][x] != null) {
                moves.add(new MoveEast());
            }
            return moves;
        }

}
