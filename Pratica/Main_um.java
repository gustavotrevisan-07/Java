void main(){
    new Veiculo_um();


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

      
    IO.println("Veículo: " + fusca.getMarca() + " - " + fusca.getModelo());
    int tempoUsoFusca = fusca.calculaTempoUso();
    IO.println("Tempo de uso do Fusca: " + tempoUsoFusca + " anos");

    int tempoUsoFusca2030 = fusca.calculaTempoUso(2030);
    IO.println("Tempo de uso do Fusca em 2030: " + tempoUsoFusca2030 + " anos");


    int tempoUsoUno = uno.calculaTempoUso();
    IO.println("Tempo de uso do Uno: " + tempoUsoUno + " anos");
    
    System.out.printf("Tempo de uso do uno: %d anos", tempoUsoUno);
}

