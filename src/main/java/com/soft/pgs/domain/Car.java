package com.soft.pgs.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by phendzel on 6/20/2017.
 */
@Entity
@Getter
@Setter
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String color;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id")
    private Employee employee;

}
