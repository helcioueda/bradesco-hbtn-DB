CREATE TABLE alunos (
       id  integer,
        email varchar(255),
        matricula varchar(255),
        nascimento date,
        nomeCompleto varchar(255),
        primary key (id)
    )

CREATE TABLE cursos (
       id  integer,
        nome varchar(255),
        sigla varchar(255),
        professor_id bigint,
        primary key (id)
    )

CREATE TABLE curso_aluno (
       curso_id bigint not null,
        aluno_id bigint not null
    )

CREATE TABLE enderecos (
       id  integer,
        bairro varchar(255),
        cep integer,
        cidade varchar(255),
        endereco varchar(255),
        estado varchar(255),
        logradouro varchar(255),
        numero varchar(255),
        aluno_id bigint,
        primary key (id)
    )

CREATE TABLE materiais_curso (
       id  integer,
        url varchar(255),
        curso_id bigint,
        primary key (id)
    )

CREATE TABLE professores (
       id  integer,
        email varchar(255),
        matricula varchar(255),
        nomeCompleto varchar(255),
        primary key (id)
    )

CREATE TABLE telefones (
       id  integer,
        DDD varchar(255),
        numero varchar(255),
        aluno_id bigint,
        primary key (id)
    )

