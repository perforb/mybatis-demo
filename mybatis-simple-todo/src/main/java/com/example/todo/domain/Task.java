package com.example.todo.domain;

public class Task {

  private final TaskName name;
  private final TaskStatus status;

  public Task(TaskName name, TaskStatus status) {
    this.name = name;
    this.status = status;
  }

  public TaskName getName() {
    return name;
  }

  public TaskStatus getStatus() {
    return status;
  }
}
