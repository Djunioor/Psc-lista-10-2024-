public class Carro {

    public static void main(String[] args) {
        String modelo;
        String marca;
        int ano;
    }
    private String modelo;
    private String marca;
    private int ano;
    
    public Carro(String modelo, String marca, int ano){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
       
    }
    public String getModelo() { 
        return modelo;
    }
    public void setModelo(String modelo){ 
        this.modelo = modelo;
    }
    public String getmarca() {
        return marca;
    }
    public void SetMarca(String moodelo){ 
        this.marca = marca;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano){ 
        this.ano = ano;
    }
    public void locomover() { 
        System.out.println("O carro anda ");
    }
    public void frear() { 
        System.out.println("O carro esta freiando ");
    }
        
 }

