public class StartingRoom extends MapTile {
    // Constructor Method
    // 2 usages
    public StartingRoom(int x, int y) {
        super(x, y); // Sets the x and y position properties in the superclass MapTile
    }

    // For class members and Local variables use LowerCamelcase
    // Override the intro_text method in the superclass MapTile
    public String intro_text() {
        return "Holodeck Simulation Begin: \n You are on the USS Voyager trapped \n in the Delta Quadrent, you have\n been invaded by the Vidians.\n Your job is to sneak around and\n escape the ship. You are at\n the Bridge. As a StarFleet Officer\n you are not to attack any of the Vidians\n and must remain peaceful!\n Good Luck cadet!\n";
    }

    public void modify_player(Player player) {
        // Implementation here
    }
}