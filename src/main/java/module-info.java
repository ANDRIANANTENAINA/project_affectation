module l2.project_affectation {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.sql.rowset;


    opens l2.project_affectation to javafx.fxml;
    exports l2.project_affectation;
    exports l2.project_affectation.controller;
    opens l2.project_affectation.controller to javafx.fxml;
}