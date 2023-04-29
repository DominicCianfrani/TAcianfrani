public class FindBatteryRoom extends LootRoom {
    // 6 usages

    public FindBatteryRoom(int x, int y, BatteryPack batterypack) {
        super(x, y, batterypack);
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