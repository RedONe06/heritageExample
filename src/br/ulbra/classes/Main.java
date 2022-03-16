package br.ulbra.classes;

//@author Andriele Joras dos Santos
//15/03/22

public class Main {
    public static void main (String[] args){
        Veiculo veiculo = new Veiculo("Marca", "Modelo", 2022);
        veiculo.andar();
        veiculo.buzinar();
        veiculo.freiar();
        
        Terrestre terrestre = new Terrestre(4, 2, "Hyundai", "Modelo da hyundai", 2022);
        terrestre.andar();
        terrestre.buzinar();
        terrestre.freiar();
        
        Anfibio anfibio = new Anfibio(2, 7, "Marca de navio", "Modelo do navio", 2022);
        anfibio.andar();
        anfibio.buzinar();
        
    }
    
}
