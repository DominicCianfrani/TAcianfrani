public class LootRoom extends MapTile {
    // 3 usages
    Item item;
    // 5 usages
    public boolean pickedItem = false;
    // 3 usages
    public LootRoom(int x, int y, Item item) {
        super(x, y);
        this.item = item;
    }

    public void add_Loot(Player player) {
        player.inventory.add(item);
        pickedItem = true;
    }
}