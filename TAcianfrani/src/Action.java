public class Action {
    private Method method;
    private char hotkey;
    public char getHotkey(){
        return hotkey;
    }
    public void setHotkey (char hotkey) {this.hotkey = hotkey;}

    private String name;
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    private Enemy kwargs;
    public Enemy getKwargs() {return kwargs;}
    public void setKwargs(Enemy kwargs) {this.kwargs = kwargs;}

    public Action(Method method, String name, char hotkey, Enemy kwargs){
        this.method = method;
        this.hotkey = hotkey;
        this.name = name;
        this.kwargs = kwargs;
    }

    public String str() {return hotkey + ": " + name;}


}
