package com.github.boyarsky1997.task.io.command;

import org.junit.Assert;
import org.junit.Test;

public class CDCommandTest {
    @Test
    public void testClip() {

        String actual = CDCommand.clip("C:\\Users\\roman\\IdeaProjects\\epam-tasks\\src\\main\\java\\com\\github\\boyarsky1997\\task\\io\\command\\CDCommand.java");

        Assert.assertEquals("C:\\Users\\roman\\IdeaProjects\\epam-tasks\\src\\main\\java\\com\\github\\boyarsky1997\\task\\io\\command", actual);
    }


    @Test(expected = RuntimeException.class)
    public void testExecute(){
        String[] array = {"cd","ff"};

        CDCommand cdCommand = new CDCommand();
        cdCommand.execute(array);

    }

}