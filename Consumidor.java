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
@Table(name = "Consumidor")
public class Consumidor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idConsumidor")
    private long idConsumidor;

    @Column(name = "NombreCompleto")
    private String nombreCompleto;

    @Column(name = "DNI")
    private double dni;

    @OneToMany(mappedBy = "consumidor", cascade = CascadeType.ALL)
    private List<Contrato> contratos = new ArrayList<>();


}

