package classes;

public class ExperienciaUsuario {
    private LoginUsuario usuario;
    private NivelConhecimento nivelAtual;
    private boolean jaEstudouProgramacao;

    public ExperienciaUsuario(LoginUsuario usuario) {
        this.usuario = usuario;
        this.jaEstudouProgramacao = false;
    }

    public void definirPerfilExperiencia(boolean jaEstudou, NivelConhecimento nivel) {
        this.jaEstudouProgramacao = jaEstudou;

        if (jaEstudou) {
            this.nivelAtual = nivel;
            System.out.println("Perfil atualizado: O usuário já estudou programação. Nível: " + nivel);
        } else {
            this.nivelAtual = NivelConhecimento.INICIANTE;
            System.out.println("Perfil atualizado: O usuário nunca estudou programação. Nível travado em: INICIANTE");
        }
    }

    public NivelConhecimento buscarExperiencia() {
        if (this.nivelAtual == null) {
            System.out.println("Experiência ainda não definida para este usuário.");
            return null;
        }
        return this.nivelAtual;
    }

    public boolean verificarSeJaEstudou() {
        return this.jaEstudouProgramacao;
    }

    // Getter necessário para acessar os dados do usuário na classe Main
    public LoginUsuario getUsuario() {
        return this.usuario;
    }
}
