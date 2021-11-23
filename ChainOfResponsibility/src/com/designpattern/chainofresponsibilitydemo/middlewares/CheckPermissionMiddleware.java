package com.designpattern.chainofresponsibilitydemo.middlewares;

public class CheckPermissionMiddleware extends Middleware {
    @Override
    public boolean check(String email, String password) {
        if (email.equals("master@matheus.com.br")) {
            System.out.println("Bem vindo Administrador");
        }
        System.out.println("Bem vindo!");
        return checkNext(email, password);
    }
}
