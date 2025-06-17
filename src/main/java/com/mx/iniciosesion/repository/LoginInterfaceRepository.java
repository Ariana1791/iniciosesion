package com.mx.iniciosesion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.iniciosesion.model.Login;



public interface LoginInterfaceRepository extends JpaRepository<Login, Integer> {

    Login findByUsuario(String usuario);
}
