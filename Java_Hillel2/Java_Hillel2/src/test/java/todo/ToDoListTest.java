package todo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ToDoListTest {
    @Test
    public void addToDoTest(){
        ToDoList todos = new ToDoList();
        todos.add("Buy milk");
        Assert.assertEquals(todos.getTodos().size(),1);

    }
    @Test
    public void removeToDoTest(){
        ToDoList todos = new ToDoList();
        todos.add("Buy milk");
        Assert.assertEquals(todos.getTodos().size(),1);
        todos.remove("Buy milk");
        Assert.assertEquals(todos.getTodos().size(),0);
    }
}
