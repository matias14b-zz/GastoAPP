package com.nico.agendaContable.GastoAPP.repository;

import com.nico.agendaContable.GastoAPP.domain.Gasto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GastoRepository extends JpaRepository<Gasto, Long> {

}
