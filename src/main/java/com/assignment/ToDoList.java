package com.assignment;

import java.util.Date;
import java.util.Map;

public class ToDoList {

	private String title;
	private String note;
	private Date deadLine;
	private Boolean completionFlag;
	private static Map<String, ToDoList> todoLists;

	public ToDoList(String title, String note, Date date, Boolean flag) {
		this.title = title;
		this.note = note;
		this.deadLine = date;
		this.completionFlag = flag;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}

	public boolean isCompletionFlag() {
		return completionFlag;
	}

	public void setCompletionFlag(boolean completionFlag) {
		this.completionFlag = completionFlag;
	}

	public static Map<String, ToDoList> getMapLts() {
		return todoLists;
	}

	public void setMapLts(Map<String, ToDoList> todoLists) {
		ToDoList.todoLists = todoLists;
	}
}
