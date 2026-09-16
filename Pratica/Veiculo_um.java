class Veiculo_um {
    String marca;
    String modelo;
    int ano;
    String placa;

    public Veiculo_um(){

    }

    public Veiculo_um(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }

    int calculaTempoUso(){
        int anoAtual = LocalDate.now().getYear();
        return anoAtual - this.ano;
        
    }
}