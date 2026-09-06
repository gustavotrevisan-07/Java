void main() {
    String Nome = IO.readln("Informe o seu nome: ");
    String NotaG1Str = IO.readln("Informe sua nota da G1: ");
    String NotaG2Str = IO.readln("Informe sua nota da G2: ");
    double NotaG1 = Double.parseDouble(NotaG1Str);
    double NotaG2 = Double.parseDouble(NotaG2Str);
    double media = (NotaG1 + NotaG2) / 2;
    IO.println("Aluno:" + Nome + " Média: " + media + " G1: " + NotaG1 + " G2: " + NotaG2);

    System.out.printf("Aluno: %s - Média: %.2f (G1: %.2f - G2: %.2f)!\n ", Nome, media, NotaG1, NotaG2);
    IO.readln();
    if (media >= 7) // Quando é apenas uma instrução, não precisa de chaves {}
        IO.println("Parabéns!! Você foi aprovado!");
    else if( media >= 3) { 
            IO.println( "Voce ficou de exame!");
    }    else {
            IO.println("Infelizmente você foi reprovado!");
        }
    
}
