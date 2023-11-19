
package Model;

/**
 *
 * @weldon Carlos
 */

public class Servico {
    
    //Atributos
    private int id;
    private String descricao;
    private float valor;
    
    
    
    //Contrutores
    public Servico(int id, String descricao, float valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }
    
    
    
    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
    
}
