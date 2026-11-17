package classes;

public class DesafioProgramacao {
    private String nomeInimigo;
    private String codigoCorreto; // O código que o jogador precisa memorizar
    private String[] blocos; // Os pedaços do código embaralhados
    private String sequenciaCorreta; // A resposta esperada, ex: "213"

    public DesafioProgramacao(String nomeInimigo, String codigoCorreto, String[] blocos, String sequenciaCorreta) {
        this.nomeInimigo = nomeInimigo;
        this.codigoCorreto = codigoCorreto;
        this.blocos = blocos;
        this.sequenciaCorreta = sequenciaCorreta;
    }

    public void exibirAtaqueInimigo() {
        System.out.println("\n==================================================");
        System.out.println(" O " + this.nomeInimigo + " conjura uma magia!");
        System.out.println("MEMORIZE O CÓDIGO ABAIXO PARA SE DEFENDER:");
        System.out.println("--------------------------------------------------");
        System.out.println(this.codigoCorreto);
        System.out.println("--------------------------------------------------");
    }

    public void exibirDesafioBlocos() {
        System.out.println("\n️ SEU TURNO! Monte o código na ordem correta:");
        for (int i = 0; i < blocos.length; i++) {
            System.out.println("[" + (i + 1) + "] " + blocos[i]);
        }
        System.out.print("Digite a sequência dos blocos (ex: 132) ou 6 para Sair: ");
    }

    public boolean tentarResolver(String escolhaJogador) {
        // Compara a String digitada (ex: "213") com a resposta correta
        if (escolhaJogador.trim().equals(this.sequenciaCorreta)) {
            System.out.println(" CONTRA-ATAQUE PERFEITO! Você destruiu a magia do bug.");
            return true;
        } else {
            System.out.println(" ERRO DE SINTAXE! A sequência estava incorreta.");
            return false;
        }
    }
}
