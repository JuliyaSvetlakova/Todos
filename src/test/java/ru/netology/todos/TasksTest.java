package ru.netology.todos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {

    @Test
    public void matchesForSimpleTaskTrue() {
        SimpleTask simpleTask = new SimpleTask(5, "Суббота Выходной");
        simpleTask.matches("Суббота Выходной");

        boolean expected = true;
        boolean actual = simpleTask.matches("Суббота Выходной");
        Assertions.assertEquals(expected, actual);
    }
   @Test
    public void matchesForSimpleTaskFalse() {
       SimpleTask simpleTask = new SimpleTask(5, "Суббота Выходной");
       simpleTask.matches("Привет");


       boolean expected = false;
       boolean actual = simpleTask.matches("Привет");
       Assertions.assertEquals(expected, actual);
   }

    @Test
    public void matchesForTopicMeetingTrue() {
        Meeting meeting = new Meeting(
                7,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        meeting.matches("Выкатка 3й версии приложения");

        boolean expected = true;
        boolean actual = meeting.matches("Выкатка 3й версии приложения");
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void matchesForMeetingFalse() {
        Meeting meeting = new Meeting(
                7,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        meeting.matches("Привет");

        boolean expected = false;
        boolean actual = meeting.matches("Привет");
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void matchesForProjectMeetingTrue() {
        Meeting meeting = new Meeting(
                7,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        meeting.matches("Приложение НетоБанка");

        boolean expected = true;
        boolean actual = meeting.matches("Приложение НетоБанка");
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void matchesForStartMeetingFalse() {
        Meeting meeting = new Meeting(
                7,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        meeting.matches("Во вторник после обеда");

        boolean expected = false;
        boolean actual = meeting.matches("Во вторник после обеда");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void matchesForEpicTrue() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);
        epic.matches("Хлеб");

        boolean expected = true;
        boolean actual = epic.matches("Хлеб");
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void matchesForEpicFalse() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);
        epic.matches("Сыр");

        boolean expected = false;
        boolean actual = epic.matches("Сыр");
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void getIdForTask() {
        Task task = new Task(8);

        int expected = (8);
        int actual = task.getId();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void getTitleForSimpleTask() {
        SimpleTask simpleTask = new SimpleTask(5, "Суббота Выходной");

        String expected = ("Суббота Выходной");
        String actual = simpleTask.getTitle();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void getTopicForMeeting() {
        Meeting meeting = new Meeting(
                7,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        String expected = ("Выкатка 3й версии приложения");
        String actual = meeting.getTopic();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void getProjectForMeeting() {
        Meeting meeting = new Meeting(
                7,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        String expected = ("Приложение НетоБанка");
        String actual = meeting.getProject();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void getStartForMeeting() {
        Meeting meeting = new Meeting(
                7,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        String expected = ("Во вторник после обеда");
        String actual = meeting.getStart();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void getSubtasksForEpic() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(33, subtasks);

        String[] expected = {"Молоко", "Яйца", "Хлеб"};
        String[] actual = epic.getSubtasks();
        Assertions.assertArrayEquals(expected, actual);
    }
}
