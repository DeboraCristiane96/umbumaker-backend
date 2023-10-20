package br.edu.ifpb.umbumaker.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifpb.umbumaker.model.ContaAcesso;

@Repository
public interface ContaAcessoRepository extends JpaRepository<ContaAcesso, Long> {

}