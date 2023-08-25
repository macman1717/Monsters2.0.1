public class MonsterTester {
    public static void main(String[] args){
        Monster enemy1 = new Monster();
        System.out.println(enemy1.loot);
        System.out.println(enemy1.healthPoints);

        Werewolf enemy2 = new Werewolf("night");
        System.out.println(enemy2.form);
        enemy2.turnMan();
        System.out.println(enemy2.form);
        //typo for moveArround intentional
        enemy2.moveArround();

        SkeletonDog dogFriend = new SkeletonDog();
        System.out.println(dogFriend.status);
        dogFriend.bark();
        dogFriend.shout();
        dogFriend.rattle();


    }
}
