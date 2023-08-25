public class Monster {
    double healthPoints = 100;
    double attackPower = 10;
    String status = "Hostile";
    String loot = "15 gold";


    void moveArround(){
        //moves around the video game
    }
    void attack(){
        //attacks the closest object
    }
    void shout(){
        System.out.println ("ARRRRR!");
    }
    void die(Player a){
        a.getLoot(this.loot);
    }

}
