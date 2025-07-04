public class Matango {
    private int hp;
    final int LEVEL = 10;
    private char suffix;

    public Matango(int hp, char suffix) {
        this.setHP(hp);
        this.setSuffix(suffix);
    }

    public int getHP(){
        return this.hp;
    }
    public void setHP(int hp){
        this.hp = hp;
    }

    public char getSuffix(){
        return this.suffix;
    }
    public void setSuffix(char suffix){
        this.suffix = suffix;
    }

    public void run() {
        System.out.println("お化けキノコ" + this.getSuffix() + "は逃げ出した！");
    }
}
