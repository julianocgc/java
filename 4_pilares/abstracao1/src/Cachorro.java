// classe concreta que vai se transformar em um objeto
public class Cachorro extends Animal{ // herda as propriedades da classe Animal

    public Cachorro(String nome) {
            super(nome); // chama o construtor da classe herdada (pai)
        }
    
        @Override // implementando o método abstrato da classe Animal
    public void fazerSom() {
        System.out.println("Au! Au!"); // implementando o método
    }
    
}