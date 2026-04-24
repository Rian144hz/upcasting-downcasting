package entities;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente() {
        super();
    }

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double vencimento() {
        return super.vencimento() + bonus;
    }
}
