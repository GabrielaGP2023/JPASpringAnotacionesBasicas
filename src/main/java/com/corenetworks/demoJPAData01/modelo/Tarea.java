package com.corenetworks.demoJPAData01.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="tareas")
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTarea;
    @Column(length = 30, nullable = false)
    private String descripcionTarea;
    @Column(nullable = false)
    private int prioridad;
}
