public class Gold extends Item{
    private int amt;

    public Gold(int amtInt){
        super("Gold Pressed Latinum", "Large Latinum Bar!",10);
        this.amt = amtInt;
    }
    public int getAmt() {
        return amt;
    }

    public void setAmt(int amt) {
        this.amt = amt;
    }
}
