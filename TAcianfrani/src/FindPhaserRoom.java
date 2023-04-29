public class FindPhaserRoom extends LootRoom {
    // 6 usages

    public FindPhaserRoom(int x, int y, Phaser phaser) {
        super(x, y, phaser);
        // TODO Auto-generated constructor stub
    }

    // Dagger room view details
    public String intro_text() {
        if (pickedItem == false)
            return String.format(" You notice a Phaser! You must remain peaceful\n but it could be handy in the future!\n");
        else
            return "";
    }
}