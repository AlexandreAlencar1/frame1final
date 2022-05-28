package br.edu.ifms.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Agiota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAgiota;
    private String nomeAgiota;

    // OneToOne Projeto
    @OneToOne(cascade = { CascadeType.ALL })
    @JoinColumn(name = "idProjeto")
    private Projeto projeto;
}
