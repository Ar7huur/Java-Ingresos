package appingresso;
//ARTHUR SILVA MARQUES SILVA FIGUEIRINHA RA:262012855
    //JOSÉ RENATO CUNHA ROYER RA:262012782

import java.time.LocalDate;

import java.util.Date;

abstract class Ingresso {

    private String show;
    private LocalDate data;
    private double valor;

    public Ingresso() {
        this.show = "";
        this.valor = 0;
        this.data = LocalDate.now();
    }

    public Ingresso(String show, LocalDate data, double valor) {
        setShow(show);
        setValor(valor);
        this.data = data;
    }

    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show;
    }

    public void setValor(double valor) {
        if (valor > 0) {
            this.valor = valor;
        }
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

}
