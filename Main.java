package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Hayvan hayvan = new Kopek(); // new Hayvan demek yerine kedi veya köpek diyip kodu azaltıyoruz.
        hayvan.sesCikar();
    }
}
