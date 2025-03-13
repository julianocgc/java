// temos o polimorfismo sobreescrita (@Override) e o polimorfismo sobrecarregado
public class App {
    public static void main(String[] args){

        Pessoa p = new Pessoa();
        Funcionario f = new Funcionario();

        p.falar();
        f.falar();

        System.out.println("Exemplo de Polimorfismo!");
    }
}