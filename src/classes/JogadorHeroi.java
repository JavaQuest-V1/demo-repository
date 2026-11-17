package classes;

public class JogadorHeroi {
    private LoginUsuario conta;
    private int vidas;

    public JogadorHeroi(LoginUsuario conta) {
        this.conta = conta;
        this.vidas = 3; // O herói já começa com 3 vidas de brinde
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

    public int getVidas() {
        return vidas;
    }
}
