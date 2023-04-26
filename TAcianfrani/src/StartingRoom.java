public class StartingRoom extends MapTile {
    // Constructor Method
    // 2 usages
    public StartingRoom(int x, int y) {
        super(x, y); // Sets the x and y position properties in the superclass MapTile
    }

    // For class members and Local variables use LowerCamelcase
    // Override the intro_text method in the superclass MapTile
    public String intro_text() {
        return "In You find yourself in a cave with a flickering torch on the wall. \nYou can make out four paths, each equally as dark an";
    }

    public void modify_player(Player player) {
        // Implementation here
    }
}