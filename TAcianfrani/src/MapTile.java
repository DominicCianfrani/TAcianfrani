import java.util.ArrayList;

public class MapTile {
    int x;
    int y;

    public MapTile(int x, int y){
        this.x = x;
        this.y = y;
    }

        public ArrayList<Action> adjacent_moves() {
            ArrayList<Action> moves = new ArrayList<Action>();
            if (x > 0) {
                moves.add(new MoveNorth());
            }
            if (x < 0) {
                moves.add(new MoveSouth());
            }
            if (y > 0) {
                moves.add(new MoveWest());
            }
            if (y < 0) {
                moves.add(new MoveEast());
            }
            return moves;
        }

}
