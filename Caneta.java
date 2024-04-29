public class Caneta {
    public static void main(String[] args) {
        String esferica, tubular, escrever, pintar;
    }
    private String esferica;
    private String tubular;
    private String escrever;
    private String pintar;

    public Caneta(String esferica, String tubular, String escrever, String pintar){
        this.esferica = esferica;
        this.escrever = escrever;
        this.tubular = tubular;
        this.pintar = pintar;
    }
    public String getEsferica(){
        return esferica;
    }
    public void setEsferica(String esferica) {
        this.esferica = esferica;
    }
    public String getEscrever() {
        return escrever;
    }
    public void setEscrever(String escrever){ 
        this.escrever = escrever;
    }
    public String getTubular(){
        return tubular;
    }
        public void setTubular(String tubular) { 
            this.tubular = tubular;
        }
    public String getPintar() { 
        return pintar;
    }
    public void setPintar(String pintar){ 
        this.pintar = pintar;
    }

}
