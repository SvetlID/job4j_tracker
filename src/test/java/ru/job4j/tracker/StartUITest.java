package ru.job4j.tracker;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenReplaceItemTestOutputSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        String replaceName = "New Test Name";
        Input in = new StubInput(
                new String[]{"0", String.valueOf(one.getId()), replaceName, "1"}
        );
        UserAction[] actions = new UserAction[]{
                new EditItem(out),
                new ExitProgram(out)
        };
        new StartUI(out).init(in, tracker, List.of(actions));
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0.Edit Item" + ln
                        + "1.Exit program" + ln
                        + "=== Edit item ===" + ln
                        + "Заявка изменена успешно." + ln
                        + "Menu." + ln
                        + "0.Edit Item" + ln
                        + "1.Exit program" + ln
                        + "=== Exit Program ===" + ln
        ));
    }

    @Test
    public void whenFindAllTestOutputSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Input in = new StubInput(
                new String[]{"0", String.valueOf(one.getId()), "1"}
        );
        UserAction[] actions = new UserAction[]{
                new ShowItems(out),
                new ExitProgram(out)
        };
        new StartUI(out).init(in, tracker, List.of(actions));
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0.Show all items" + ln
                        + "1.Exit program" + ln
                        + "=== Show all items ===" + ln
                        + one + ln
                        + "Menu." + ln
                        + "0.Show all items" + ln
                        + "1.Exit program" + ln
                        + "=== Exit Program ===" + ln
        ));
    }

    @Test
    public void whenFindByIdTestOutputSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Input in = new StubInput(
                new String[]{"0", String.valueOf(one.getId()), "1"}
        );
        UserAction[] actions = new UserAction[]{
                new FindItem(out),
                new ExitProgram(out)
        };
        new StartUI(out).init(in, tracker, List.of(actions));
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0.Find Item by ID" + ln
                        + "1.Exit program" + ln
                        + "=== Find by item ===" + ln
                        + one + ln
                        + "Menu." + ln
                        + "0.Find Item by ID" + ln
                        + "1.Exit program" + ln
                        + "=== Exit Program ===" + ln
        ));
    }

    @Test
    public void whenFindByNameTestOutputSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Input in = new StubInput(
                new String[]{"0", one.getName(), "1"}
        );
        UserAction[] actions = new UserAction[]{
                new FindByName(out),
                new ExitProgram(out)
        };
        new StartUI(out).init(in, tracker, List.of(actions));
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0.Find Items by Name" + ln
                        + "1.Exit program" + ln
                        + "=== Find items by name ===" + ln
                        + one + ln
                        + "Menu." + ln
                        + "0.Find Items by Name" + ln
                        + "1.Exit program" + ln
                        + "=== Exit Program ===" + ln
        ));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitProgram(out)
        };
        new StartUI(out).init(in, tracker, List.of(actions));
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0.Exit program" + System.lineSeparator()
                        + "=== Exit Program ===" + System.lineSeparator()
        ));
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"1", "0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitProgram(out)
        };
        new StartUI(out).init(in, tracker, List.of(actions));
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0.Exit program" + System.lineSeparator()
                        + "Wrong input, you can select: 0..0" + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0.Exit program" + System.lineSeparator()
                        + "=== Exit Program ===" + System.lineSeparator()
        ));
    }
}