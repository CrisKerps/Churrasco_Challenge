package com.example.churrasco.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.churrasco.Models.Usuario;

@Repository
public interface userRepository extends JpaRepository<Usuario, Long> {

    public Optional<Usuario> findById(Long id);
    
  
}