public class HelmControlRoom extends MapTile{

    public HelmControlRoom(int x, int y) {
        super(x, y); // Sets the x and y position properties in the superclass MapTile
    }
    public String intro_text() {
        return " This is the ships Helm Control, it\n allows for the ships pilot to maneuver\n Voyager with highly advanced controls. Warp\n and Impulse are offline, we aren't\n going anywhere yet. \n";
    }
}