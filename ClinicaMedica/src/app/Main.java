/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import controller.ControlAdministrador;
/**
 *
 * @author romulo
 */
public class Main {
    public static void main(String args[]){
        ControlAdministrador c = new ControlAdministrador();
        
        c.cadastrarInforClinica();
    }
    
}
