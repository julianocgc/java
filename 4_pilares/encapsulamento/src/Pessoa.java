// getters e setters são usados para obter o valor de atributos e alterar esse valor
public class Pessoa {

    // String nome; // atributo desprotegido
    // int idade; // atributo desprotegido

    private String nome; // protegendo o atributo para ser acessado por getters e setters
    private int idade; // protegendo o atributo para ser acessado por getters e setters

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;    
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        if(idade > 0){ // validação para evitar idade negativa
        this.idade = idade;
        }
    }
}