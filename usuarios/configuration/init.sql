CREATE TABLE usuarios (
 id_usuario SERIAL PRIMARY KEY,
 nombre VARCHAR(100) NOT NULL,
 correo VARCHAR(255) UNIQUE,
 telefono VARCHAR(15),
 fecha_nacimiento DATE
);
CREATE TABLE credenciales (
 id_credencial SERIAL PRIMARY KEY,
 id_usuario INT NOT NULL,
 username VARCHAR(50) UNIQUE NOT NULL,
 password_hash VARCHAR(255) NOT NULL,
 FOREIGN KEY (id_usuario) REFERENCES usuarios (id_usuario)
);
INSERT INTO usuarios (nombre, correo, telefono, fecha_nacimiento)
VALUES
('Juan Pérez', 'juan.perez1@example.com', '1234567890', '1985-01-15'),
('Ana Gómez', 'ana.gomez2@example.com', '1234567891', '1990-03-22'),
('Luis Martínez', 'luis.martinez3@example.com', '1234567892', '1988-07-10'),
('María López', 'maria.lopez4@example.com', '1234567893', '1992-11-05'),
('Carlos Ruiz', 'carlos.ruiz5@example.com', '1234567894', '1980-06-25'),
('Sofía Castro', 'sofia.castro6@example.com', '1234567895', '1995-02-18'),
('David Ramírez', 'david.ramirez7@example.com', '1234567896', '1983-09-09'),
('Patricia Vega', 'patricia.vega20@example.com', '1234567809', '1990-09-05');
-- Insertar datos en la tabla credenciales
INSERT INTO credenciales (id_usuario, username, password_hash)
VALUES
(1, 'juan.perez1', 'hash_juan_perez'),
(2, 'ana.gomez2', 'hash_ana_gomez'),
(3, 'luis.martinez3', 'hash_luis_martinez'),
(4, 'maria.lopez4', 'hash_maria_lopez'),
(5, 'patricia.vega20', 'hash_patricia_vega');
