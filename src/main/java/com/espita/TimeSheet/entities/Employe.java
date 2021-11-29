package com.espita.TimeSheet.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //@Column(name = "abc") le nom de la colonne prenom dans la table
    private String prenom;

    private String nom;

    private String email;

    private boolean isActif;

    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToOne
    private Contrat contrat;

    @ManyToMany
    private List<Departement> departements;

    @OneToMany(mappedBy = "employe")
    private List<Timesheet> timesheets;


}
