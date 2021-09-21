package Aula01.ObjetosConcretos;

public class Caneta {
    public String modelo;
    public String cor;
    public boolean tampada;

    public void rabiscar(){
        if(tampada){
            System.out.println("Erro, caneta está tampada");
        } else {
            System.out.println("Rabiscando...");
        }
    }
}