// classe abstrata que só serve de referência para outras classes e não se transforma em um objeto
// classes abstratas não podem ser instanciadas
public abstract class Animal { // classe abstrata
    String nome;

    public Animal(String nome) {
        this.nome = nome; // atributo
    }

    public abstract void fazerSom(); // método abstrato = não preciso fazerc a sua implementação que será feita por quem herdar as características, propriedades e métodos da classe Animal

    public void dormir(){ // método concreto = deve ser implementado
        System.out.println(nome + " está dormindo");
    }
}