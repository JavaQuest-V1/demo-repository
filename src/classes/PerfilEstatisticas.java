package classes;

public class PerfilEstatisticas {
    private String apelidoHeroi;
    private int blocoMaximoAlcancado;
    private int streakDiasConsecutivos;
    private int totalDesafiosResolvidos;

    public PerfilEstatisticas(String apelidoHeroi) {
        this.apelidoHeroi = apelidoHeroi;
        this.blocoMaximoAlcancado = 1;
        this.streakDiasConsecutivos = 1;
        this.totalDesafiosResolvidos = 0;
    }

    public void registrarBlocoConquistado(int bloco) {
        if (bloco > this.blocoMaximoAlcancado) {
            this.blocoMaximoAlcancado = bloco;
            System.out.println("Novo recorde! Bloco " + bloco + " desbloqueado permanentemente.");
        }
    }

    public void incrementarDesafioResolvido() {
        this.totalDesafiosResolvidos++;
    }

    public void exibirPerfil() {
        System.out.println("\n====================================");
        System.out.println("PERFIL DO JOGADOR: " + this.apelidoHeroi);
        System.out.println("Streak Diário: " + this.streakDiasConsecutivos + " dia(s) seguido(s)");
        System.out.println("Bloco Máximo Alcançado: Bloco " + this.blocoMaximoAlcancado);
        System.out.println("Total de Desafios Resolvidos: " + this.totalDesafiosResolvidos);
        System.out.println("====================================");
    }
}
