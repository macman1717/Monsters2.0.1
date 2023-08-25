public class Vampire extends Monster{
    double healthPoints = 5000;
    double attackPower = 1000;

    Vampire(){
        this.loot = "1600 gold";
    }

    void fly(){
        //starts flying
    }
    void drinkBlood(){
        this.healthPoints += 500;
    }
}
