package dev.controle.patrimonio.service;

import dev.controle.patrimonio.model.Categoria;
import dev.controle.patrimonio.repository.CategoriaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService implements GenericService<Categoria>{

    @Autowired
    private CategoriaRepository repository;

    @Override
    public Categoria cadastrar(Categoria categoria) {
        return repository.save(categoria);
    }

    @Override
    public Categoria atualizar(Categoria categoria) {
        Categoria categoriaAtual = repository.findById(categoria.getId())
                .orElseThrow(EntityNotFoundException::new);

        categoriaAtual.setNome(categoria.getNome());
        repository.save(categoriaAtual);

        return categoriaAtual;
    }

    @Override
    public Categoria buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public List<Categoria> buscarTodos() {
        return repository.findAll();
    }

    @Override
    public void excluirPorId(Long id) {
            repository.deleteById(id);
    }
}
