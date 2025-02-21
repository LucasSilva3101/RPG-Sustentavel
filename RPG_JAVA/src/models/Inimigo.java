package models;

public class Inimigo extends Personagem {
    public Inimigo(String nome, int vida) {
        super(nome, vida);
    }

    public void atacar(Heroi heroi) {
        System.out.println(nome + " Joga uma bola preta de fumaça em " + heroi.getNome() + ", você se sente sufocado.");
        heroi.dano(10);
        System.out.println("Você tem " + heroi.getVida() + " pontos de vida.\n\n");
    }

    @Override
    public void dialogarV() {
        System.out.println("Aaarrgghh! não é possível.... ");
    }

    @Override
    public void dialogarD() {
        System.out.println("Muahahaha, ser humano patético.");
    }
}
