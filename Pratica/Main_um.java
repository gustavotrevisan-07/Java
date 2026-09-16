void main(){
    Veiculo_um fusca = new Veiculo_um();
    fusca.marca = "Volkswagen";
    fusca.modelo = "Fusca do Itamar - Série Ouro";
    fusca.ano = 1995;
    fusca.placa = "ABC-1234";
    
    Veiculo_um
    uno = new Veiculo_um();
    uno.marca = "Fiat";
    uno.modelo = "Uno Mille";
    uno.ano = 2000;
    uno.placa = "DEF-5678"; 

    Veiculo_um novoUno = uno;
    novoUno.ano = 2014;
    

    Veiculo_um brasilia = new Veiculo_um("Volkswagen", "Brasília", 1975, "GHI-9012");
}
