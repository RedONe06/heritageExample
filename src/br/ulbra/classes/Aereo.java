package br.ulbra.classes;

public class Aereo extends Veiculo {
    
    private int numTurbinas;
    private int numParaquedas;

    public Aereo(int numTurbinas, int numParaquedas, String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.numTurbinas = numTurbinas;
        this.numParaquedas = numParaquedas;
    }

    public int getNumTurbinas() {
        return numTurbinas;
    }
    public void setNumTurbinas(int numTurbinas) {
        this.numTurbinas = numTurbinas;
    }

    public int getNumParaquedas() {
        return numParaquedas;
    }
    public void setNumParaquedas(int numParaquedas) {
        this.numParaquedas = numParaquedas;
    }
    
    public void andar(){
        System.out.println("Zuum");
    }
    public void freiar(){
        System.out.println("Flop");
    }
    public void buzinar(){
        System.out.println("Não sei buzinar");
    }

    @Override
    public String toString() {
        return "Aereo{" + "numTurbinas=" + numTurbinas + ", numParaquedas=" + numParaquedas + '}';
    }

}
