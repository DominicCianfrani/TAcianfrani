public class LeaveCaveRoom extends MapTile{

    public LeaveCaveRoom(int x, int y) {
        super(x, y); // Sets the x and y position properties in the superclass MapTile
    }
    public String intro_text() {
        return " You have escaped Voyager!\n You called for re-enforcments!\n They came to save you and your crew!\n Congratulations!";
    }
    public void modify_player (Player player){
        player.victory = true;
    }
}