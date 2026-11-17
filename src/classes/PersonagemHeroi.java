package classes;

public class PersonagemHeroi {
    private String nomeHeroi;
    private String genero;
    private String classeHeroi;
    private int vidas;
    private int nivelAtual;
    private int blocoAtual;

    public PersonagemHeroi(String nomeHeroi, String genero, String classeHeroi) {
        this.nomeHeroi = nomeHeroi;
        this.genero = genero;
        this.classeHeroi = classeHeroi;
        this.vidas = 3;
        this.nivelAtual = 1;
        this.blocoAtual = 1;
    }

    public void perderVida() {
        if (this.vidas > 0) {
            this.vidas--;
            System.out.println("Você errou! Perdeu 1 coração. Vidas restantes: " + this.vidas + "/3");
        }
    }

    public void restaurarVidas() {
        this.vidas = 3;
        System.out.println("Vidas totalmente restauradas para 3/3!");
    }

    public boolean estaDerrotado() {
        return this.vidas <= 0;
    }

    public String getNomeHeroi() { return nomeHeroi; }
    public String getGenero() { return genero; }
    public String getClasseHeroi() { return classeHeroi; }
    public int getVidas() { return vidas; }
    public int getNivelAtual() { return nivelAtual; }
    public int getBlocoAtual() { return blocoAtual; }
}
