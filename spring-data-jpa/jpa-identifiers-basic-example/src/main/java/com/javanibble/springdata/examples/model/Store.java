package com.javanibble.springdata.examples.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="store-sequence-generator")
    @SequenceGenerator(name = "store-sequence-generator", sequenceName = "user_sequence", initialValue = 5  , allocationSize=1)
    private Long id;
    private String name;
}
