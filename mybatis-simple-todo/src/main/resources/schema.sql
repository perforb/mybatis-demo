CREATE TABLE todo (
    project_name VARCHAR,
    task_name VARCHAR,
    status INT,
    PRIMARY KEY(project_name, task_name)
);
