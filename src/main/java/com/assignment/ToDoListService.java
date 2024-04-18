package com.assignment;

import java.util.ArrayList;
import java.util.List;

public class ToDoListService {

	// 検索
	public static ToDoList getList(String title) {
		ToDoList getList = new ToDoList(null, null, null, null);
		getList = ToDoList.getMapLts().get(title);
		return getList;
	}

	// 全検索
	public static List<ToDoList> getAllList() {
		List<ToDoList> getLists = new ArrayList<ToDoList>();
		for (ToDoList mapToDoLts : ToDoList.getMapLts().values()) {
			getLists.add(mapToDoLts);
		}
		return getLists;
	}

	// 追加
	public static boolean addItem(String title, ToDoList todoLs) {
		ToDoList.getMapLts().put(title, todoLs);
		// 値が追加されたかの確認
		if (itemCheck(title)) {
			return true;
		} else {
			return false;
		}
	}

	//　更新
	public static boolean updateItem(String title, ToDoList todoLs) {
		ToDoList.getMapLts().replace(title, todoLs);

		return false;
		// TODO 自動生成されたメソッド・スタブ

	}

	// 削除
	public static boolean deleteItem(String title) {
		// TODO 自動生成されたメソッド・スタブ
		// 削除の場合は検索メソッドでfalseが帰ってくるとこのメソッドではtrueで返す
		return false;
	}

	// 各機能を実行した際に機能したことを確認するメソッド
	private static Boolean itemCheck(String key) {
		List<Boolean> check = new ArrayList<Boolean>();
		check.add(ToDoList.getMapLts().containsKey(key));
		return !check.contains(false);
	}
}
