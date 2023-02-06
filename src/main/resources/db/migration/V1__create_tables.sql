CREATE TABLE categoria (
  id bigint NOT NULL AUTO_INCREMENT,
  nome varchar(100) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE marca (
  id bigint NOT NULL AUTO_INCREMENT,
  nome varchar(100) NOT NULL,
  PRIMARY KEY (id)
);


CREATE TABLE modelo (
  id bigint NOT NULL AUTO_INCREMENT,
  nome varchar(100) NOT NULL,
  marca_id bigint DEFAULT NULL,
  PRIMARY KEY (id),
  KEY FK_MODELO_ON_MARCA (marca_id),
  CONSTRAINT FK_MODELO_ON_MARCA FOREIGN KEY (marca_id) REFERENCES marca (id)
);

CREATE TABLE status (
  id bigint NOT NULL AUTO_INCREMENT,
  nome varchar(20) NOT NULL,
  PRIMARY KEY (id)
);


CREATE TABLE tipo (
  id bigint NOT NULL AUTO_INCREMENT,
  nome varchar(100) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE localizacao (
  id bigint NOT NULL AUTO_INCREMENT,
  nome varchar(100) NOT NULL,
  responsavel varchar(50) DEFAULT NULL,
  telefone varchar(11) DEFAULT NULL,
  email varchar(150) DEFAULT NULL,
  logradouro varchar(60) DEFAULT NULL,
  numero varchar(10) DEFAULT NULL,
  bairro varchar(60) DEFAULT NULL,
  cidade varchar(60) DEFAULT NULL,
  uf_estado char(2) DEFAULT NULL,
  cep char(10) DEFAULT NULL,
  PRIMARY KEY (id)
);


CREATE TABLE patrimonio (
  id bigint NOT NULL AUTO_INCREMENT,
  categoria_id bigint NOT NULL,
  tipo_id bigint NOT NULL,
  modelo_id bigint DEFAULT NULL,
  localizacao_id bigint NOT NULL,
  status_id bigint NOT NULL,
  valor decimal(10,2) NOT NULL,
  numero_serie varchar(50) DEFAULT NULL,
  data_fabricacao date DEFAULT NULL,
  data_compra date DEFAULT NULL,
  nota_fiscal int DEFAULT NULL,
  data_fim_garantia date DEFAULT NULL,
  data_cadastro date NOT NULL,
  data_alteracao date DEFAULT NULL,
  observacao text,
  PRIMARY KEY (id),
  KEY FK_PATRIMONIO_ON_CATEGORIA (categoria_id),
  KEY FK_PATRIMONIO_ON_LOCALIZACAO (localizacao_id),
  KEY FK_PATRIMONIO_ON_MODELO (modelo_id),
  KEY FK_PATRIMONIO_ON_STATUS (status_id),
  KEY FK_PATRIMONIO_ON_TIPO (tipo_id),
  CONSTRAINT FK_PATRIMONIO_ON_CATEGORIA FOREIGN KEY (categoria_id) REFERENCES categoria (id),
  CONSTRAINT FK_PATRIMONIO_ON_LOCALIZACAO FOREIGN KEY (localizacao_id) REFERENCES localizacao (id),
  CONSTRAINT FK_PATRIMONIO_ON_MODELO FOREIGN KEY (modelo_id) REFERENCES modelo (id),
  CONSTRAINT FK_PATRIMONIO_ON_STATUS FOREIGN KEY (status_id) REFERENCES status (id),
  CONSTRAINT FK_PATRIMONIO_ON_TIPO FOREIGN KEY (tipo_id) REFERENCES tipo (id)
);



