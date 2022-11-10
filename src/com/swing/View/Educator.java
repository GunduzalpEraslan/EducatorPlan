package com.swing.View;

import com.swing.Helper.Config;
import com.swing.Helper.Helper;

import javax.swing.*;

public class EducatorGUI extends JFrame{

    private JPanel wrapper;

    public EducatorGUI(){
        add(wrapper);
        setSize(400,500);
        setLocation(Helper.screenCenterPoint("x",getSize()),Helper.screenCenterPoint("y",getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);
    }
}