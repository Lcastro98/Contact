package com.sofka.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

/**
 * Se especifican los campos del modelo
 *
 * @version 1.00.00 2022-03-13 el modelo corresponde a la versión 1 del sistema.
 *
 * @author Lorena Castro <lcastro0398@gmail.com>
 */

@Data
@Entity
@Table(name="contact")
public class Contact implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cont_id")
    private Long id;

    @Column(name = "cont_name")
    private String name;

    @Column(name = "cont_phone")
    private String phone;

    @Column(name = "cont_email")
    private String email;

    @Column(name = "cont_date_birth")
    private String dateBirth;
}
