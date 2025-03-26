public class Usuario {
    public static void main(String[] args) throws Exception {
         
        SmartTV smartTV = new SmartTV();

        System.out.println("TV Ligada  " + smartTV.ligada);
        System.out.println("Canal atual " + smartTV.canal);
        System.out.println("Volume atual " + smartTV.volume);

        smartTV.ligar();
        smartTV.aumentarVolume();
        smartTV.mudarCanal(13);
        System.out.println("Novo Status TV Ligada " + smartTV.ligada);
        System.out.println("Volume atual: " + smartTV.volume);

        smartTV.desligar();
        smartTV.diminuirVolume();
        smartTV.aumentarCanal();
        System.out.println("Novo Status TV Ligada " + smartTV.ligada);
        System.out.println("Volume atual: " + smartTV.volume);
    }
}
