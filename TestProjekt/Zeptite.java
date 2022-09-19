public class Zeptite {
    private int attack, hp, defense;
    private Boolean frozen = false;

    public Zeptite(int attack, int hp, int defense) {
        this.attack = attack;
        this.hp = hp;
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }


}