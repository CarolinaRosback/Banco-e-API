package com.br.gerenciadordearmariosapi.repository;

import com.br.gerenciadordearmariosapi.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {
}
