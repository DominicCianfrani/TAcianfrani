public class TurboLift extends MapTile{

    public TurboLift(int x, int y) {
        super(x, y); // Sets the x and y position properties in the superclass MapTile
    }
    public String intro_text() {
        return " This is a Turbo lift and will take you off\n the Bridge to explore the rest of the ship. \n";
    }
}