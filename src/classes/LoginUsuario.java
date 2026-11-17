package classes;

public class LoginUsuario {
    private String idUsuario;
    private String email;
    private String senha;
    private boolean autenticado;
    private int tentativasFalhas;
    private boolean contaBloqueada;

    public LoginUsuario(String idUsuario, String email, String senha) {
        this.idUsuario = idUsuario;
        this.email = email;
        this.senha = senha;
        this.autenticado = false;
        this.tentativasFalhas = 0;
        this.contaBloqueada = false;
    }

    public boolean fazerLogin(String emailDigitado, String senhaDigitada) {
        if (contaBloqueada) {
            System.out.println("Acesso negado: Sua conta está bloqueada por excesso de tentativas.");
            return false;
        }

        if (this.email.equals(emailDigitado) && this.senha.equals(senhaDigitada)) {
            this.autenticado = true;
            this.tentativasFalhas = 0;
            System.out.println("Login realizado com sucesso!");
            return true;
        } else {
            registrarTentativaFalha();
            return false;
        }
    }

    public void fazerLogout() {
        if (this.autenticado) {
            this.autenticado = false;
            System.out.println("Logout realizado com sucesso. Sessão encerrada.");
        } else {
            System.out.println("O usuário já está deslogado.");
        }
    }

    public boolean alterarSenha(String senhaAtual, String novaSenha) {
        if (this.senha.equals(senhaAtual)) {
            this.senha = novaSenha;
            System.out.println("Senha alterada com sucesso!");
            return true;
        } else {
            System.out.println("Falha ao alterar senha: A senha atual está incorreta.");
            return false;
        }
    }

    private void registrarTentativaFalha() {
        this.tentativasFalhas++;
        System.out.println("Credenciais incorretas. Tentativa " + tentativasFalhas + " de 3.");

        if (this.tentativasFalhas >= 3) {
            this.contaBloqueada = true;
            System.out.println("Conta bloqueada por segurança após 3 tentativas falhas.");
        }
    }

    public String getIdUsuario() { return idUsuario; }
    public String getEmail() { return email; }
    public boolean isAutenticado() { return autenticado; }
    public boolean isContaBloqueada() { return contaBloqueada; }
}
