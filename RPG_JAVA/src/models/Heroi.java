package models;

public class Heroi extends Personagem {
    private int pontuacao;
    private int atqsFeitos;

    public Heroi(String nome, int vida, int pontuacao) {
        super(nome, vida);
        this.pontuacao = 100;
        this.atqsFeitos = 0;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    private void calcularPontuacao() {
        pontuacao = 100 - (atqsFeitos * 2);
    }

    public void ataqueBasico(Inimigo inimigo) {
        System.out.println("\n" + nome + " Atira com seu estilingue no " + inimigo.getNome() + ".");
        inimigo.dano(10);
        System.out.println("O ataque não pareceu ser muito efetivo.");
        atqsFeitos++;
        System.out.println("Poluidor tem " + inimigo.getVida() + " pontos de vida.\n");
        calcularPontuacao();
    }

    public void ataqueGrito(Inimigo inimigo) {
        System.out.println("\n" + nome + " Grita por socorro.");
        inimigo.dano(0);
        System.out.println(inimigo.getNome() + " Ri da sua cara.");
        atqsFeitos++;
        System.out.println("Poluidor tem " + inimigo.getVida() + " pontos de vida.\n");
        calcularPontuacao();
    }

    public void ataqueEfetivo(Inimigo inimigo) {
        System.out.println("\n" + nome + " Começa a tentar convencer " + inimigo.getNome() + " sobre a sustentabilidade.");
        inimigo.dano(50);
        System.out.println("Você parece estar convencendo ele.");
        atqsFeitos++;
        System.out.println("Poluidor tem " + inimigo.getVida() + " pontos de vida.\n");
        calcularPontuacao();
    }

    public void curar() {
        System.out.println("\n" + nome + " Faz um post sobre a importância das árvores no mundo.");
        vida += 5;
        System.out.println("Não surte efeito no Poluidor, mas você se sente melhor.\n");
    }

    @Override
    public void dialogarV() {
        System.out.println("Ahá, você achou que só porque era a poluição encarnada iria me derrotar?");
    }

    @Override
    public void dialogarD() {
        System.out.println("O que? não é possível que eu deixei a poluição ganhar.");
    }
}
