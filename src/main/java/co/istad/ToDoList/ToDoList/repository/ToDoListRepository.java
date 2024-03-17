package co.istad.ToDoList.ToDoList.repository;

import co.istad.ToDoList.ToDoList.ToDoListApplication;
import co.istad.ToDoList.ToDoList.model.ToDoList;
import lombok.Data;
import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Repository
@Data
public class ToDoListRepository {
    private  List<ToDoList> toDoLists = new ArrayList<>();
    public  ToDoListRepository (){
        toDoLists.add(new ToDoList(1, "Java", "Language popular", true, LocalDate.now()));
        toDoLists.add(new ToDoList(2, "HTML", "Expectations of website", false, LocalDate.now()));
        toDoLists.add(new ToDoList(3, "Css", "Design of website", true, LocalDate.now()));
        toDoLists.add(new ToDoList(4, "Spring", "build of AIP ", false, LocalDate.now()));
    }
}