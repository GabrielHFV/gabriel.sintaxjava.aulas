package autrodomo;
public class Autrodomo {

    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setPlaca("4515452");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setPlaca("65456356");
        z400.ligar();
    }
}