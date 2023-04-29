public class BridgeTactical extends MapTile{

    public BridgeTactical(int x, int y) {
        super(x, y); // Sets the x and y position properties in the superclass MapTile
    }
    public String intro_text() {
        return " This is the ships Tactical Control, it\n allows for the ships security officer to\n prep and utilize ship phasers and\n photon torpedos on Voyager for defence. \n";
    }
}