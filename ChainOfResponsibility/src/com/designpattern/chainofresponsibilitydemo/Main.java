package com.designpattern.chainofresponsibilitydemo;

import com.designpattern.chainofresponsibilitydemo.middlewares.CheckPermissionMiddleware;
import com.designpattern.chainofresponsibilitydemo.middlewares.CheckUserMiddleware;
import com.designpattern.chainofresponsibilitydemo.middlewares.Middleware;
import com.designpattern.chainofresponsibilitydemo.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    public static void init() {
        server = new Server();
        server.registerUser("master@matheus.com.br", "adminmatheusadmin");
        server.registerUser("user@user.com.br", "123456");

        Middleware middleware = new CheckUserMiddleware(server);
        middleware.linkWith(new CheckPermissionMiddleware());

        server.setMiddleware(middleware);
    }
    public static void main(String[] args) throws IOException {

        init();

        boolean done;

        do {
            System.out.println("Digite o e-mail: ");
            String email = reader.readLine();
            System.out.println("Digite sua senha: ");
            String password = reader.readLine();
            done = server.login(email, password);
        }while (!done);
    }
}
