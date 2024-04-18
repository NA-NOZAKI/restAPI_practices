package com.assignment;

import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoListController {

	// すべての ToDo アイテムのリストを取得する
	@GetMapping("/GetAll")
	public List<ToDoList> getToDoLsAll() {
		List<ToDoList> todoLs = ToDoListService.getAllList();
		return todoLs;
	}

	// 新しい ToDo アイテムを作成する
	@PostMapping("/AddItem")
	public String addItemk(String title, String note, Date date, Boolean flag) {
		// List のサイズから Id を set する
		ToDoList todoLs = new ToDoList(title, note, date, flag);
		// ToDo アイテムをリストに追加する
		if (ToDoListService.addItem(title,todoLs)) {
			return " Successfully CreateItem!! ";
		} else {
			return "!! Create Failure !!";
		}
	}

	// 指定された ID の ToDo アイテムを取得する
	@GetMapping("/GetKey=")
	public ToDoList getToDoLs(String title) {
		ToDoList todols = ToDoListService.getList(title);
		return todols;
	}

	// 指定された ID の ToDo アイテムを更新する
	@PutMapping("/UpdateKey=")
	public String updateItem(String title, String note, Date date, Boolean flag) {
		ToDoList todoLs = new ToDoList(title, note, date, flag);
		if (ToDoListService.updateItem(title,todoLs)) {
			return " Successfully update!! ";
		} else {
			return "!! Update Failure !!";
		}
	}

	// 指定された ID の ToDo アイテムを削除する
	@DeleteMapping("/DeleteKey=")
	public String deleteItem(String title) {
		if (ToDoListService.deleteItem(title)) {
			return " Successfully deleted!! ";
		} else {
			return "!! Delete Failure !!";
		}

	}
}
