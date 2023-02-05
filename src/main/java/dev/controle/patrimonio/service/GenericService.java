package dev.controle.patrimonio.service;

import dev.controle.patrimonio.model.EntidadeBase;

import java.util.List;

public interface GenericService<T extends EntidadeBase> {
    T cadastrar(T t);

    T atualizar(T t);

    T buscarPorId(Long id);

    List<T> buscarTodos();

    void excluirPorId(Long id);
}