<<<<<<< HEAD
CREATE TABLE IF NOT EXISTS Run (
	id INT NOT NULL,
	title varchar(250) NOT NULL,
	started_on timestamp NOT NULL,
	completed_on timestamp NOT NULL,
	km INT NOT NULL,
	location varchar(10) NOT NULL,
	PRIMARY KEY (id)
=======
CREATE TABLE IF NOT EXISTS Run (
	id INT NOT NULL,
	title varchar(250) NOT NULL,
	started_on timestamp NOT NULL,
	completed_on timestamp NOT NULL,
	km INT NOT NULL,
	location varchar(10) NOT NULL,
	PRIMARY KEY (id)
>>>>>>> 628b3ad (commit)
);