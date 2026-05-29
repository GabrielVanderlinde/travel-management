package com.senai.travel_management.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class ViajemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "destino")
    private String destino;

    @Column(name = "dataPartida")
    private Date dataPartida;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StatusViajem status;

    @ManyToOne
    @JoinColumn(name = "viajante_id")
    private ViajanteEntity viajante;
}
