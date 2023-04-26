public class FindArrowRoom extends LootRoom {
    // 6 usages

    public FindArrowRoom(int x, int y, Arrow arrow) {
        super(x, y, arrow);
        // TODO Auto-generated constructor stub
    }

    // Dagger room view details
    public String intro_text() {
        if (pickedItem == false)
            return String.format("You notice a small bundle of arrows!");
        else
            return "";
    }
}