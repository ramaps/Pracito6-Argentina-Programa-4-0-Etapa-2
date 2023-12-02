package org.example;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "Prestador")
public class Prestador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPrestador")
    private long idPrestador;

    @Column(name = "NombreCompleto")
    private String nombreCompleto;

    @Column(name = "DNI")
    private double dni;

    @OneToMany(mappedBy = "prestador", cascade = CascadeType.ALL)
    private List<Contrato> contratos = new ArrayList<>();

}
