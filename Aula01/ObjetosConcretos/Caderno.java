package Aula01.ObjetosConcretos;

public class Caderno {
    public Integer quantidadeMaterias;
    public boolean rabiscada;
    public boolean aberta;

    public void status(){
        System.out.println("Quantidade de matérias: "+ this.quantidadeMaterias);
    }

    public void rabiscar(){
        if(aberta == false || aberta == true && rabiscada == true){
            System.out.println("Desculpe, rabisque em outra folha ou em outro caderno!");
        } else {
            System.out.println("Pode rabiscar à vontade");
        }
    }

    public void abrir(){
        this.aberta = true;
    }

    public void fechar(){
        this.aberta = false;
        System.out.println("Caderno fechado");
    }
}
