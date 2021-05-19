/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.Secretaria;
import java.util.Scanner;

/**
 *
 * @author romulo
 */
public class ControlAdministrador {
    public void cadastrarInforClinica(){ //UC019
        Scanner in = new Scanner(System.in);
        
        String nomeClinica;
        String cnpj;
        String endereco;
        String telefone;
        
        
        System.out.println("Cadastro de Informações da Clínica");
        
        System.out.println("Digite o nome da Clínica:");
        nomeClinica = in.nextLine();
        
        System.out.println("Digite o CNPJ:");
        cnpj = in.nextLine();
        
        System.out.println("Digite o Endereço:");
        endereco = in.nextLine();
        
        System.out.println("Digite o Telefone:");
        telefone = in.nextLine();
        
        //Salva no Banco de Dados
    }
    public void cadastrarSecretaria(){ //UC001
        Secretaria s = new Secretaria();
        
        Scanner in = new Scanner(System.in);
        
        boolean i = true;
        
        do{    
            System.out.println("Cadastro de Secretária");

            System.out.println("Digite o login: ");
            s.setLogin(in.nextLine());

            System.out.println("Digite a senha: ");
            s.setSenha(in.nextLine());

            System.out.println("Digite o nome: ");
            s.setNome(in.nextLine());

            System.out.println("Digite o telefone: ");
            s.setTelefone(in.nextLine());

            System.out.println("Digite o CPF: ");
            s.setCpf(in.nextInt());

            System.out.println("Digite o RG: ");
            s.setRG(in.nextInt());

            System.out.println("Digite o endereço:");
            s.setEndereco(in.nextLine());

            System.out.println("Digite o sexo:");
            s.setSexo(in.nextLine());

            System.out.println("Secretária Inserida:");
            System.out.println("Login: "+s.getLogin());
            System.out.println("Senha: "+s.getSenha());
            System.out.println("Nome: "+s.getNome());
            System.out.println("Telefone: "+s.getTelefone());
            System.out.println("CPF: "+s.getCpf());
            System.out.println("RG: "+s.getRG());
            System.out.println("Endereço: "+s.getEndereco());
            System.out.println("Sexo: "+s.getSexo());

            System.out.println("Inserir Secretária? (S/N)");
            if(in.nextLine().equals("S")){
                i = false;
            }else{
                i = true;
            }
        }while(i);
        //Salvar s no banco de dados
    }
}
