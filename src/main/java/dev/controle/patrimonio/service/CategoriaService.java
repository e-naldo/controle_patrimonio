package dev.controle.patrimonio.service;

import dev.controle.patrimonio.model.Categoria;
import dev.controle.patrimonio.repository.CategoriaRepository;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService implements GenericService<Categoria>{

    @Autowired
    private CategoriaRepository repository;

    @Override
    public Categoria cadastrar(Categoria categoria) {
        if(verificarSeExite(categoria)){
            throw  new EntityExistsException("Já existe uma categoria cadastrada com o nome "
            + categoria.getNome());
        }
        return repository.save(categoria);
    }

    @Override
    public Categoria atualizar(Categoria categoria) {
        Categoria categoriaAtual = repository.findById(categoria.getId())
                .orElseThrow(EntityNotFoundException::new);

        if(verificarSeExite(categoria)){
            throw  new EntityExistsException("Já existe uma categoria cadastrada com o nome "
                    + categoria.getNome());
        }

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

    public boolean verificarSeExite(Categoria categoria){
        Optional<Categoria> categoriaEcontrada = repository.findByNome(categoria.getNome());

        return categoriaEcontrada.isPresent() &&
                !categoriaEcontrada.get().getId().equals(categoria.getId());
    }
}
