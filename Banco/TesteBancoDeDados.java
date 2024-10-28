/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Banco;

/**
 *
 * @author alenis
 */
public class TesteBancoDeDados {

    public static void main(String[] args) {
        // Tenta executar uma consulta sem estar conectado
        BancoDeDados.executarConsulta("SELECT * FROM clientes");

        // Conecta ao banco de dados
        BancoDeDados.conectar();

        // Executa uma consulta
        BancoDeDados.executarConsulta("SELECT * FROM clientes");

        // Executa outra consulta
        BancoDeDados.executarConsulta("INSERT INTO clientes (nome, idade) VALUES ('João', 30)");

        // Desconecta do banco de dados
        BancoDeDados.desconectar();

        // Tenta desconectar novamente
        BancoDeDados.desconectar();
    }
}

