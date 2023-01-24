package com.nico.agendaContable.GastoAPP;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Transactional
@SpringBootTest
public abstract class AbstractUtilTest {

    @PersistenceContext
    protected EntityManager entityManager;
}
