package com.javanibble.springdata.examples.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Staff {

    @Id
    @GenericGenerator(name="staff_id", strategy="com.javanibble.springdata.examples.identifier.generator.StaffIdentifierGenerator")
    @GeneratedValue(generator="staff_id")
    private Long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;
}
