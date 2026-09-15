void main(){
    String catetoAStr = IO.readln("Informe o valor do Cateto A: ");
    String catetoBStr = IO.readln("Informe o valor do Cateto B: ");
    double catetoA = Double.parseDouble(catetoAStr);
    double catetoB = Double.parseDouble(catetoBStr);
    double hipotenusa = Math.sqrt((catetoA * catetoA) + Math.pow(catetoB, 2));
    IO.println("O valor da Hipotenusa é: " + hipotenusa);
    System.out.printf
        ("O valor da Hipotenusa é:%.2f (A: %.2f - B: %.2f)!!!\n ", hipotenusa, catetoA, catetoB);
    IO.readln();
}

