package com.kodilla.hibernate.taskListDao;

import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.dao.TaskListDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "1 TaskList";

    @Test
    public void testTaskListFindByListName() {
        //Given
        TaskList taskList = new TaskList("1", DESCRIPTION);
        taskListDao.save(taskList);
        String name = taskList.getListName();

        //When
        String result = "1";

        //Then
        Assert.assertEquals(result, name);

        //CleanUp
        taskListDao.delete(taskList);
    }
}