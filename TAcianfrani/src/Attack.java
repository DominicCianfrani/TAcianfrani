public class Attack extends Action {

    public Attack(char hotkey, Enemy enemy, Player player) {
        super(Method.Attack, "Attack", hotkey, enemy);
    }

}