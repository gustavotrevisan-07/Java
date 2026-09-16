import java.time.LocalDate;

class Veiculo_um {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;

    public Veiculo_um(){

    }

    public Veiculo_um(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (!marca.equalIgnoreCase("Peugeot"))
            this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo.toUpperCase();
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (validaPlaca(placa))
            this.placa = placa;
    }


    public int calculaTempoUso(){
        int anoAtual = LocalDate.now().getYear();
        return calculaTempoUso(anoAtual);

    }

    public int calculaTempoUso(int anoBase){
        return anoBase - this.ano - 1;
    }

    private boolean validaPlaca(String placa) {
        String regex = "^[A-Z]{3}-?[0-9]{4}|[A-Z]{3}[0-9][A-Z][0-9]{2}$";
        return placa.matches(regex);
}