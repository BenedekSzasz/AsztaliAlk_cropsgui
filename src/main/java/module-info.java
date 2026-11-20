/*
* File: module-info.java
* Author: Szász Benedek
* Copyright: 2026, Szász Benedek
* Group: Szoft II-N
* Date: 2026-11-20
* Github: https://github.com/BenedekSzasz
* Licenc: MIT
*/

module com.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    requires hu.szit.resclient;

    opens com.example to javafx.fxml, com.google.gson;
    exports com.example;
}
