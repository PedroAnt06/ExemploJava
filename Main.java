public class Main {
    public static void main(String[] args) {
//        Cachorro cachorro = new Cachorro("pumba");
//        System.out.println("O nome: ");
//        System.out.println(cachorro.getNome());
//        System.out.println("Ação: ");
//        cachorro.fazerSom();
//        cachorro.dormir();

        System.out.println("Acoes do carro:");
        Carro carro = new Carro();
        carro.acelerar();
        carro.frear();

        System.out.println("Acoes da moto:");
        Moto moto = new Moto();
        moto.acelerar();
        moto.frear();
        moto.voar();
    }
}
