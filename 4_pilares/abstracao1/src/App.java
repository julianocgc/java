public class App {
    public static void main(String[] args) {
        System.out.println("Exemplo de Abstração");

        Cachorro c = new Cachorro("Rex"); // instanciando a classe Cachorro
        Gato g = new Gato("Ted"); // instanciando a classe Gato

        // objeto Cachorro
        c.fazerSom(); // chama o método fazerSom da classe Cachorro
        c.dormir(); // chama o método dormir da classe Cachorro

        // objeto Gato
        g.fazerSom(); // chama o método fazerSom da classe Gato
        g.dormir(); // chama o método dormir da classe Gato
    }
}