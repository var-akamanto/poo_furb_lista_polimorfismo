import models.Consultor;
import models.Funcionario;
import models.Gerente;
import models.Vendedor;

public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[3];

        funcionarios[0] = new Vendedor("Pedro", 1000,0.1,3000);
        funcionarios[1] = new Gerente("Fulano", 5000, true, 0.15);
        funcionarios[2] = new Consultor("Ciclano", 10000, 5, 60);

        for(Funcionario f : funcionarios){
            System.out.println(f.toString());
            System.out.println();
        }
    }
}
