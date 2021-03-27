public class Hero {
    private int health;
    private int damage;
    private String superAttack;

    public Hero(int health, int damage, String superAttack) {
        this.health = health;
        this.damage = damage;
        this.superAttack = superAttack;
    }

    public Hero() {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuperAttack() {
        return superAttack;
    }

    public void setSuperAttack(String superAttack) {
        this.superAttack = superAttack;
    }
}
