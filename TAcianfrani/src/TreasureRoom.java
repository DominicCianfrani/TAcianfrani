public class TreasureRoom extends LootRoom {
    // 6 usages

    public TreasureRoom(int x, int y, Gold geld) {
        super(x, y, geld);
        // TODO Auto-generated constructor stub
    }

    // Dagger room view details
    public String intro_text() {
        if (pickedItem == false)
            return String.format("You notice a piece of gold pressed latinum with a 10 pressed into it!");
        else
            return "";
    }
}