public class Mesa {

    public static void main(String[] args) {
        String com, tamanho, altura, largura;
    }
    private String com;
    private String tamanho;
    private String altura;
    private String largura;

    public Mesa (String com, String tamanho, String altura, String largura){
        this.com = com;
        this.tamanho = tamanho;
        this.altura = altura;
        this.largura = largura;
    }
    public String getCom(){
        return com;
    }
    public void setCom(String com){
        this.com = com;
    }
    public String getTamanho(){
        return tamanho;
    }
    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }
    public String getAltura(){
        return altura;
    }
    public void setAltura(String altura){
        this.altura = altura;
    }
    public String getLargura(){
        return largura;
    }
    public void setLargura(String largura){
        this.largura = largura;
    }
   
}
