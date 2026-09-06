void main() { 
    String message = """
            Sistema de Biblioteca
            Escolha uma opção:
            1 - Cadastrar Livro
            2 - Listar Livros
            3 - Buscar Livro
            0 - Sair
            """;
    IO.println(message);
    String opcaoStr = IO.readln( "Digite uma opção: " );
    int opcao = Integer.parseInt(opcaoStr);
    switch (opcao) {
        case 1:
            IO.println("Cadastrando ...");
            break;
        case 2:
            IO.println("Listando livros ...");
            break;
        case 3:
            IO.println("Buscando livro ...");
            break;
        case 0:
            IO.println("Saindo ...");
            break;
        default:
            IO.println("Opção inválida!");
            break;
    }
}