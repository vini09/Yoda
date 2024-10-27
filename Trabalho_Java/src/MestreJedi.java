public class MestreJedi extends Jedi implements Raios {
    public MestreJedi(String nome, int vida) {
        super(nome, vida);
        this.forca = 100;
    }

    public void usarRaio() {
        System.out.println(this.nome + " usou raios!");
    }

    public int forcaExtra() {
        return 20;
    }
}
