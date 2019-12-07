package COMSC;

public class enemy1 {

    private double health = 20;
    private double attack = 20;
    private double luck = 0;
    private double golds = 200;

    public double getHealth() {return health;}
    public void setHealth(double health) {this.health= health;}

    public double getAttack() {return attack;}
    public void setAttack(double attack) {this.attack = health;}

    public double getLuck() {return luck;}
    public void setLuck(double luck) {this.luck = luck;}

    public double getGolds() {return golds;}
    public void setGolds(double golds) { this.golds = golds;}

    public void luckAffectStat(double luck)
    {
        double effect = luck / 100;
        this.attack = getAttack() - effect * (getAttack());
        this.health = getHealth() - effect * (getHealth());

    }
}
