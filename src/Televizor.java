public class Televizor {
    private  int jacinaTona;
    private boolean ukljucen;
    private String markaTV;
    private int duzinaEkrana;
    public Televizor() {
        this.jacinaTona = 0;
        this.ukljucen = false;
        this.markaTV = "Samsung";
        this.duzinaEkrana = 23;
    }


    public Televizor(int jacinaTona, boolean ukljucen) {
        if (jacinaTona >= 0 && jacinaTona <= 20) {
            this.jacinaTona = jacinaTona;
        } else {
            this.jacinaTona = 0;
        }
        this.ukljucen = ukljucen;
    }




    public void pojacajTon() {
        if (ukljucen && jacinaTona < 20) {
            jacinaTona++;
        }
    }

    public void smanjiTon() {
        if (ukljucen && jacinaTona > 0) {
            jacinaTona--;
        }
    }

    public void ukljuci() {
        ukljucen = true;
    }

    public void iskljuci() {
        ukljucen = false;
    }

    public boolean daLiJeUkljucen() {
        return ukljucen;
    }

    public int vratiJacinuTona() {
        return jacinaTona;
    }

    public void TvOpis() {
        System.out.println("Marka televizora: " + markaTV);
        System.out.println("Jačina tona: " + jacinaTona);
        System.out.println("Duzina ekrana: " + duzinaEkrana + " inch");
    }

}


