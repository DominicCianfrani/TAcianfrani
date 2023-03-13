import java.util.ArrayList;

public class MapTile {
    int x;
    int y;

    public MapTile(int x, int y){
        this.x = x;
        this.y = y;
    }

        public ArrayList<Action> adjacent_moves(){
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
        }

}
