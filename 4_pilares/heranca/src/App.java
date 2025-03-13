// com a herança conseguimos reutilizar códigos
public class App {
    public static void main(String[] args){
        
        Camaro c = new Camaro();
        Ferrari f = new Ferrari();

        c.ligar();
        f.ligar();
    }
}
