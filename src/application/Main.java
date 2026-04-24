package application;

import entities.Desenvolvedor;
import entities.Funcionario;
import entities.Gerente;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Gerente("Matheus", 5000, 500));
        funcionarios.add(new Desenvolvedor("Rian", 7000, 900, 45));
        for (Funcionario f : funcionarios) {
            System.out.println(f);
            if (f instanceof Gerente) {
                Gerente g = (Gerente) f;
                System.out.println("Bonûs Gerente: " + g.getBonus());
            }
        }
    }
}
