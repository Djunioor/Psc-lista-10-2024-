public class Chave {
    public static void main(String[] args) {
        String metelica, pequena, travar, destravar;
    }
    private String metalica;
    private String pequena;
    private String travar;
    private String destravar;

    public Chave(String metalica, String pequena, String travar, String destravar){
        this.metalica = metalica;
        this.pequena = pequena;
        this.travar = travar;
        this.destravar = destravar;
    }
    public String getMetalica(){
        return metalica;
    }
    public void setMetalica(String metalica) {
        this.metalica = metalica;
    }
    public String getPequena(){
        return pequena;
    }
    public void setPequena(String pequena){
        this.pequena = pequena;
    }
    public String getTravar(){
        return travar;
    }
    public void setTravar(String travar){
        this.travar = travar;
    }
    public String getDestravar(){
        return destravar;
    }
     public void setDestravar(String destravar) {
        this.destravar = destravar;
     }   
}
