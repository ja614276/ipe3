package CIP;

public class coche {
    private int numeroPuerta;

    public coche(int numeroPuerta) {
        this.numeroPuerta = numeroPuerta;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }

    public void  incrementar(){
        this.numeroPuerta++;
    }

    public static void main(String[] args) {
        coche miCoche=new coche(1);
        miCoche.incrementar();
        System.out.println("Mi coche tiene "+miCoche.getNumeroPuerta()+" puertas.");
    }

}
