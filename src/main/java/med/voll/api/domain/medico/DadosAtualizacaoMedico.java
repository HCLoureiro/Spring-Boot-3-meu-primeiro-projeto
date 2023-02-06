package med.voll.api.domain.medico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.endereco.DadosEndereco;
import med.voll.api.domain.endereco.Endereco;

public record DadosAtualizacaoMedico(

        @NotNull
        long id,

        String nome,

        String telefone,

        DadosEndereco endereco) {
}
