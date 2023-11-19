
package Model;

import java.util.Date;

/**
 *
 * @weldon carlos
 */
public class Usuario extends Pessoa{
    
    //Atributos
    protected String senha;
    protected String nivelAcesso;
   
 
    
    //Construtores 

    public Usuario(String senha, String nivelAcesso, int id, String nome, char sexo, String dataNascimento, String telefone, String email, String rg) {
        super(id, nome, sexo, dataNascimento, telefone, email, rg);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    //Getters and Setters
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

  

   
   
    
    
}
