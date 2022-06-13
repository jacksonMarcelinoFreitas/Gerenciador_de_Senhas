CREATE SCHEMA gerenciar_senhas;
USE gerenciar_senhas;

CREATE TABLE Usuario(
	idUsuario INT AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(50),
	sobrenome VARCHAR(50)
);

CREATE TABLE Login(
	idLogin INT AUTO_INCREMENT PRIMARY KEY,
	tipo VARCHAR(50),
	url VARCHAR(50),
    senha VARCHAR(50),
    fk_idUsuario INT,
	FOREIGN KEY (fk_idUsuario) REFERENCES Usuario(idUsuario)
);

INSERT INTO Usuario (nome, sobrenome) VALUES ("Jackson", "Marcelino de Freitas");
INSERT INTO Usuario (nome, sobrenome) VALUES ("Alciomar", "Ackley");
INSERT INTO Usuario (nome, sobrenome) VALUES ("Vitor", "Da Silva");


INSERT INTO Login (tipo, url, senha, fk_idUsuario) VALUES ("Google", "https://www.google.com/account/about/", "jackson12345", 1);
INSERT INTO Login (tipo, url, senha, fk_idUsuario) VALUES ("Google", "https://www.amazon.com.br/", "AlciomarOlanda", 2);
INSERT INTO Login (tipo, url, senha, fk_idUsuario) VALUES ("Google", "https://www.behance.net/", "VitaoZinho", 3);


SELECT * FROM Usuario; 
SELECT * FROM Login;

DROP TABLE Usuario;
DROP TABLE Login;
drop schema gerenciar_senhas;

