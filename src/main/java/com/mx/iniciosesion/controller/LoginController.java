package com.mx.iniciosesion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mx.iniciosesion.model.Login;
import com.mx.iniciosesion.sevice.LoginInterfaceService;

@RestController
public class LoginController {

    @Autowired
    LoginInterfaceService service;
    @PostMapping(value = "/guardarLogin")
    public Login guardarLogin(@RequestBody Login login) {
        Login crear = null;
        try {
            crear = service.crearLogin(login);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        return crear;
    }

    @GetMapping(value = "/buscarLogin")
    public Login buscarLogin(@RequestBody Login request) {
        Login buscar = null;
        try {
            buscar = service.buscarLogin(request);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return buscar;
    }

    @PutMapping(value = "actualizarLogin/{idLogin}")
    public Login actualizarLogin(@RequestBody Login login, @PathVariable int idLogin) {
        Login actualizar = null;
        try {
            actualizar = service.actualizarLogin(login, idLogin);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return actualizar;

    }

    @DeleteMapping(value = "/eliminarLogin/{idLogin}")
    public void eliminarLogin(@PathVariable int idLogin) {
        try {
            service.eliminarLogin(idLogin);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
