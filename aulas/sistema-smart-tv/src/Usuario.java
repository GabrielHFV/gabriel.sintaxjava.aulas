public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.err.println("TV ligada? " + smartTv.ligada);
        System.err.println("Canal atual: " +smartTv.canal);
        System.err.println("Volume Atual: " +smartTv.volume);

        smartTv.ligar ();
        System.err.println("Novo Staus TV ligada? " + smartTv.ligada);
        smartTv.desligar ();
        System.err.println("Novo Staus TV ligada? " + smartTv.ligada);


        smartTv.aumentarVolume();
        System.err.println("Volume Atual: " +smartTv.volume);
        smartTv.diminuirVolume();
        System.err.println("Volume Atual: " +smartTv.volume);

        smartTv.mudarCanal(13);
        System.err.println("Canal atual: " +smartTv.canal);



    }
}
