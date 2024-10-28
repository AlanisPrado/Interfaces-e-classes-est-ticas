/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author alenis
 */
public class BancoDeDados {

    private static boolean conectado = false;

    public static void conectar() {
        if (!conectado) {
            conectado = true;
            System.out.println("Conectado ao banco de dados.");
        } else {
            System.out.println("Já está conectado ao banco de dados.");
        }
    }

    public static void desconectar() {
        if (conectado) {
            conectado = false;
            System.out.println("Desconectado do banco de dados.");
        } else {
            System.out.println("Não está conectado ao banco de dados.");
        }
    }

    public static void executarConsulta(String consulta) {
        if (conectado) {
            System.out.println("Executando consulta: " + consulta);
            // Simula um retorno da consulta
            System.out.println("Consulta executada com sucesso.");
        } else {
            System.out.println("Erro: Não conectado ao banco de dados. Conecte-se primeiro para executar consultas.");
        }
    }
}

