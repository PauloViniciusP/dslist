package com.devnexz.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devnexz.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
