// classe concreta que vai se transformar em um objeto
public class Gato extends Animal { // herda as propriedades da classe animal
    public Gato (String nome){
        super(nome); // chama o construtor da classe herdada (pai)
    }

    @Override // // implementando o método abstrato da classe Animal
    public void fazerSom(){
        System.out.println("Miau!"); // implementando o método
    }
}