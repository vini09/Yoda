public class MestreSith extends Sith implements Raios {
    public MestreSith(String nome, int vida) {
        super(nome, vida);
        this.forca = 120;
    }

    public void usarRaio() {
        System.out.println(this.nome + " usou raios!");
    }


    public int forcaExtra() {
        return 30;
    }
}
