import java.util.ArrayList;
import java.util.List;

public class BancoController {
    private DataManager dataManager = new DataManager();
    private List<Conta> contas;
    private List<Funcionario> funcionarios;

    public BancoController() {
        carregarDados();  // Carrega os dados ao iniciar
    }

    public void abrirConta(Conta conta) {
        contas.add(conta);
        salvarDados();  // Salva os dados após abrir a conta
    }

    public void encerrarConta(int numeroConta) {
        Conta conta = consultarConta(numeroConta);
        if (conta != null) {
            contas.remove(conta);
            salvarDados();  // Salva os dados após encerrar a conta
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public Conta consultarConta(int numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numeroConta) {
                return conta;
            }
        }
        return null;  // Retorna null se a conta não for encontrada
    }

    public void salvarDados() {
        dataManager.salvarContas(contas, "contas.dat");
        dataManager.salvarFuncionarios(funcionarios, "funcionarios.dat");
    }

    public void carregarDados() {
        contas = dataManager.carregarContas("contas.dat");
        funcionarios = dataManager.carregarFuncionarios("funcionarios.dat");
        if (contas == null) {
            contas = new ArrayList<>();
        }
        if (funcionarios == null) {
            funcionarios = new ArrayList<>();
        }
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
