package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListControllerTest {

    @Test
    void newListButtonClicked() {
        //#6
        //click button for new list
        //open gui for a new list
        //input a list name and due date
        //assert that the txt file updates with name and date
    }

    @Test
    void modifyListButtonClicked() {
        //#9-16
        //click button for modify list
        //open gui for ItemMaker.fxml
        //see ItemControllerTest
        //upon finishing
        //assert that list was modified in txt file
    }

    @Test
    void renameListButtonClicked() {
        //#8
        //click rename button for selected list
        //change list name to a new name
        //accept changes
        //assert that txt file no longer has previous list name
        //assert that txt file now has new list name
    }

    @Test
    void deleteListButtonClicked() {
        //#7
        //click button for selected list
        //open gui for deleting a list
        //select yes
        //assert that txt file no longer has that previous list

        //select no
        //assert that txt file still contains that previous list
    }

    @Test
    void fileButtonClicked() {
    }

    @Test
    void helpButtonClicked() {
    }

    @Test
    void openButtonClicked() {
        //#19-20
        //click file, then navigate to open
        //locate file on desktop
        //assert that txt file was correctly opened in gui
    }

    @Test
    void saveButtonClicked() {

    }

    @Test
    void saveAsButtonClicked() {
        //#18
        //click file button and navigate to save as
        //save to-do list to desktop
        //assert that txt file can be located
        //assert that txt file has contents
    }

    @Test
    void listColumnClicked() {

    }

    @Test
    void datesColumnClicked() {
    }
}