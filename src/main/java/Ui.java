import java.util.ArrayList;
import java.util.Map;

/**
 * The Ui class is responsible for managing all user interactions.
 */

public class Ui {
    private static final String LINE = "____________________________________________________________";
    private static final String GREETING_MESSAGE = "yoo i'm alice! ur virtual bestie here to keep track of ur vibes";
    private static final String FAREWELL_MESSAGE = "bye bestie! catch ya later, and remember to stay hydrated <3";
    private static final String INVALID_INPUT_MESSAGE = "ayo my bad i can't seem to understand ya, try saying smt valid, or type 'help'";
    private static final String HELP_MESSAGE = "Feelin' lost? Just type 'help' and I'll be right here with the deets again!";

    /** Prints greeting message to the user. */
    public void showGreeting() {
        System.out.println(LINE);
        System.out.println(GREETING_MESSAGE);
        System.out.println("what's poppin? u can tell me stuff to remember, or type 'bye' to dip");
        System.out.println(LINE);
    }

    /** Prints farewell message to the user. */
    public void showFarewell() {
        System.out.println(LINE);
        System.out.println(FAREWELL_MESSAGE);
        System.out.println(LINE);
    }

    /** Shows the help message with available commands. */
    public void showHelp(){
        System.out.println(LINE);
        System.out.println("okay bestie, here's what u can throw at me to help ya <3 :");
        System.out.println("  - 'list': Peek at all that you gotta get done");
        System.out.println("  - 'todo [ description ]': Got something new to remember? I gotchu girlie!");
        System.out.println("  - 'deadline [ description ] /by [ date, time (e.g. YYYY-MM-dd HHmm) ]': Racing against the clock? I'll keep ya accountable");
        System.out.println("  - 'event [ description ] /from [ start time ] /to [ end time ]': Got new plans? Lemme know so u don't miss out any of them");
        System.out.println("  - 'mark [ task number ]': Finshed a task? YAY good job bestie ill help mark it off for ya");
        System.out.println("  - 'unmark [ task number ]': Took a lil step back? No worries, we can get back to it later u got this!");
        System.out.println("  - 'delete [ task number ]': Changed your mind about a task? Not to worry, ill make the task go poof!");
        System.out.println("  - 'find [ keyword ]': Want to find a particular task but forgot the full name? No worries, lemme know the keyword and ill find it for u!");
        System.out.println("  - 'bye': Need to head off somewhere? I'll catch ya later! Remember that ur amazing bestie :)");
        System.out.println(HELP_MESSAGE);
        System.out.println(LINE);
    }

    /** Displays an invalid input message to the user. */
    public void showInvalidInputMessage() {
        System.out.println(LINE);
        System.out.println(INVALID_INPUT_MESSAGE);
        System.out.println(LINE);
    }

    /** Shows the list of tasks to the user. */
    public void showTasks(ArrayList<Task> tasks) {
        System.out.println(LINE);
        if (tasks.isEmpty()) {
            System.out.println("this list is emptier than my motivation on a monday morning lol");
        } else {
            System.out.println("aight here's what's up:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i).toString());
            }
        }
        System.out.println(LINE);
    }

    /** Shows an error message to the user. */
    public void showError(String message) {
        System.out.println(LINE);
        System.out.println(message);
        System.out.println(LINE);
    }

    /** Informs the user that a task has been deleted. */
    public void showTaskDeleted(Task task, int listSize) {
        System.out.println(LINE);
        System.out.println("gotcha, ive made task " + task + " go poof!");
        System.out.println("now u got " + listSize + " tasks in ur list.");
        System.out.println(LINE);
    }

    /** Informs the user that a task has been added. */
    public void showTaskAdded(Task task, int listSize) {
        System.out.println(LINE);
        System.out.println("aight i gotchu bestie, added this task:");
        System.out.println(task);
        System.out.println("Now you have " + listSize + " tasks in the list");
        System.out.println(LINE);
    }

    /** Shows the task as marked done. */
    public void showMarkedTask(Task task) {
        System.out.println(LINE);
        System.out.println("yas queen, marked it off! we are crushing it frfr:");
        System.out.println("  " + task);
        System.out.println(LINE);
    }

    /** Shows the task as unmarked. */
    public void showUnmarkedTask(Task task) {
        System.out.println(LINE);
        System.out.println("aight, took a lil step back, unmarked this one:");
        System.out.println("  " + task);
        System.out.println(LINE);
    }

    /** Displays the tasks that match the search keyword. */
    public void showMatchingTasks(Map<Integer, Task> matchingTasks) {
        System.out.println(LINE);
        if (matchingTasks.isEmpty()) {
            System.out.println("No matching tasks found.");
        } else {
            System.out.println("Here are the matching tasks in your list:");
            for (Map.Entry<Integer, Task> entry : matchingTasks.entrySet()) {
                System.out.println(entry.getKey() + ". " + entry.getValue().toString());
            }
        }
        System.out.println(LINE);
    }

    /** Informs the user of a problem loading tasks from file. */
    public void showLoadingError() {
        System.out.println(LINE);
        System.out.println("ayo i wasnt able to load the tasks, do ensure that the file exists and is accessible");
        System.out.println(LINE);
    }
}
