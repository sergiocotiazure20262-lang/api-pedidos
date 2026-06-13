package br.com.cotiinformatica.api_pedidos.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;

@RestController
@RequestMapping("api/v1/health")
public class HealthCheckController {

    private final DataSource dataSource;

    public HealthCheckController(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @GetMapping("/db")
    public ResponseEntity<String> checkDatabaseConnection() {
        try (Connection connection = dataSource.getConnection()) {
            if (connection.isValid(2)) {
                return ResponseEntity.ok("Conexão com o banco OK");
            }

            return ResponseEntity
                    .status(500)
                    .body("Conexão com o banco inválida");

        } catch (Exception e) {
            return ResponseEntity
                    .status(500)
                    .body("Erro ao conectar no banco: " + e.getMessage());
        }
    }
}
