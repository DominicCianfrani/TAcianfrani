public class EmptyCavePath extends MapTile{

    public EmptyCavePath(int x, int y) {
        super(x, y); // Sets the x and y position properties in the superclass MapTile
    }
    public String intro_text() {
        return "The hallway is empty here";
    }
}