public class KazonRoom extends EnemyRoom{
    Kazon enemy;

    public KazonRoom(int x, int y, Kazon enemy) {
        super(x, y, enemy);
        this.enemy=enemy;
    }

    public String intro_text(){
        if (enemy.is_alive()){
            return "A angry Kazon approaches you!";
        }else{
            return "There is no one here";
        }
    }
}
