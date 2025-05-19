package com.Apilojistsimplificado.API.Projeto.Lojistas.repositories;

import com.Apilojistsimplificado.API.Projeto.Lojistas.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {


}
