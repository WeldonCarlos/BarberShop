/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Login;

/**
 *
 * @author Ninguem
 */
public class LoginController {

    private final Login view;

    public LoginController(Login view) {
        this.view = view;
    }

   
    
    
    //Método
    
    public void fizTarefa(){
        System.out.println("Busquei algo no banco de dados");
        
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
}
