
package Model;

import java.util.Date;



/**
 *
 * @weldon carlos
 */

 
public class Cliente extends Pessoa {
    
    //Atributos
    protected String endereco;
    protected String cep;
    
    
    
    //Construtores
    public Cliente(String endereco, String cep, int id, String nome, char sexo, String dataNascimento, String telefone, String email, String rg) {
        super(id, nome, sexo, dataNascimento, telefone, email, rg);
        this.endereco = endereco;
        this.cep = cep;
    }

    

 
    
    
    //Getters and Setters
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

  
    
    
    
}
