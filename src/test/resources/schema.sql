DROP
ALL OBJECTS;

CREATE TABLE gasto
(
    id               BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombre           VARCHAR(100),
    tipo_gasto       VARCHAR(200),
    mes_gasto        VARCHAR(100),
    es_gasto_mensual BOOLEAN DEFAULT FALSE
);

INSERT INTO gasto (id, nombre, tipo_gasto, mes_gasto, es_gasto_mensual)
VALUES (1, 'ESTUDDIANTES', 'SERVICIOS', 'ENERO', true);