public class Lampada {
    public static void main(String[] args) {
        String tamanho, cor, entrada;
        int voltagem;
    }
    private String tamanho;
    private String cor;
    private String entrada;
    private int voltagem;

    public Lampada(String tamanho, String cor, String entrada, int voltagem){
        this.tamanho =  tamanho;
        this.cor = cor;
        this.entrada = entrada;
        this.voltagem = voltagem;
    }
    public String getTamanho(){
        return tamanho;
    }
    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getEntrada(){
        return entrada;
    }
    public void setEntrada(String entrada){
        this.entrada = entrada;
    }
    public int getVoltagem(){
        return voltagem;
    }
    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
}
