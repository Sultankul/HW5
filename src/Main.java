public class Main {
    public static void main(String[] args) {
    Boss boss = new Boss();
    boss.setHealth(500);
    boss.setDamage(50);
    boss.setTypeOfProtect("Tank");
    System.out.print("Boss Damage: " + boss.getDamage() + " Boss health: "+ boss.getHealth()+" Boss type of protect : " + boss.getTypeOfProtect());

    }
}
