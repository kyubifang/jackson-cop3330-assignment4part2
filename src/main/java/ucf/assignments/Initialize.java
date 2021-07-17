/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Jamar Jackson
 */

package ucf.assignments;

import javafx.scene.control.cell.PropertyValueFactory;

public class Initialize extends ItemController {
    public void run(){
        table.setEditable(true);
        taskCol.setCellValueFactory(new PropertyValueFactory<>("Task"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("Due Date"));
        descCol.setCellValueFactory(new PropertyValueFactory<>("Description"));
    }
}
