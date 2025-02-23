public class CarroTestar{

    public static void main(String[] args) {

        // instanciando o objeto carro
        Carro c1 = new Carro();

        // atribuindo valores aos atributos do objeto carro
        c1.nome = "Uno";
        c1.marca = "Fiat";
        c1.ano = 2015;
        c1.vel = 60;

        // invocando o método acelerar
        c1.acelerar(10);
        System.out.println("Velocidade: " + c1.vel + " km/h");

        // invocando o método freiar
        c1.freiar(30);
        System.out.println("Velocidade: " + c1.vel + " km/h");
    }
}

