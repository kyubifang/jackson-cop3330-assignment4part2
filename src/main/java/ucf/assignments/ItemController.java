/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Jamar Jackson
 */

package ucf.assignments;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ItemController extends ListMaker {

    public MenuItem openBtn;
    public MenuItem saveBtn;
    public MenuItem saveAsBtn;
    public MenuItem closeBtn;
    public MenuItem how2Btn;
    public MenuItem aboutBtn;
    public TextField taskField;
    public TextField descField;
    public DatePicker datePicker;
    public Button addBtn;
    public Button renameBtn;
    public Button editDateBtn;
    public Button editDescBtn;
    public Button deleteBtn;
    public Button deleteAllBtn;
    public TableView<Table> tableView;
    public TableColumn<Table, String> taskCol;
    public TableColumn<Table, String> dateCol;
    public TableColumn<Table, String> compCol;
    public TableColumn<Table, String> descCol;
    public SplitMenuButton filter;
    public MenuItem showAllBtn;
    public MenuItem incompBtn;
    public MenuItem compBtn;
    public Label noRow;
    public Label noTask;

    public final TableView<Table> table = new TableView<>();
    public final ObservableList<Table> data = FXCollections.observableArrayList();
    public final Desktop desktop = Desktop.getDesktop();
    final FileChooser fileChooser = new FileChooser();

    @FXML
    void run() {
    }

    @FXML
    public void addButtonClicked() {
        //mouse clicks add button
        //check if there is a task put into the task name field
        //if there isn't
        //  prompt user for a task name
        noTask.setVisible(taskField == null);
        //else
        //  add task name to list. If date a/o description available, add as well.

        addBtn.setOnAction(event -> {
            data.add(new Table(
                    taskField.getText(),
                    datePicker.getEditor().getText(),
                    descField.getText()
            ));
            taskField.clear();
            datePicker.getEditor().clear();
            descField.clear();
            tableView.getItems().addAll(data);
            tableView.setItems(data);
        });
        tableView.getItems().addAll(data);
        tableView.setItems(data);
    }

    @FXML
    public void enterButtonAdd(KeyEvent keyEvent) {
        //enter button pressed
        //check if there is a task put into the task name field
        //if there is
        //  add task name to list. If date a/o description available, add as well.
        //else
        //  prompt user for a task name
    }

    @FXML
    public void renameButtonClicked(MouseEvent actionEvent) {
        //mouse clicks rename button
        //highlight current selected item's task name
        //allow user to input a new name
        //once clicked off of or enter is pressed
        //update task list with new task name
    }

    @FXML
    public void editDateButtonClicked(MouseEvent actionEvent) {
        //mouse clicks edit date button
        //highlight current selected item's date
        //allow user to input a new due date
        //once clicked off of or enter is pressed
        //update task list with new task due date
    }

    @FXML
    public void editDescriptionButtonClicked(MouseEvent actionEvent) {
        //mouse clicks edit description button
        //highlight current selected item's description
        //allow user to input a new description
        //once clicked off of or enter is pressed
        //update task list with new task description
    }

    @FXML
    public void deleteButtonClicked(MouseEvent actionEvent) {
        //mouse clicks delete button
        //gui will open for current highlighted task, prompting if the user is sure
        //if yes
        //  delete task, date, description, and completion (if applicable) from table
        //else no
        //  close current gui
    }

    @FXML
    public void openMenuClicked(ActionEvent actionEvent) {
        //mouse clicks open
        //open file explorer
        openBtn.setOnAction(
                event -> {
                    File oFile = fileChooser.showOpenDialog(null);
                    if (oFile != null) {
                        openFile(oFile);
                    }
                }
        );
        //upon selecting list directory, display current tasks, due dates, descriptions, and if completed

    }

    @FXML
    public void saveMenuClicked(ActionEvent actionEvent) {
        //mouse clicks save
        //if never saved
        //  saveAsMenuClicked
        //else
        //  save current list to set directory
        saveBtn.setOnAction(
                event -> {
                    File sFile = fileChooser.showOpenDialog(null);
                    if (sFile != null) {
                        saveFile(sFile);
                    }else{
                        saveAsFile(data, sFile);
                    }
                }
        );
    }

    @FXML
    public void saveAsMenuClicked(ActionEvent actionEvent) {
        //mouse clicks save as or first time saving
        //open file explorer
        //upon selecting directory and name, save list variables within a text document
        saveAsBtn.setOnAction(
                event -> {
                    File sAFile = fileChooser.showOpenDialog(null);
                    if (sAFile != null) {
                        saveAsFile(data, sAFile);
                    }
                }
        );
    }

    @FXML
    public void closeMenuClicked(ActionEvent actionEvent) {
        //mouse clicks close
        //if changes made before saving
        //  prompt user if they want to save changes or not
        //else
        //  close current list
    }

    @FXML
    public void howToUseMenuClicked(ActionEvent actionEvent) {
        //mouse clicks how to use
        //display text file with instructions
        //dedicate to "rey"
    }

    @FXML
    public void aboutMenuClicked(ActionEvent actionEvent) {
        //mouse clicks about
        //display text file about this project
        //dedicate to "rey"
    }

    @FXML
    public void deleteAllButtonClicked(MouseEvent actionEvent) {
        //mouse clicks delete all
        //prompt user if they're sure they want to delete everything in current list
        //if yes
        //  delete all from list
    }

    @FXML
    public void showAllFilterClicked(ActionEvent actionEvent) {
        //mouse clicks show all
        //list displays all tasks, regardless of completion
    }

    @FXML
    public void incompleteFilterClicked(ActionEvent actionEvent) {
        //mouse clicks incomplete
        //list hides all completed tasks
    }

    @FXML
    public void completedFilterClicked(ActionEvent actionEvent) {
        //mouse clicks completed
        //list hides all incomplete tasks
    }

    @FXML
    public void tableColumnClicked(SortEvent<TableView> tableViewSortEvent) {
        //mouse clicks specific column
        //column sorts by ascending alphabetical order/due soonest/completion
        //mouse clicks same column again
        //column sorts by descending alphabetical order/due latest/incomplete
        //repeat unless different column clicked
    }

    @FXML
    public void doubleClick(TableColumn.CellEditEvent cellEditEvent) {
        //column and row in table double clicked
        //highlight that specific value for editing
    }

    @FXML
    public void saveEdit(TableColumn.CellEditEvent cellEditEvent) {
        //mouse clicks off highlighted value/enter key is pressed
        //save over that previous value
    }

    @FXML
    public void cancelEdit(TableColumn.CellEditEvent cellEditEvent) {
        //escape button pressed
        //cancel edit of previous/current value
    }

    private void openFile(File file) {
        try {
            desktop.open(file);
        } catch (IOException ex) {
            Logger.getLogger(
                    ItemController.class.getName()).log(
                    Level.SEVERE, null, ex
            );
        }
    }

    private void saveFile(File sFile) {
        try{
            desktop.print(sFile);
        } catch (IOException ex) {
            Logger.getLogger(
                    ItemController.class.getName()).log(
                    Level.SEVERE, null, ex
            );
        }
    }

    private void saveAsFile(ObservableList<Table> data, File sAFile) {
        try{
            BufferedWriter newSave = new BufferedWriter(new FileWriter(sAFile));

            for(int i = 0; i < data.size(); i++) {
                newSave.write(tableView.toString());
                newSave.newLine();
            }
        }catch(IOException e) {
            System.out.println("Unable to save.");
        }
    }


    public static class Table {
        private final SimpleStringProperty task;
        private final SimpleDateFormat date;
        private final SimpleStringProperty description;

        public Table(String task, String date, String description) {
            this.task = new SimpleStringProperty(task);
            this.date = new SimpleDateFormat(date);
            this.description = new SimpleStringProperty(description);
        }

        public String getTask() {
            return task.get();
        }

        public void setTask(String tasks) {
            task.set(tasks);
        }

        public SimpleStringProperty taskProperty() {
            return task;
        }

        public Calendar getDate() {
            return date.getCalendar();
        }

        public void setDate(Calendar dates) {
            date.setCalendar(dates);
        }

        public SimpleDateFormat dateProperty() {
            return date;
        }

        public String getDescription() {
            return description.get();
        }

        public void setDescription(String descriptions) {
            description.set(descriptions);
        }

        public SimpleStringProperty descriptionProperty() {
            return description;
        }
    }
}

