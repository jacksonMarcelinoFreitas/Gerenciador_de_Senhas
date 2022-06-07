CREATE SCHEMA gerenciar_senhas;
USE gerenciar_senhas;

CREATE TABLE Usuario(
	idUsuario INT AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(50),
	sobrenome VARCHAR(50)
);

CREATE TABLE Senha(
	idSenha INT AUTO_INCREMENT PRIMARY KEY,
	senha VARCHAR(50)
);

CREATE TABLE Login(
	idLogin INT AUTO_INCREMENT PRIMARY KEY,
	tipo VARCHAR(50),
	url VARCHAR(50),
    fk_idUsuario INT,
    fk_idSenha INT,
	FOREIGN KEY (fk_idUsuario) REFERENCES Usuario(idUsuario),
    FOREIGN KEY (fk_idSenha) REFERENCES Senha(idSenha)
);

INSERT INTO Usuario (nome, sobrenome) VALUES ("Jackson", "Marcelino de Freitas");
INSERT INTO Usuario (nome, sobrenome) VALUES ("Alciomar", "Ackley");
INSERT INTO Usuario (nome, sobrenome) VALUES ("Vitor", "Da Silva");


INSERT INTO Login (tipo, url, fk_idUsuario, fk_idSenha) VALUES ("Google", "https://www.google.com/account/about/", 1, 1);
INSERT INTO Login (tipo, url, fk_idUsuario, fk_idSenha) VALUES ("Amazon", "https://www.amazon.com.br/", 2, 2);
INSERT INTO Login (tipo, url, fk_idUsuario, fk_idSenha) VALUES ("Behance", "https://www.behance.net/", 3, 3);

INSERT INTO Senha (senha) VALUES ("freitas1457JDK");
INSERT INTO Senha (senha) VALUES ("amifit123");
INSERT INTO Senha (senha) VALUES ("123456");


SELECT * FROM Usuario; 
SELECT * FROM Login;
SELECT * FROM Senha;

DROP TABLE Senha;
DROP TABLE Login;
DROP TABLE Usuario;
