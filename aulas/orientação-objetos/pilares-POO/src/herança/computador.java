package herança;

public class computador {
    public static void main(String[] args) {
        MsnMensager msn = new MsnMensager();
        System.out.println("msn");
        msn.enviarMensagem();
        msn.receberMensagem();

        facebookMensager face = new facebookMensager();
        System.out.println("face");
        face.enviarMensagem();
        face.receberMensagem();

        Telegram telegram = new Telegram();
        System.out.println("Telegram");
        telegram.enviarMensagem();
        telegram.receberMensagem();

    }
}
