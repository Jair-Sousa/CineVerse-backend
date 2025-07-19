package com.cineverse.cineverse.controller;

import com.cineverse.cineverse.model.Filme;
import com.cineverse.cineverse.repository.FilmeRepository;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/filmes")
public class FilmeController {

    private final FilmeRepository filmeRepository;

    public FilmeController(FilmeRepository filmeRepository) {
        this.filmeRepository = filmeRepository;
    }

    // GET - Listar todos os filmes
    @GetMapping
    public List<Filme> listarFilmes() {
        return filmeRepository.findAll();
    }

    // POST - Adicionar novo filme
    @PostMapping
    public Filme adicionarFilme(@Valid @RequestBody Filme filme) {
        return filmeRepository.save(filme);
    }

    // PUT - Atualizar um filme
    @PutMapping("/{id}")
    public ResponseEntity<Filme> atualizarFilme(@PathVariable Long id, @Valid @RequestBody Filme filmeAtualizado) {
        System.out.println("Teste nome:" + filmeAtualizado.getNome());
        return filmeRepository.findById(id)
                .map(filme -> {
                    filme.setNome(filmeAtualizado.getNome());
                    filme.setTipoAudio(filmeAtualizado.getTipoAudio());
                    filme.setPreco(filmeAtualizado.getPreco());
                    Filme atualizado = filmeRepository.save(filme);
                    return ResponseEntity.ok(atualizado);
                }).orElse(ResponseEntity.notFound().build());
    }

    // DELETE - Remover um filme
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarFilme(@PathVariable Long id) {
        return filmeRepository.findById(id)
                .map(filme -> {
                    filmeRepository.deleteById(id);
                    return ResponseEntity.noContent().<Void>build();
                })
                .orElse(ResponseEntity.notFound().<Void>build());
    }

}
