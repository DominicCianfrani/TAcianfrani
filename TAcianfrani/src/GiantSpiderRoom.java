public class GiantSpiderRoom extends EnemyRoom{
    GiantSpider enemy;

    public GiantSpiderRoom(int x, int y, GiantSpider enemy) {
        super(x, y, enemy);
        this.enemy=enemy;
    }

    public String intro_text(){
        if (enemy.is_alive()){
            return "A Giant SPider climbs to you from the ceiling above!";
        }else{
            return "The corpse of a dead Giant Spider rots on the ground.";
        }
    }
}
