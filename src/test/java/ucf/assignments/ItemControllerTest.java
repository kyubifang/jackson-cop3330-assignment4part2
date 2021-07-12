package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemControllerTest {

    @Test
    void addButtonClicked() {
        //#9 continued
        //click add button with no inputs
        //assert that error was thrown
        //click add button with random inputs
        //assert that txt file contains those new inputs
    }

    @Test
    void renameButtonClicked() {
    }

    @Test
    void editDateButtonClicked() {
        //#12 continued
        //click edit date button with no task selected
        //assert that error was thrown
        //select random date in list
        //click edit date button
        //change due date to new due date
        //assert that txt file no longer has previous date
        //assert that txt file now has new date
    }

    @Test
    void editDescriptionButtonClicked() {
        //#11 continued
        //click edit description button with no task selected
        //assert that error was thrown
        //select random description in list
        //click edit description button
        //change description to new description
        //assert that txt file no longer has previous description
        //assert that txt file now has new description
    }

    @Test
    void deleteButtonClicked() {
        //#10 continued
        //click delete button with no task selected
        //assert that error was thrown
        //select random task in task list
        //click delete button
        //assert that txt file no longer has that task or supporting columns
    }

    @Test
    void taskColumnClicked() {
    }

    @Test
    void dateColumnClicked() {
    }

    @Test
    void completeColumnClicked() {
        //#14-16 continued
        //click complete column
        //assert that column displays only incomplete tasks
        //click complete column again
        //assert that column displays only complete tasks
        //click complete column once more
        //assert that all tasks are displayed
    }

    @Test
    void descriptionColumnClicked() {
    }
}