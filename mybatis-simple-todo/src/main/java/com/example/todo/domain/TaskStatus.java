package com.example.todo.domain;

public enum TaskStatus {
  INBOX(1),
  IN_PROGRESS(2),
  DONE(3), ;

  private int type;

  TaskStatus(int type) {
    this.type = type;
  }

  public int getType() {
    return type;
  }

  static TaskStatus of(int type) {
    for (TaskStatus value : values()) {
      if (value.getType() == type) {
        return value;
      }
    }
    throw new IllegalArgumentException("Unexpected type.");
  }
}
