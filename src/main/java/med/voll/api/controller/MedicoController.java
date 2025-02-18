package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.medico.DadosCadastroMedicoDTO;
import med.voll.api.medico.DadosListagemMedicoDTO;
import med.voll.api.medico.Medico;
import med.voll.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping()
    @Transactional
    public void cadastrarMedico(@RequestBody @Valid DadosCadastroMedicoDTO dados) {
        repository.save(new Medico(dados));
    }

    @GetMapping()
    public Page<DadosListagemMedicoDTO> listarMedicos(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosListagemMedicoDTO::new);
    }
}
