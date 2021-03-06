package com.kodilla.spring.portfolio;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testRead() {
//Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        board.getDoneList().addTask("1 task in DoneList");
        board.getInProgressList().addTask("1 tast in InProgressList");
        board.getToDoList().addTask("1 task in ToDoList");
//When
        System.out.println(board.getDoneList().getTaskFromList(0));
        System.out.println(board.getInProgressList().getTaskFromList(0));
        System.out.println(board.getToDoList().getTaskFromList(0));
    }

}
