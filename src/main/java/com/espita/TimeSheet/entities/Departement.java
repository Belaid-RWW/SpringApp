package com.espita.TimeSheet.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Departement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @ManyToMany(mappedBy = "departements")
    private List<Employe> employes;

    @ManyToOne
    private Entreprise entreprise;

    @OneToMany(mappedBy = "departement")
    private List<Mission> missions;
}
