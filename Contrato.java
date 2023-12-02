package org.example;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "Contrato")
public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idContrato")
    private long idContrato;

    @Column(name = "Lugar")
    private String lugar;

    @Column(name = "Estado")
    private String estado;

    @Column(name = "Valor")
    private int valor;

    @ManyToOne
    @JoinColumn(name = "Prestador_idPrestador")
    private Prestador prestador;

    @ManyToOne
    @JoinColumn(name = "Consumidor_idConsumidor")
    private Consumidor consumidor;

}

