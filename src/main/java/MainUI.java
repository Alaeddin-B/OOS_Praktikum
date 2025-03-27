import bank.*;
import bank.exceptions.AccountAlreadyExistsException;
import bank.exceptions.AccountDoesNotExistException;
import bank.exceptions.TransactionAlreadyExistException;
import bank.exceptions.TransactionAttributeException;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;


public class MainUI extends Application  {

    public static void main(String[] args) {
        launch(args);
    }
    Stage window;

    @Override
    public void start(Stage primaryStage) throws IOException, AccountAlreadyExistsException {

        window = primaryStage;
        window.setTitle("OOS Praktikum 5");

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Mainview.fxml"));
        Parent root = loader.load();

        Mainview controller = loader.getController();

        PrivateBank bank = new PrivateBank("Test Bank", 0.1, 0.2, "Bank Directory");
        //test eingaben
/*
        {
            Transaction einzahlung1 = new Payment("12.11.2024", 300.0, "Monatliche Einzahlung", 0.02, 0.01);
            Transaction auszahlung1 = new Payment("13.11.2024", -100.0, "Stromrechnung", 0.02, 0.01);
            Transaction einzahlung2 = new Payment("14.11.2024", 200.0, "Bonuszahlung", 0.02, 0.01);
            Transaction auszahlung2 = new Payment("15.11.2024", -50.0, "Lebensmittel", 0.02, 0.01);
            Transaction auszahlung3 = new Payment("16.11.2024", -200.0, "Miete", 0.02, 0.01);

            Transaction incomingTransfer1 = new IncomingTransfer("17.11.2024", 150.0, "Überweisung von Max", "Max", "TestKonto");
            Transaction outgoingTransfer1 = new OutgoingTransfer("18.11.2024", 80.0, "Überweisung an Sarah", "TestKonto", "Sarah");
            if (!bank.accountExists("John"))
                bank.createAccount("John");
            if (!bank.accountExists("Alice"))
                bank.createAccount("Alice");
            if (!bank.accountExists("David"))
                bank.createAccount("David");
            try {
                bank.addTransaction("David", einzahlung1);
                bank.addTransaction("David", einzahlung2);
                bank.addTransaction("David", auszahlung3);
                bank.addTransaction("David", auszahlung2);
                bank.addTransaction("David", auszahlung1);
                bank.addTransaction("David", incomingTransfer1);
                bank.addTransaction("David", outgoingTransfer1);

                bank.addTransaction("Alice", einzahlung1);
                bank.addTransaction("Alice", einzahlung2);
                bank.addTransaction("Alice", auszahlung3);
                bank.addTransaction("Alice", auszahlung2);
                bank.addTransaction("Alice", auszahlung1);
                bank.addTransaction("Alice", incomingTransfer1);
                bank.addTransaction("Alice", outgoingTransfer1);

                bank.addTransaction("John", einzahlung1);
                bank.addTransaction("John", einzahlung2);
                bank.addTransaction("John", auszahlung3);
                bank.addTransaction("John", auszahlung2);
                bank.addTransaction("John", auszahlung1);
                bank.addTransaction("John", incomingTransfer1);
                bank.addTransaction("John", outgoingTransfer1);

            } catch (TransactionAlreadyExistException | AccountDoesNotExistException |
                     TransactionAttributeException e) {
                throw new RuntimeException(e);
            }
*/

       controller.initialize(bank);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);


        window.setScene(scene);
        window.show();

        /*
        Menu fileMenu = new Menu("_File");
        Menu editMenu = new Menu("_Edit");
        Menu servicesMenu = new Menu("_Services");

        MenuItem newfile  = new MenuItem("New Account...");
        MenuItem removeAccount = new MenuItem("Remove Account...");
        MenuItem save  = new MenuItem("Save");
        MenuItem exit = new MenuItem("Exit");

        newfile.setOnAction((ActionEvent e) -> {});
        removeAccount.setOnAction((ActionEvent e) -> {});
        save.setOnAction((ActionEvent e) -> {});
        exit.setOnAction((ActionEvent e) -> {});

        fileMenu.getItems().addAll(newfile, removeAccount, save, exit);

        MenuItem addTransaction = new MenuItem("Add Transaction...");
        MenuItem removeTransaction = new MenuItem("Remove Transaction...");

        addTransaction.setOnAction((ActionEvent e) -> {});
        removeTransaction.setOnAction((ActionEvent e) -> {});

        editMenu.getItems().addAll(addTransaction, removeTransaction);

        MenuItem containsTransaction = new MenuItem("Contains Transaction...");
        MenuItem getBalance = new MenuItem("Get Account Balance...");
        MenuItem getTransactions = new MenuItem("Get Transactions...");
        MenuItem sortTransactions = new MenuItem("Sort Transactions...");
        MenuItem getTransactionsByType = new MenuItem("Get Transactions by Type...");

        containsTransaction.setOnAction((ActionEvent e) -> {});
        getBalance.setOnAction((ActionEvent e) -> {});
        getTransactions.setOnAction((ActionEvent e) -> {});
        sortTransactions.setOnAction((ActionEvent e) -> {});
        getTransactionsByType.setOnAction((ActionEvent e) -> {});

        servicesMenu.getItems().addAll(containsTransaction, getBalance, getTransactions, sortTransactions, getTransactionsByType);


        //context menu
        ContextMenu contextMenu = new ContextMenu();
        MenuItem auswahl = new MenuItem("Auswählen");
        MenuItem loeschen = new MenuItem("Löschen");

        auswahl.setOnAction((ActionEvent e) -> {});
        loeschen.setOnAction((ActionEvent e) -> {});

        contextMenu.getItems().addAll(auswahl, loeschen);

        // Call your items with :
        // item.setContextMenu(contextMenu);

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu, editMenu, servicesMenu);

        BorderPane layout = new BorderPane();
        layout.setTop(menuBar);

        Scene scene = new Scene(layout, 600, 400);
        window.setScene(scene);
        window.show();

         */

        //first button
        /*
        primaryStage.setTitle("Test Title");
        button = new Button("click me");

        button.setOnAction(_ -> System.out.println(button.getText()));

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
*/
        //switching scenes
        /*
        window = primaryStage;
        Label label = new Label("Willkommen zum Test");
        button1 = new Button("go to scene 2");
        button1.setOnAction(_->window.setScene(scene2));
        button2 = new Button("go to scene 1");
        button2.setOnAction(_->window.setScene(scene1));

        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label, button1);
        scene1 = new Scene(layout1, 200, 200);

        StackPane layout2 = new StackPane();
        layout2.getChildren().addAll(button2);
        scene2 = new Scene(layout2, 600, 300);

        window.setScene(scene1);
        window.setTitle("Here we are");
        window.show();
        */

    }
}
