// o encapsulamento é uma técnica usada para proteger os dados internos de uma classe e fornecer um acesso controlado a esses dados.
public class App {
    public static void main(String[] args) {

        // Pessoa p = new Pessoa();
        // p.nome = "Maria";
        // p.idade = -23; // não é possível atribuir um valor negativo para a idade mas não existe um controle
        
        Pessoa p = new Pessoa();
        p.setNome("Maria");
        p.setIdade(23); // com o encapsulamento os dados não podem ser acessados de forma direta

        System.out.println(p.getIdade());
    }
}