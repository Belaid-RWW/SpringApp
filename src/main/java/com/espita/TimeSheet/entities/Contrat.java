package com.espita.TimeSheet.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int reference;

    @Temporal(TemporalType.DATE)
    private Date dateDebut;

    private String typeContrat;

    private float salaire;

    @OneToOne(mappedBy = "contrat")
    private Employe employe;
}
