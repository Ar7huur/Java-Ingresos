package appingresso;
//ARTHUR SILVA MARQUES SILVA FIGUEIRINHA RA:262012855
    //JOSÉ RENATO CUNHA ROYER RA:262012782

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bilheteria {

    private int total, n, v;
    private double valor_n;
    private double valor_vip;
    private LocalDate data;
    private List<Ingresso> Ingresso = new ArrayList();

    public Bilheteria(double valor_n, double valor_vip, LocalDate data) {
        this.valor_n = valor_n;
        this.valor_vip = valor_vip;
        this.data = data;
        n = (int) (this.total * 0.80);
        v = (int) (this.total - n);
        this.total = total;
    }

    public void vender(char tipo) {
        int i = 0;
        int j = 0;
        if (Character.toUpperCase(tipo) == 'N') {
            while (j != 1 && i < Ingresso.size()) {
                if (Ingresso.get(i) instanceof IngressoNormal) {
                    Ingresso.get(i);
                    Ingresso.remove(i);
                    j = 1;
                }
            }
        } else {
            if (Character.toUpperCase(tipo) == 'V') {
                while (j != 1 && i < Ingresso.size()) {
                    if (Ingresso.get(i) instanceof Vip) {
                        Ingresso.get(i);
                        Ingresso.remove(i);
                        j = 1;
                    }
                }
            }
        }
    }

    public double calcularValorTotal() {
        double TotalCalc = 0;

        for (int i = 0; i < Ingresso.size(); i++) {
            if (Ingresso.get(i) instanceof IngressoNormal) {
                IngressoNormal C = (IngressoNormal) Ingresso.get(i);
                TotalCalc = TotalCalc + C.getValor();
            } else {
                Vip C = (Vip) Ingresso.get(i);
                TotalCalc = TotalCalc + C.getValor();
            }
        }
        return TotalCalc;
    }
}
