public class LeaveCaveRoom extends MapTile{

    public LeaveCaveRoom(int x, int y) {
        super(x, y); // Sets the x and y position properties in the superclass MapTile
    }
    public String intro_text() {
        return "You have completed your journey! Congratulations!";
    }
    public void modify_player (Player player){
        player.victory = true;
    }
}