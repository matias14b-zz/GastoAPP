DROP ALL OBJECTS;

CREATE TABLE gasto (
    id          BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombre      VARCHAR(100),
    tipo_gasto  VARCHAR(100),
    mes_gasto   VARCHAR(100),
    es_gasto_mensual BOOLEAN DEFAULT FALSE
);