package com.assignment;

import java.util.ArrayList;
import java.util.List;

public class ToDoListService {

	public static List<ToDoList> getList(String title) {
		List<ToDoList> getList = new ArrayList<ToDoList>();
		getList = ToDoList.getMapLts().get(title);
		return getList;
	}

	public static List<ToDoList> getAllList() {
		List<ToDoList> getLists = new ArrayList<ToDoList>();
		for (List<ToDoList> mapToDoLts : ToDoList.getMapLts().values()) {
			getLists.addAll(mapToDoLts);
		}
		return getLists;
	}

	public static boolean addItem(ToDoList todoLs) {
		return false;
		// TODO 自動生成されたメソッド・スタブ

	}

	public static boolean updateItem(ToDoList todoLs) {
		return false;
		// TODO 自動生成されたメソッド・スタブ

	}

	public static boolean deleteItem(String title) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}
}
