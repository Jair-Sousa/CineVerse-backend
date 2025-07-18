package com.cineverse.cineverse.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome do filme é obrigatório.")
    private String nome;

    @NotBlank(message = "O tipo de áudio é obrigatório.")
    private String tipoAudio;

    @NotNull(message = "O preço é obrigatório.")
    private Double preco;

    public String getNome(){
        return nome;
    }
    public String getTipoAudio(){
        return tipoAudio;
    }
    public Double getPreco(){
        return preco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTipoAudio(String tipoAudio){
        this.tipoAudio = tipoAudio;
    }

    public void setPreco(Double preco){
        this.preco = preco;
    }
}
