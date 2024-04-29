public class Tv {
    public static void main(String[] args) {
        String retangular, ligar, desligar;
    }
    private String retangular;
    private String ligar;
    private String desligar;

    public Tv(String retangular, String ligar, String desligar){
        this.retangular = retangular;
        this.ligar = ligar;
        this.desligar = desligar;
    }
    public String getRetangular(){
        return retangular;
    }
    public void setRetangular(String retangular){
        this.retangular = retangular;
    }
    public String getLigar(){
        return ligar;
    }
    public void setLigar(String ligar){
        this.ligar = ligar;
    }
    public String getDesligar(){
        return desligar;
    }
    public void setDesligar(String desligar){
        this.desligar = desligar;
    }
}
