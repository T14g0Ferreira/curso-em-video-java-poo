package Aula01.ObjetosConcretos;

public class Caneta {
    public String modelo;
    public String cor;
    public boolean tampada;

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Caneta de cor: " + this.cor);
        System.out.println("Está tampada? "+ this.tampada);
    }

    public void rabiscar(){
        if(tampada == true){
            System.out.println("Erro, caneta está tampada");
        } else {
            System.out.println("Rabiscando...");
        }
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }
}