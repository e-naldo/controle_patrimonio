package dev.controle.patrimonio.mapper;

import dev.controle.patrimonio.dto.CategoriaAlteracaoDto;
import dev.controle.patrimonio.dto.CategoriaCadastroDto;
import dev.controle.patrimonio.dto.CategoriaDetalhesDto;
import dev.controle.patrimonio.model.Categoria;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CategoriaMapper {

    public Categoria paraEmtidade(CategoriaCadastroDto dto){
        return new Categoria(dto.nome());
    }

    public Categoria paraEntidade(CategoriaAlteracaoDto dto){
        return new Categoria(dto.id(), dto.nome());
    }

    public CategoriaDetalhesDto paraDto(Categoria categoria){
        return new CategoriaDetalhesDto(categoria.getId(), categoria.getNome());
    }

    public List<CategoriaDetalhesDto> toListDto(List<Categoria> categorias){
        return categorias.stream().map(this::paraDto).collect(Collectors.toList());
    }
}
