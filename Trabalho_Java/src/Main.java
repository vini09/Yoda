public class Main {
    public static void main(String[] args) {
        //Padawan
        Padawan pdw = new Padawan("Ahsoka Tano", 120);
        System.out.println(pdw.nome + " é um " + pdw.genero + " com força " + pdw.forca);

        //Cavaleiro Jedi
        Cavaleiro c1 = new Cavaleiro("Caleb Dume", 140);
        System.out.println(c1.nome + " é um " + c1.genero + " com força " + c1.forca);

        //Mestre Jedi
        MestreJedi mJ = new MestreJedi("Yoda", 150);
        System.out.println(mJ.nome + " é um " + mJ.genero + " com força " + mJ.forca);
        mJ.usarRaio();
        System.out.println(mJ.nome + " tem uma força extra de " + mJ.forcaExtra());

        // Lord Sith
        Lord lord = new Lord("Darth Nihilus", 160);
        System.out.println(lord.nome + " é um " + lord.genero + " com força " + lord.forca);

        // Mestre Sith
        MestreSith mS = new MestreSith("Darth Plagueis", 170);
        System.out.println(mS.nome + " é um " + mS.genero + " com força " + mS.forca);
        mS.usarRaio();
        System.out.println(mS.nome + " tem uma força extra de " + mS.forcaExtra());

        //Aprendiz
        Aprendiz aprendiz = new Aprendiz("Darth Malak", 40);
        System.out.println(aprendiz.nome + " é um " + aprendiz.genero + " com força " + aprendiz.forca);

        // Simulando um ataque
        mS.atacar(mJ);  // Mestre Sith ataca Jedi
        c1.atacar(mS); //Cavaleito ataca Sith
        pdw.atacar(mS);  //Cavaleiro ataca Mestre Sith
        mS.usarRaio(); //Mestre Jedi usa raios
        c1.atacar(aprendiz); //Cavaleito ataca aprendiz
        mJ.usarRaio(); //Mestre Sith usa raios
        pdw.atacar(lord); //Padawan ataca Lord
        mS.soco(pdw); //Mestre Jedi ataca Lord
        mJ.soco(lord); //Mestlre Jedi ataca aprendiz
    }
}