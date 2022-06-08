package primeiros_passos;

public class Tabela_boleana_da_verdade {
    public static void main(String[] args) {
        boolean q, p;
        System.out.println("\tP\tQ\tAND\tOR\tXOR\tNOT");
        q = true;
        p = true;
        if((q & p) == true | (q | p) == true | (p ^ q) == true | (!p) == true)
        System.out.print("\t1");
        else
        System.out.print("\t0");
        //System.out.println(p + "\t" + q + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p));
        (p&q); (p|q); (p^q); (!p);
        System.out.println("");
        p = true;
        q = false;
        //System.out.println(p + "\t" + q + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p));
        (p&q); (p|q); (p^q); (!p);
        System.out.println("");
        p = false;
        q = true;
        (p&q); (p|q); (p^q); (!p);
        System.out.println("");
        //System.out.println(p + "\t" + q + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p));
        (p&q); (p|q); (p^q); (!p);
        System.out.println("");
        p = false;
        q = false;
        (p&q); (p|q); (p^q); (!p);
        System.out.println("")
        //System.out.println(p + "\t" + q + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p));
    }
}
