// não é possível sobrecarregar um método usando o mesmo tipo de dado
// posso usar o mesmo nome desde que o tipo de dado passado como parâmetro seja diferente
public class Pessoa {

    public void falar(){
        System.out.println("Olá, eu sou uma pessoa!");
    }

    public void falar(String texto){ // sobrecarregando o método
        System.out.println("Oi! " + texto);
    }

    public void falar(String texto, int quantidade){ // mudando a assinatura do método
        System.out.println("Oi!");
    }

    public void falar(int quantidade){ 
        System.out.println("Oi!");    
    }
}