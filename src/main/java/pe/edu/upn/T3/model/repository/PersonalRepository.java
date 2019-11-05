package pe.edu.upn.T3.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upn.T3.model.entity.Personal;

@Repository
public interface PersonalRepository extends JpaRepository<Personal, Integer>{

}
