package sample;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import socket.SocketClient;

import static java.io.FileDescriptor.out;

import java.net.Socket;




public class Controller implements Initializable {

    @FXML
    private Button login;
    @FXML
    private PasswordField pwdtext;
    @FXML
    private TextField lt;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void loginin (ActionEvent event) throws IOException {
//        System.out.println(1);

        //鼠标点击后的事件:发送数据到socket
//        实例化socket，执行send方法

        SocketClient s = new SocketClient();
        String str ="Signin|" + lt.getText() + "|" + pwdtext.getText();
        s.send(str);
//


    }
}







