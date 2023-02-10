package entities;

public class Item {
    private String nome;
    private int totalDeCaixas;
    private double cubagemPorCaixa;

    public Item() {
    }

    public Item(String nome, int totalDeCaixas, double cubagemPorCaixa) {
        this.nome = nome;
        this.totalDeCaixas = totalDeCaixas;
        this.cubagemPorCaixa = cubagemPorCaixa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotalDeCaixas() {
        return totalDeCaixas;
    }

    public void setTotalDeCaixas(int totalDeCaixas) {
        this.totalDeCaixas = totalDeCaixas;
    }

    public double getCubagemPorCaixa() {
        return cubagemPorCaixa;
    }

    public void setCubagemPorCaixa(double cubagemPorCaixa) {
        this.cubagemPorCaixa = cubagemPorCaixa;
    }

    public double totalPorItens() {
        return getTotalDeCaixas() * getCubagemPorCaixa();
    }
  
    

    @Override
    public String toString() {
        return "Nome do item: "+nome + ";\nTotal de caixas: " + totalDeCaixas+";";
    }
}
