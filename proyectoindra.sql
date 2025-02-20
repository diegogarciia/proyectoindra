CREATE TABLE Usuario(
id_usuario NUMBER(5) PRIMARY KEY,
nombre VARCHAR2(50) NOT NULL,
email VARCHAR2(50) UNIQUE NOT NULL,
contraseña VARCHAR2(255) NOT NULL
);

CREATE TABLE Organizador(
id_organizador NUMBER(5) PRIMARY KEY,
nombre VARCHAR2(100) NOT NULL,
contacto VARCHAR2(100) NOT NULL
);

CREATE TABLE Categoria(
id_categoria NUMBER(5) PRIMARY KEY,
nombre VARCHAR2(50) NOT NULL
);

CREATE TABLE Ubicacion(
id_ubicacion NUMBER(5) PRIMARY KEY,
tipo VARCHAR2(50) NOT NULL,
direccion VARCHAR2(255)
);

CREATE TABLE Evento(
id_evento NUMBER(5) PRIMARY KEY,
nombre VARCHAR2(100) NOT NULL,
fecha DATE NOT NULL,
duracion NUMBER(5) NOT NULL,
id_categoria NUMBER(5) NOT NULL,
id_ubicacion NUMBER(5) NOT NULL,
id_organizador NUMBER(5) NOT NULL,
FOREIGN KEY (id_categoria) REFERENCES Categoria(id_categoria),
FOREIGN KEY (id_ubicacion) REFERENCES Ubicacion(id_ubicacion),
FOREIGN KEY (id_organizador) REFERENCES Organizador(id_organizador)
);

CREATE TABLE Inscripcion(
id_inscripcion NUMBER(5) PRIMARY KEY,
id_usuario NUMBER(5) NOT NULL,
id_evento NUMBER(5) NOT NULL,
fecha_inscripcion DATE NOT NULL,
FOREIGN KEY (id_usuario) REFERENCES Usuario(id_usuario),
FOREIGN KEY (id_evento) REFERENCES Evento(id_evento)
);



