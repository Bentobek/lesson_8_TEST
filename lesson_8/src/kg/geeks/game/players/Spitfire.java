package kg.geeks.game.players;

public  class Spitfire extends Hero {
    public Spitfire(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.AGRESSION);
    }


    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (Hero hero : heroes) {
            if (hero.getHealth() == 0) {
                boss.setHealth(boss.getHealth() - 80);
                System.out.println(this.getName() + " deals 80 aggressive damage to the boss");
            }
            }
        }
    }
