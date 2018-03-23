CREATE SCHEMA wishes;
CREATE LOGIN AdminUser WITH PASSWORD = 'P@ssw0rd';
CREATE USER AdminUser for LOGIN AdminUser WITH DEFAULT_SCHEMA = wishes;
GRANT SELECT, INSERT, UPDATE, DELETE,ALTER,REFERENCES ON SCHEMA::wishes TO AdminUser

drop TABLE master.wishes.person
Create TABLE master.wishes.person (
  id INT IDENTITY (1,1),
  username varchar(255),
  password varchar(255),
  email varchar(255),
  role_id INT,
  FOREIGN KEY (role_id) REFERENCES master.wishes.role(id),
  PRIMARY KEY (id)


)
go

drop TABLE master.wishes.role
CREATE TABLE master.wishes.role (
  id INT IDENTITY (1,1),
  description VARCHAR(255)
  PRIMARY KEY (id)
)
GO

CREATE TABLE master.wishes.birthday(
  id INT IDENTITY (1,1),
  dob date,
  name VARCHAR(255),
auto_wish BIT,
  photo IMAGE,
  created_by int,
  FOREIGN KEY (created_by) REFERENCES master.wishes.person(id)
)
GO

