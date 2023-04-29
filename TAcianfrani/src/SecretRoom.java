public class SecretRoom extends EnemyRoom{
    Vidian enemy;

    public SecretRoom(int x, int y, Vidian enemy) {
        super(x, y, enemy);
        this.enemy=enemy;
    }

    public String intro_text(){
        if (enemy.is_alive()){
            return " A surprise Vidian jumps you and Attacks!\n";
        }else{
            return "There is no one here.";
        }
    }
}
