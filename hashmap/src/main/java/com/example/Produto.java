package hashmap.src.main.java.com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Produto {
    //atributos
    private String nome;
    private double preco;

    //toString
    @Override
    public String toString(){
        return "Nome: "+nome+" Preço: "+preco;
    }

}
