public class Computador {
    public static void main(String[] args) {
        String tipoProcessador;
        String serie;
        String calcular;
        String gerenciar;
    }
    private String tipoProcessador;
    private String serie;
    private String calcular;
    private String gerenciar;

    public Computador(String tipoProcessador, String serie, String calcular, String gerenciar) {
        this.tipoProcessador = tipoProcessador;
        this.serie = serie;
        this.calcular = calcular;
        this.gerenciar = gerenciar;
    }
    public String getTipoProcessador(){ 
        return tipoProcessador;
    }
    public void setTipoProcessador(String tipoProcessador) {
        this.tipoProcessador = tipoProcessador;
    }
    public String getSerie(){
        return serie;
    }
    public void setSerie(String serie) {
        this.serie = serie;
    }
    public String getCalcular() {
        return calcular;
    }
    public void setCalcular(String calcular) {
        this.calcular = calcular;
    }
    public String getGerenciar() {
        return gerenciar;
    }
    public void setGerenciar(String gerenciar) {
        this.gerenciar = gerenciar;
    }


}
