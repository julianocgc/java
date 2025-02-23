public class Carro {

    // atributos
    String nome;
    String marca;
    int ano;
    int vel;

    // métodos
    void acelerar(int aceleracao){ // parâmetro
        vel+=aceleracao;
    }

    void freiar(int reduzir){ // parâmetro
        vel-=reduzir;
    }

    void buzinar(){
        System.out.println("bibibi");
    }

}