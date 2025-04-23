package org.example.models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document
public class Usuario {
    @Id
    private String Id;
    private String Nome;
    private String Telefone;

    public String getId() { return Id;}

    public void setId(String id) {Id = id;}

    public String getNome() { return Nome;}

    public void setNome(String nome) { Nome = nome;}

    public String getTelefone() {return Telefone;}

    public void setTelefone(String telefone) {Telefone = telefone;}
}
