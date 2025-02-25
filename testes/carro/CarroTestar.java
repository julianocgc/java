public class CarroTestar{ // criação da classe (LetraMaiuscula)

    public static void main(String[] args) { // método principal da classe (main)

        // instanciando o objeto carro
        Carro c1 = new Carro(); // (Letra Maiuscula e minuscula)

        // passando valores aos atributos do objeto carro (letra minuscula)
        c1.nome = "Uno";
        c1.marca = "Fiat";
        c1.ano = 2015;
        c1.vel = 60;

        // invocando o método acelerar (letra minuscula)
        c1.acelerar(10);
        System.out.println("Velocidade: " + c1.vel + " km/h");

        // invocando o método freiar (letra minuscula)
        c1.freiar(30);
        System.out.println("Velocidade: " + c1.vel + " km/h");
    }
}

