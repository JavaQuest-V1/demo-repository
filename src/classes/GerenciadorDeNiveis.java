package classes;

public class GerenciadorDeNiveis {

    public static DesafioProgramacao[] carregarNivel(int nivel) {
        DesafioProgramacao[] fase = new DesafioProgramacao[10];
        DesafioProgramacao p1, p2, p3;

        switch (nivel) {
            case 1:
                // O código é: int x = 5;
                p1 = new DesafioProgramacao("Bug da Variável", "int x = 5;",
                        new String[]{"= 5;", "int", "x"}, "231");

                // O código é: double pi = 3.14;
                p2 = new DesafioProgramacao("Bug do Ponto Flutuante", "double pi = 3.14;",
                        new String[]{"pi", "3.14;", "double", "="}, "3142");

                // O código é: boolean ativo = true;
                p3 = new DesafioProgramacao("Bug Booleano", "boolean ativo = true;",
                        new String[]{"ativo", "boolean", "= true;"}, "213");
                break;
            case 2:
                // O código é: if (x > 0) {}
                p1 = new DesafioProgramacao("Monstro Condicional", "if (x > 0) {}",
                        new String[]{"(x > 0)", "{}", "if"}, "312");

                // O código é: while (true) {}
                p2 = new DesafioProgramacao("Espírito do Loop Infinito", "while (true) {}",
                        new String[]{"true)", "(", "{}", "while"}, "4213");

                // O código é: for (int i=0; i<10; i++)
                p3 = new DesafioProgramacao("Esqueleto do For", "for (int i=0; i<10; i++)",
                        new String[]{"for", "i++)", "(int i=0;", "i<10;"}, "1342");
                break;
            default:
                // Padrão para os outros níveis (Você pode editar depois)
                p1 = new DesafioProgramacao("Bug Desconhecido", "System.out.println(\"Java\");",
                        new String[]{"System.out", "(\"Java\");", ".println"}, "132");
                p2 = p1;
                p3 = p1;
        }

        // Preenche as 10 perguntas da fase
        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) fase[i] = p1;
            else if (i % 3 == 1) fase[i] = p2;
            else fase[i] = p3;
        }

        return fase;
    }
}
