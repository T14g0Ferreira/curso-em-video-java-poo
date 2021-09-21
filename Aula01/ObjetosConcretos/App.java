package Aula01.ObjetosConcretos;

public class App {
    public static void main(String[] args) {
        Caneta caneta = new Caneta();
        caneta.modelo = "BIC";
        caneta.cor = "Azul";
        System.out.println(" ==== CANETA ==== ");

        caneta.tampar();
        caneta.status();
        caneta.rabiscar();
        System.out.println(" ");

        caneta.destampar();
        caneta.status();
        caneta.rabiscar();
        System.out.println(" ");

        System.out.println(" ==== CADERNO ==== ");

        Caderno caderno = new Caderno();
        caderno.quantidadeMaterias = 10;

        caderno.abrir();
        caderno.status();
        caderno.rabiscar();

        System.out.println(" ");
        caderno.fechar();
        caderno.rabiscar();
        
    }
}
