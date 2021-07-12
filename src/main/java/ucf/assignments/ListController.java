package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;

public class ListController {

    @FXML
    public void newListButtonClicked(ActionEvent actionEvent) {
        //mouse clicks new list
        //gui opens, prompting user for list name
        //user enters list name and accepts changes
        //txt file updates with new list name
        //column updates with new list name
    }

    @FXML
    public void modifyListButtonClicked(ActionEvent actionEvent) {
        //mouse clicks modify list
        //ItemMaker.fxml opens
    }

    @FXML
    public void renameListButtonClicked(ActionEvent actionEvent) {
        //mouse clicks rename list
        //list name highlights
        //user can input the new name of the list
        //upon clicking off/pressing enter, list name is updated
        //txt file updates with new list name
    }

    @FXML
    public void deleteListButtonClicked(ActionEvent actionEvent) {
        //mouse clicks delete list
        //gui opens, asking if user is sure or not
        //if yes clicked
        //  delete list that's currently highlighted
        //  txt file updates with list removed
        //else no clicked
        //  close current gui
    }

    @FXML
    public void fileButtonClicked(ActionEvent actionEvent) {
        //mouse clicks file
        //display dropdown of other buttons
    }

    @FXML
    public void helpButtonClicked(ActionEvent actionEvent) {
        //mouse clicks help
        //display dropdown of other buttons
    }

    @FXML
    public void openButtonClicked(ActionEvent actionEvent) {
        //mouse clicks open
        //open file explorer
        //upon selecting directory, display current lists and due dates
    }

    @FXML
    public void saveButtonClicked(ActionEvent actionEvent) {
        //mouse clicks save
        //save txt file to set directory
    }

    @FXML
    public void saveAsButtonClicked(ActionEvent actionEvent) {
        //mouse clicks save as
        //open file explorer
        //upon selecting directory, save txt file to directory
    }

    @FXML
    public void listColumnClicked(TableColumn.CellEditEvent cellEditEvent) {
        //mouse clicks list column
        //list column sorts by ascending alphabetical order
        //mouse clicks list column again
        //list column sorts by descending alphabetical order
        //repeat unless due dates column clicked
    }

    @FXML
    public void datesColumnClicked(TableColumn.CellEditEvent cellEditEvent) {
        //mouse clicks due dates column
        //due dates column sorts by what's due the soonest
        //mouse clicks due dates column again
        //due dates column sorts by what's due the longest from now
        //repeat unless list column clicked
    }
}
