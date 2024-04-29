public class SmartPhone {
    public static void main(String[] args) {
        String pesquisar, tela, ligacão, portatil;
    }
    private String pesquisar;
    private String tela;
    private String ligacão;
    private String portatil;

    public SmartPhone(String pesquisar, String tela, String ligacão, String portatil){
        this.pesquisar = pesquisar;
        this.tela = tela;
        this.ligacão = ligacão;
        this.portatil = portatil;
    }
    public String getPesquisar(){
        return pesquisar;
    }
    public void setPesquisar(String pesquisar){
        this.pesquisar = pesquisar;
    }
    public String getTela(){
        return tela;
    }
    public void setTela(String tela){
        this.tela = tela;
    }
    public String getligacão(String ligacão){
        return ligacão;
    }
    public void setLigacão(String ligacão){
        this.ligacão = ligacão;
    }
    public String getPortatil(){
        return portatil;
    }
    public void setPortatil(String portatil){
        this.portatil = portatil;
    }
}
