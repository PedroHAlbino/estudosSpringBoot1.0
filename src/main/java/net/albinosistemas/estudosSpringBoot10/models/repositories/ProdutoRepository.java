package net.albinosistemas.estudosSpringBoot10.models.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import net.albinosistemas.estudosSpringBoot10.models.entities.Produto;

public interface ProdutoRepository  extends PagingAndSortingRepository<Produto, Integer>{

}
