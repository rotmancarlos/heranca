class estagiario extends funcionario {
    private Professor professorVinculado;

    public estagiario(String nome, String cpf, int numeroRegistro, String orgaoLotacao) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, 0);
    }

    public Professor getProfessorVinculado() {
        return professorVinculado;
    }

    public void setProfessorVinculado(Professor professorVinculado) {

    }

    @Override
    public void reembolsoDespesas() {
        // Implemente o método de reembolso de despesas para estagiários com a lógica adequada
    }



}
