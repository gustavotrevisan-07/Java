
void main() {
    String nome = IO.readln("Informe o seu nome: ");
    String pesoStr = IO.readln("Informe o seu peso: ");
    String alturaStr = IO.readln("Informe a sua altura: ");

    double peso = Double.parseDouble(pesoStr);
    double altura = Double.parseDouble(alturaStr);
    double imc = peso / (altura * altura);

    char genero = IO.readln(
        "Informe seu gênero (M: masculino, F: feminino, N: prefiro não informar): "
    ).charAt(0);

    String classificacao;

    switch (genero) {
        case 'M':
        case 'm':
            if (imc >= 40) {
                classificacao = "Obesidade Mórbida";
            } else if (imc >= 30) {
                classificacao = "Obesidade Moderada";
            } else if (imc >= 25) {
                classificacao = "Obesidade Leve";
            } else if (imc >= 20) {
                classificacao = "Normal";
            } else {
                classificacao = "Abaixo do Normal";
            }
            break;

        case 'F':
        case 'f':
        case 'N':
        case 'n':
            if (imc >= 39) {
                classificacao = "Obesidade Mórbida";
            } else if (imc >= 29) {
                classificacao = "Obesidade Moderada";
            } else if (imc >= 24) {
                classificacao = "Obesidade Leve";
            } else if (imc >= 19) {
                classificacao = "Normal";
            } else {
                classificacao = "Abaixo do Normal";
            }
            break;

        default:
            classificacao = "Gênero inválido";
            break;
    }

    IO.println("Nome: " + nome);
    IO.println("Gênero: " + genero);
    IO.println("IMC: " + imc);
    IO.println("Classificação: " + classificacao);
}