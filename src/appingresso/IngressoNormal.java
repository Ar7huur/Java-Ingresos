package appingresso;
//ARTHUR SILVA MARQUES SILVA FIGUEIRINHA RA:262012855
    //JOSÉ RENATO CUNHA ROYER RA:262012782

import java.time.LocalDate;

public class IngressoNormal extends Ingresso {

    public IngressoNormal(String show, LocalDate data, double valor) {
        super(show, data, valor);
    }

    @Override
    public double getValor() {
        double n_valor = super.getValor();
        if (getData().equals(getData().minusDays(5))) {
            n_valor += (super.getValor() * (10 / 100));
        }
        if (getData().equals(getData().minusDays(4))) {
            n_valor += (super.getValor() * (20 / 100));
        }
        if (getData().equals(getData().minusDays(3))) {
            n_valor += (super.getValor() * (30 / 100));
        }
        if (getData().equals(getData().minusDays(2))) {
            n_valor += (super.getValor() * (40 / 100));
        }
        if (getData().equals(LocalDate.now())) {
            n_valor += (super.getValor() * (50 / 100));
        }
        return n_valor;
    }

}
