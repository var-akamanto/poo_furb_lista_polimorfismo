import models.Caminhao;
import models.Consultor;
import models.Gerente;
import models.Moto;
import models.Vendedor;
import models.abstracts.Carro;
import models.abstracts.Funcionario;
import models.abstracts.Veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo[] veiculos = new Veiculo[3];
        veiculos[0] = new Carro();
        veiculos[1] = new Moto();
        veiculos[2] = new Caminhao();
        
        for(Veiculo v : veiculos){
            v.acelerar();
        }
        }
    }
