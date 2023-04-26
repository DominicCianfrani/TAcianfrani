public class TreasureRoom extends LootRoom {
    // 6 usages

    public TreasureRoom(int x, int y, Gold geld) {
        super(x, y, geld);
        // TODO Auto-generated constructor stub
    }

    // Dagger room view details
    public String intro_text() {
        if (pickedItem == false)
            return String.format("You notice a gold coin with 15 stamped on the front.");
        else
            return "";
    }
}