package com.subh.movie.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.subh.movie.Entity.directorEntity;

@Repository
public interface DirectorRepository extends JpaRepository<directorEntity, Integer>{
}
