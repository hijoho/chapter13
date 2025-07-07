public class Hero {
    private int hp;
    private String name;
    private Sword sword;

    public Hero(String name, int hp) {
        this.setName(name);
        this.setHP(hp);
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {// 妥当性チェック
        if (name == null) {
            throw new IllegalArgumentException("名前がnullである。処理を中断。");
        }
        if (name.length() <= 1) {
            throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
        }
        if (name.length() >= 8) {
            throw new IllegalArgumentException("名前が長すぎる。処理を中断。");
        }
        this.name = name;
    }
    public int getHP(){
        return this.hp;
    }
    public void setHP(int hp){
        this.hp = hp;
        System.out.println(this.getName()+"の現在のHP: "+this.getHP());
    }
    void bye() {
        System.out.println("勇者は別れを告げた");
    }
    private void die() {
        System.out.println(this.getName() + "は死んでしまった！");
        System.out.println("GAME OVERです。");
    }
    public void sleep() {
        this.setHP(100);
        System.out.println(this.getName() + "は、眠って回復した！");
    }
    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("お化けキノコ" + m.getSuffix() + "から100ポイントの反撃を受けた");
        this.setHP(this.getHP() - 100);
        if (this.hp <= 0) {
            this.die();
        }
    }
}
