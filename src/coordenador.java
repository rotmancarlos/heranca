import java.util.*;

class coordenador extends funcionario {
    private List<Professor> professoresSupervisionados;

    public coordenador(String nome, String cpf, int numeroRegistro, String orgaoLotacao, double salario) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
        this.professoresSupervisionados = new ArrayList<>();
    }

    public List<Professor> getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(List<Professor> professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }
    public void adicionaProfessor(Professor professor) {
        if (professoresSupervisionados.size() < 2) {
            professoresSupervisionados.add(professor);
        } else {
            System.out.println("O coordenador já supervisiona o número máximo de professores.");
        }
    }

    @Override
    public void aumentoSalario(Double salario) {

        salario = salario *1,05;
        System.out.println("R$ " + salario);
    }
}
