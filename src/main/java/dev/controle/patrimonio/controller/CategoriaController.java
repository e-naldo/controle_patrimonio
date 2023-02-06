package dev.controle.patrimonio.controller;

import dev.controle.patrimonio.dto.CategoriaAtualizacaoDto;
import dev.controle.patrimonio.dto.CategoriaCadastroDto;
import dev.controle.patrimonio.dto.CategoriaDetalhesDto;
import dev.controle.patrimonio.mapper.CategoriaMapper;
import dev.controle.patrimonio.model.Categoria;
import dev.controle.patrimonio.service.CategoriaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("api/v1/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService service;

    @Autowired
    private CategoriaMapper mapper;

    @PostMapping
    public ResponseEntity<CategoriaDetalhesDto> cadastrar(@RequestBody @Valid CategoriaCadastroDto dto){
        Categoria categoria = service.cadastrar(mapper.paraEntidade(dto));

        UriComponentsBuilder builder = UriComponentsBuilder.newInstance();
        URI uri = builder.path("api/vi/categorias").buildAndExpand(categoria.getId()).toUri();

        return ResponseEntity.created(uri).body(mapper.paraDto(categoria));
    }

    @PutMapping
    public ResponseEntity<CategoriaDetalhesDto> atualizar(@RequestBody @Valid CategoriaAtualizacaoDto dto){
        Categoria categoria1 = mapper.paraEntidade(dto);

        Categoria categoria = service.atualizar(categoria1);

        return ResponseEntity.ok(mapper.paraDto(categoria));
    }
}
