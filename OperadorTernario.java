void main () { 
    int num = 7;
    if (num % 2 == 0) { 
        IO.println("Par");
    } else {
        IO.println("Impar");
    }

    String resultado = (num % 2 == 0) ? "Par" : "Impar";
    IO.println(resultado);
}