package entities;

public class Desenvolvedor extends Funcionario {
    private int horaExtra;
    private double valorHora;

    public Desenvolvedor() {
        super();
    }

    public Desenvolvedor(String nome, double salarioBase, int horaExtra, double valorHora) {
        super(nome, salarioBase);
        this.horaExtra = horaExtra;
        this.valorHora = valorHora;
    }

    public int getHoraExtra() {
        return horaExtra;
    }

    public double getValorHora() {
        return valorHora;
    }

    @Override
    public double vencimento() {
        return super.vencimento() + (horaExtra * valorHora);
    }
}
