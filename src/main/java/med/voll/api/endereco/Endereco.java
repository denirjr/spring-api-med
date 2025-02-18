package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(DadosEndereco dado) {
        this.logradouro = dado.logradouro();
        this.bairro = dado.bairro();
        this.cep = dado.cep();
        this.numero = dado.numero();
        this.complemento = dado.complemento();
        this.cidade = dado.cidade();
        this.uf = dado.uf();
    }
}
