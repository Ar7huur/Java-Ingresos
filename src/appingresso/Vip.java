package appingresso;
//ARTHUR SILVA MARQUES SILVA FIGUEIRINHA RA:262012855
    //JOSÉ RENATO CUNHA ROYER RA:262012782
import java.time.LocalDate;

public class Vip extends Ingresso {

    private double adicional;

    public Vip(String show, LocalDate data, double valor, double adicional) {
        super(show, data, valor);
        setAdicional(adicional);
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        if (adicional > 0) {
            this.adicional = adicional;
        }
    }

    @Override
    public double getValor() {
        return super.getValor() * (1 + this.getAdicional() / 100);
    }

}
