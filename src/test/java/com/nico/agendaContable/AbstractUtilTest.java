package com.nico.agendaContable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Transactional
@SpringBootTest
public abstract class AbstractUtilTest {

    @Autowired
    @Qualifier("entityManagerFactory")
    protected EntityManager entityManager;
}
