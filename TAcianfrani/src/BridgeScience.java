public class BridgeScience extends MapTile{

    public BridgeScience(int x, int y) {
        super(x, y); // Sets the x and y position properties in the superclass MapTile
    }
    public String intro_text() {
        return " This is the ships Science Station, it\n allows for the ships crew to\n scan and research spacial anomalies. It\n can also be used to scan ships and weapons. \n";
    }
}