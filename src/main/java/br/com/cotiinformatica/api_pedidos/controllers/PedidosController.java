package br.com.cotiinformatica.api_pedidos.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/pedidos")
public class PedidosController {

    @PostMapping("criar")
    public ResponseEntity<?> criar() {
        return ResponseEntity.ok().build();
    }

    @PutMapping("alterar/{id}")
    public ResponseEntity<?> criar(@PathVariable Integer id) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("excluir/{id}")
    public ResponseEntity<?> excluir(@PathVariable Integer id) {
        return ResponseEntity.ok().build();
    }

    @GetMapping("listar")
    public ResponseEntity<?> listar() {
        return ResponseEntity.ok().build();
    }

    @GetMapping("obter/{id}")
    public ResponseEntity<?> obter(@PathVariable Integer id) {
        return ResponseEntity.ok().build();
    }
}
