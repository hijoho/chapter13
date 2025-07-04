public class Main {
    public static void main(String[] args) {
        Hero h = new Hero("ミナト", 40);
        King k = new King();
        k.talk(h);
        Inn inn = new Inn();
        inn.checkIn(h);
        Matango m = new Matango(100, 'A');
        h.attack(m);
    }
}
