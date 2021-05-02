package com.javanibble.springdata.examples.identifier.generator;


import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.util.Random;

public class StaffIdentifierGenerator implements IdentifierGenerator {


    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object obj)  throws HibernateException {
        Random random = new Random();
        int randomId = random.nextInt(1000000);
        return Long.valueOf(randomId);
    }

}
