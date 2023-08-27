public class MonsterTester {
    public static void main(String[] args){
        Monster enemy1 = new Monster();
        System.out.println(enemy1.loot);

        System.out.println("");

        Werewolf enemy2 = new Werewolf("night");
        System.out.println("Health Points: " + enemy2.healthPoints);
        System.out.println("Loot: " + enemy2.loot);


        System.out.println("");

        SkeletonDog dogFriend = new SkeletonDog();
        System.out.println("Monster Status: " + dogFriend.status);
        dogFriend.bark();
        dogFriend.shout();
        dogFriend.rattle();

        System.out.println("");

        Monster enemy = new Vampire();

        Monster[] groupOfEnemies = new Monster[4];
        groupOfEnemies[0] = new Vampire();
        groupOfEnemies[1] = new Skeleton();
        groupOfEnemies[2] = new Werewolf("night");
        groupOfEnemies[3] = new SkeletonSpider();

        for(Monster monster : groupOfEnemies){
            monster.moveAround();
            monster.attack();
        }
    }
}
