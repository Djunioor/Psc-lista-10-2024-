public class ArCondicionado {
    public static void main(String[] args) {
        String modelo, marca, gelar, esquentar;
    }
    private String modelo;
    private String marca;
    private String gelar;
    private String esquentar;

    public ArCondicionado(String modelo, String marca, String gelar, String esquentar){
        this.modelo = modelo;
        this.marca = marca;
        this.gelar = gelar;
        this.esquentar = esquentar;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getGelar(){
        return gelar;
    }
    public void setGelar(String gelar){
        this.gelar = gelar;
    }
    public String getEsquentar(){
        return esquentar;
    }
    public void setEsquentar(String esquentar){
        this.esquentar = esquentar;
        
    }
}
