package com.mx.iniciosesion.sevice;

import java.util.List;

import com.mx.iniciosesion.model.Login;

public interface LoginInterfaceService {
Login crearLogin(Login login);

    Login buscarLogin(Login login);

    Login actualizarLogin(Login login, int idLogin);

    void eliminarLogin(int idLogin);
}
