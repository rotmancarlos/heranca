class funcionariosadministrativo extends funcionario {
    private String funcaosdministrativa;
    private String senioridade;

    public funcionariosadministrativo(String nome, String cpf, Long numeroDeRegistro, String orgaoDeLotacao, Double salario) {

        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);

    }

    public funcionariosadministrativo(String nome, String cpf, Long numeroDeRegistro, String orgaoDeLotacao
            , Double salario, String funcaoAdministrativa, String senioridade) {

        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.funçãoAdministrativa = funcaoAdministrativa;
        this.senioridade = senioridade;
    }

}
