public class Werewolf extends Monster{
    String form;

    public Werewolf(String time){
        if(time.equalsIgnoreCase("night"))
            this.form = "Wolf";
        else
            this.form = "Man";
        this.loot = "Werewolf Blood";
    }
    void turnWolf(){
        this.form = "Wolf";
    }
    void turnMan(){
        this.form = "Man";
    }
}
