public class VidianRoom extends EnemyRoom{
    Vidian enemy;

    public VidianRoom(int x, int y, Vidian enemy) {
        super(x, y, enemy);
        this.enemy=enemy;
    }

    public String intro_text(){
        if (enemy.is_alive()){
            return " An tall alien with patchy grey skin that seems\n to be falling off in a space suit, with all\n kinds of tools at the ready approaches!\n";
        }else{
            return "There is a stunned Vidian on the ground";
        }
    }
}
