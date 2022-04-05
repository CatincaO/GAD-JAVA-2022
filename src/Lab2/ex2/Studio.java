package Lab2.ex2;

public class Studio {
    private String nume;
    private Film[] filme;
    public  int number = 0;
    public String authorName;

    public String getNume() {
        return nume;
    }

    public Film[] getFilme() {
        return filme;
    }

    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
        number = filme.length;


    }
     public String takeActorName( Actor a) {
        return a.getNume();
     }

    public int checkActorName(String expectedName , Actor actor ) {
        if (expectedName == actor.getNume()) {
            return 1;
        }
        return 0;

    }

}
