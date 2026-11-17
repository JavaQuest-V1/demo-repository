package classes;

public class InimigoMonstro {
    private String nomeMonstro;
    private String codigoMagiaInimiga;
    private int vidaInimigo;

    public InimigoMonstro(String nomeMonstro, String codigoMagiaInimiga) {
        this.nomeMonstro = nomeMonstro;
        this.codigoMagiaInimiga = codigoMagiaInimiga;
        this.vidaInimigo = 100;
    }

    public void conjurarMagiaInimiga() {
        System.out.println("\n[TURNO DO INIMIGO] O monstro " + this.nomeMonstro + " se prepara para atacar!");
        System.out.println("O monstro conjura a magia e exibe o código na tela:");
        System.out.println("--------------------------------------------------");
        System.out.println(this.codigoMagiaInimiga);
        System.out.println("--------------------------------------------------");
        System.out.println("Memorize o código! O turno de contra-ataque do Herói vai começar...");
    }

    public String getNomeMonstro() {
        return nomeMonstro;
    }
}
