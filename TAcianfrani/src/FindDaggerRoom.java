public class FindDaggerRoom extends LootRoom {
    // 6 usages

    public FindDaggerRoom(int x, int y, Sword sword) {
        super(x, y, sword);
        // TODO Auto-generated constructor stub
    }

    // Dagger room view details
    public String intro_text() {
        if (pickedItem == false)
            return String.format("You notice a small dagger in the ground! You can use this");
        else
            return "";
    }
}