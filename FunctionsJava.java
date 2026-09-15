void main(){
    imprimeOi();
    String saudacao = retornaOi();
    String maiusculo = converterMaiusculo(saudacao);
}
void imprimeOi() {
    IO.println("Oi");
}
String retornaOi() {
    return "Oi";
}
String converterMaiusculo(String texto){
    return texto.toUpperCase();
}