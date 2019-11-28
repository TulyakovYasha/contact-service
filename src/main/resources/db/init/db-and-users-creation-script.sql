CREATE USER "contact_user" WITH PASSWORD 'password';
ALTER USER "contact_user" WITH SUPERUSER;

CREATE USER "flyway" WITH PASSWORD 'flyway';
ALTER USER "flyway" WITH SUPERUSER;

DROP DATABASE IF EXISTS "contacts";
CREATE DATABASE "contacts";