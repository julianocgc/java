public class Carro { //criação da classe (LetraMaiuscula)

    // atributos (letra minuscula)
    String nome;
    String marca;
    int ano;
    int vel;

    // métodos (letra minuscula)
    void acelerar(int aceleracao){ // parâmetro (letra minuscula)
        vel+=aceleracao;
    }

    void freiar(int reduzir){ // parâmetro (letra minuscula)
        vel-=reduzir;
    }

    void buzinar(){ // sem parâmetro
        System.out.println("bibibi");
    }

}