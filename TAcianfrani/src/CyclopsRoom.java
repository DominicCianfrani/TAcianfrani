public class CyclopsRoom extends EnemyRoom{
    Ogre enemy;

    public CyclopsRoom(int x, int y, Ogre enemy) {
        super(x, y, enemy);
        this.enemy=enemy;
    }

    public String intro_text(){
        if (enemy.is_alive()){
            return "A Giant Cyclops comes out, the whole ground shivers at it's movement as it approaches you!!!";
        }else{
            return "The corpse of a dead Ogre rots on the ground.";
        }
    }
}
