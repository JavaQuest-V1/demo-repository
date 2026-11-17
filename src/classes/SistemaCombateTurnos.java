package classes;

public class SistemaCombateTurnos {
    private PersonagemHeroi heroi;
    private InimigoMonstro inimigo;
    private int errosNaFase;

    public SistemaCombateTurnos(PersonagemHeroi heroi, InimigoMonstro inimigo) {
        this.heroi = heroi;
        this.inimigo = inimigo;
        this.errosNaFase = 0;
    }

    public void executarTurnoInimigo() {

        inimigo.conjurarMagiaInimiga();
    }

    public boolean processarTurnoHeroi(boolean acertouDesafio) {

        if (acertouDesafio) {
            System.out.println("Contra-ataque bem-sucedido! O monstro sofreu dano.");
            return true;
        } else {
            errosNaFase++;
            heroi.perderVida();

            if (heroi.estaDerrotado() || errosNaFase >= 3) {
                System.out.println("GAME OVER! Você atingiu o limite de 3 erros nesta fase.");
                return false;
            } else {
                System.out.println("Cuidado! Erros restantes antes da derrota: " + (3 - errosNaFase));
                return true;
            }
        }
    }
}
