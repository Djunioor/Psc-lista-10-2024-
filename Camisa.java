public class Camisa {
    public static void main(String[] args) {
        String cor, esquentar, vestir;
        int tamanho;
    }
    private String cor;
    private String esquentar;
    private String vestir;
    private int tamanho;

    public Camisa(String cor, String esquentar, String vestir, int tamanho){
        this.cor = cor;
        this.esquentar = esquentar;
        this.vestir =  vestir;
        this.tamanho = tamanho;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
        }
    public String getEsquentar(){
        return esquentar;
    }
    public void setEsquentar(String esquentar) {
        this.esquentar = esquentar;
    }
    public String getVestir(){
        return vestir;
    }
    public void setVestir(String vestir){
        this.vestir = vestir;
    }
    public int getTamanho(){
        return tamanho;
    }
    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }
}
