package med.voll.api.medico;

import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedicoDTO(
        String nome,
        String crm,
        String email,
        Especialidade especialidade,
        DadosEndereco endereco) {
}
