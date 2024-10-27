public class Forca {
        // -> atributo de força para todos elementos <-//
        protected int forca;
        protected int vida;
        protected String genero;
        protected String nome;

        // -> construtor de atributos <- //
        public Forca(String nome, int forca, int vida ) {
            this.nome = nome;
            this.vida = vida;
            this.forca = forca;
        }

        public void atacar(Forca adversario) {
            System.out.println(this.nome + " atacou " + adversario.nome + " com força de " + this.forca);
            adversario.vida -= this.forca;
            System.out.println(adversario.nome + " agora tem " + adversario.vida + " de vida");
        }
        public void soco(Forca adversario) {
            int dano = this.forca + 30;
            adversario.vida -= dano;
            System.out.println(this.nome + " deu um soco em " + adversario.nome + " com força de " + dano);
            System.out.println(adversario.nome + " agora esta com " + adversario.vida + " de vida");
        }
    }
