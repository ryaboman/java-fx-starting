module ru.ryaboman {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens ru.ryaboman.demoJavaFX to javafx.fxml;
    exports ru.ryaboman.demoJavaFX;

    opens ru.ryaboman.javaFX.testButtons to javafx.fxml;
    exports ru.ryaboman.javaFX.testButtons;

    opens ru.ryaboman.javaFX.DocSystem to javafx.fxml;
    exports ru.ryaboman.javaFX.DocSystem;
}