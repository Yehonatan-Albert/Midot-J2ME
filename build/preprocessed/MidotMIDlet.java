import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public class MidotMIDlet extends MIDlet implements CommandListener {
    
    MidotValues mv = new MidotValues();
    
    private boolean midletPaused = false;

//<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private Command exitCommand;
    private Command backCommand;
    private Form form;
    private ChoiceGroup choiceGroup;
    private TextField textField;
    private StringItem stringItem;
    private List list;
    private Form form1;
    private ChoiceGroup choiceGroup1;
    private TextField textField1;
    private StringItem stringItem1;
    private Form form2;
    private ImageItem imageItem;
    private StringItem stringItem2;
    private StringItem stringItem3;
    private Image image1;
//</editor-fold>//GEN-END:|fields|0|

    public MidotMIDlet() {
    }

//<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
//</editor-fold>//GEN-END:|methods|0|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initializes the application. It is called only once when the MIDlet is
     * started. The method is called before the <code>startMIDlet</code> method.
     */
    private void initialize() {
//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
}//GEN-BEGIN:|0-initialize|2|
//</editor-fold>//GEN-END:|0-initialize|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {
//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
switchDisplayable(null, getList());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
}//GEN-BEGIN:|3-startMIDlet|2|
//</editor-fold>//GEN-END:|3-startMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {
//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
}//GEN-BEGIN:|4-resumeMIDlet|2|
//</editor-fold>//GEN-END:|4-resumeMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The <code>display</code>
     * instance is taken from <code>getDisplay</code> method. This method is
     * used by all actions in the design for switching displayable.
     *
     * @param alert the Alert which is temporarily set to the display; if
     * <code>null</code>, then <code>nextDisplayable</code> is set immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {
//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
}//GEN-BEGIN:|5-switchDisplayable|2|
//</editor-fold>//GEN-END:|5-switchDisplayable|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a
     * particular displayable.
     *
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {
//GEN-END:|7-commandAction|0|7-preCommandAction
        // write pre-action user code here
if (displayable == form) {//GEN-BEGIN:|7-commandAction|1|46-preAction
            if (command == backCommand) {//GEN-END:|7-commandAction|1|46-preAction
                // write pre-action user code here
switchDisplayable(null, getList());//GEN-LINE:|7-commandAction|2|46-postAction
                // write post-action user code here
}//GEN-BEGIN:|7-commandAction|3|51-preAction
} else if (displayable == form1) {
    if (command == backCommand) {//GEN-END:|7-commandAction|3|51-preAction
        // write pre-action user code here
switchDisplayable(null, getList());//GEN-LINE:|7-commandAction|4|51-postAction
        // write post-action user code here
}//GEN-BEGIN:|7-commandAction|5|64-preAction
} else if (displayable == form2) {
    if (command == backCommand) {//GEN-END:|7-commandAction|5|64-preAction
        // write pre-action user code here
switchDisplayable(null, getList());//GEN-LINE:|7-commandAction|6|64-postAction
        // write post-action user code here
}//GEN-BEGIN:|7-commandAction|7|37-preAction
} else if (displayable == list) {
    if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|7|37-preAction
        // write pre-action user code here
listAction();//GEN-LINE:|7-commandAction|8|37-postAction
 // write post-action user code here
} else if (command == exitCommand) {//GEN-LINE:|7-commandAction|9|44-preAction
 // write pre-action user code here
exitMIDlet();//GEN-LINE:|7-commandAction|10|44-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|11|7-postCommandAction
        }//GEN-END:|7-commandAction|11|7-postCommandAction
        // write post-action user code here
}//GEN-BEGIN:|7-commandAction|12|
//</editor-fold>//GEN-END:|7-commandAction|12|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|18-getter|0|18-preInit
    /**
     * Returns an initialized instance of exitCommand component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand() {
        if (exitCommand == null) {
//GEN-END:|18-getter|0|18-preInit
            // write pre-init user code here
exitCommand = new Command("\u05D9\u05E6\u05D9\u05D0\u05D4", Command.EXIT, 0);//GEN-LINE:|18-getter|1|18-postInit
            // write post-init user code here
}//GEN-BEGIN:|18-getter|2|
        return exitCommand;
    }
//</editor-fold>//GEN-END:|18-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: form ">//GEN-BEGIN:|14-getter|0|14-preInit
    /**
     * Returns an initialized instance of form component.
     *
     * @return the initialized component instance
     */
    public Form getForm() {
        if (form == null) {
//GEN-END:|14-getter|0|14-preInit
            // write pre-init user code here
form = new Form("\u05DE\u05D9\u05D3\u05D5\u05EA - \u05E0\u05E4\u05D7", new Item[]{getChoiceGroup(), getTextField(), getStringItem()});//GEN-BEGIN:|14-getter|1|14-postInit
            form.addCommand(getBackCommand());
            form.setCommandListener(this);//GEN-END:|14-getter|1|14-postInit
form.setItemStateListener(new ItemStateListener() {
    int[] values = { mv.beytza, mv.log, mv.kav, mv.sea, mv.eyfa, mv.kor };
    String[] names = { "ביצה", "לוג", "קב", "סאה", "איפה", "כור" };

    public void itemStateChanged(Item item) {
        stringItem.setText("");
        for (int i = 0; i < 6; i++)
        {
            if (i == choiceGroup.getSelectedIndex()) continue;
            try {
                stringItem.setText(stringItem.getText() + names[i] + ": " + Double.toString(values[choiceGroup.getSelectedIndex()] * Double.parseDouble(textField.getString()) / values[i]) + "\n");
            }
            catch (Exception ex) {}
        }
    }
});
        }//GEN-BEGIN:|14-getter|2|
        return form;
    }
//</editor-fold>//GEN-END:|14-getter|2|



//<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup ">//GEN-BEGIN:|22-getter|0|22-preInit
    /**
     * Returns an initialized instance of choiceGroup component.
     *
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup() {
        if (choiceGroup == null) {
//GEN-END:|22-getter|0|22-preInit
 // write pre-init user code here
choiceGroup = new ChoiceGroup("\u05DE\u05D9\u05D3\u05D4", Choice.POPUP);//GEN-BEGIN:|22-getter|1|22-postInit
            choiceGroup.append("\u05D1\u05D9\u05E6\u05D4", null);
            choiceGroup.append("\u05DC\u05D5\u05D2", null);
            choiceGroup.append("\u05E7\u05D1", null);
            choiceGroup.append("\u05E1\u05D0\u05D4", null);
            choiceGroup.append("\u05D0\u05D9\u05E4\u05D4", null);
            choiceGroup.append("\u05DB\u05D5\u05E8", null);
            choiceGroup.setSelectedFlags(new boolean[]{false, false, false, false, false, false});//GEN-END:|22-getter|1|22-postInit
 // write post-init user code here
}//GEN-BEGIN:|22-getter|2|
        return choiceGroup;
    }
//</editor-fold>//GEN-END:|22-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField ">//GEN-BEGIN:|29-getter|0|29-preInit
    /**
     * Returns an initialized instance of textField component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField() {
        if (textField == null) {
//GEN-END:|29-getter|0|29-preInit
 // write pre-init user code here
textField = new TextField("\u05DB\u05DE\u05D5\u05EA", null, 15, TextField.DECIMAL);//GEN-LINE:|29-getter|1|29-postInit
 // write post-init user code here
}//GEN-BEGIN:|29-getter|2|
        return textField;
    }
//</editor-fold>//GEN-END:|29-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem ">//GEN-BEGIN:|30-getter|0|30-preInit
    /**
     * Returns an initialized instance of stringItem component.
     *
     * @return the initialized component instance
     */
    public StringItem getStringItem() {
        if (stringItem == null) {
//GEN-END:|30-getter|0|30-preInit
 // write pre-init user code here
stringItem = new StringItem(null, null);//GEN-LINE:|30-getter|1|30-postInit
 // write post-init user code here
}//GEN-BEGIN:|30-getter|2|
        return stringItem;
    }
//</editor-fold>//GEN-END:|30-getter|2|



//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand ">//GEN-BEGIN:|45-getter|0|45-preInit
    /**
     * Returns an initialized instance of backCommand component.
     *
     * @return the initialized component instance
     */
    public Command getBackCommand() {
        if (backCommand == null) {
//GEN-END:|45-getter|0|45-preInit
 // write pre-init user code here
backCommand = new Command("\u05D7\u05D6\u05E8\u05D4", Command.BACK, 0);//GEN-LINE:|45-getter|1|45-postInit
 // write post-init user code here
}//GEN-BEGIN:|45-getter|2|
        return backCommand;
    }
//</editor-fold>//GEN-END:|45-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: list ">//GEN-BEGIN:|35-getter|0|35-preInit
    /**
     * Returns an initialized instance of list component.
     *
     * @return the initialized component instance
     */
    public List getList() {
        if (list == null) {
//GEN-END:|35-getter|0|35-preInit
 // write pre-init user code here
list = new List("\u05DE\u05D9\u05D3\u05D5\u05EA", Choice.IMPLICIT);//GEN-BEGIN:|35-getter|1|35-postInit
            list.append("\u05E0\u05E4\u05D7", null);
            list.append("\u05DE\u05D8\u05D1\u05E2", null);
            list.append("\u05D0\u05D5\u05D3\u05D5\u05EA...", null);
            list.addCommand(getExitCommand());
            list.setCommandListener(this);
            list.setSelectedFlags(new boolean[]{false, false, false});//GEN-END:|35-getter|1|35-postInit
 // write post-init user code here
}//GEN-BEGIN:|35-getter|2|
        return list;
    }
//</editor-fold>//GEN-END:|35-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: listAction ">//GEN-BEGIN:|35-action|0|35-preAction
    /**
     * Performs an action assigned to the selected list element in the list
     * component.
     */
    public void listAction() {
//GEN-END:|35-action|0|35-preAction
 // enter pre-action user code here
String __selectedString = getList().getString(getList().getSelectedIndex());//GEN-BEGIN:|35-action|1|39-preAction
        if (__selectedString != null) {
            if (__selectedString.equals("\u05E0\u05E4\u05D7")) {//GEN-END:|35-action|1|39-preAction
 // write pre-action user code here
switchDisplayable(null, getForm());//GEN-LINE:|35-action|2|39-postAction
 // write post-action user code here
} else if (__selectedString.equals("\u05DE\u05D8\u05D1\u05E2")) {//GEN-LINE:|35-action|3|40-preAction
 // write pre-action user code here
switchDisplayable(null, getForm1());//GEN-LINE:|35-action|4|40-postAction
 // write post-action user code here
} else if (__selectedString.equals("\u05D0\u05D5\u05D3\u05D5\u05EA...")) {//GEN-LINE:|35-action|5|41-preAction
 // write pre-action user code here
switchDisplayable(null, getForm2());//GEN-LINE:|35-action|6|41-postAction
 // write post-action user code here
}//GEN-BEGIN:|35-action|7|35-postAction
        }//GEN-END:|35-action|7|35-postAction
 // enter post-action user code here
}//GEN-BEGIN:|35-action|8|
//</editor-fold>//GEN-END:|35-action|8|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: form1 ">//GEN-BEGIN:|49-getter|0|49-preInit
    /**
     * Returns an initialized instance of form1 component.
     *
     * @return the initialized component instance
     */
    public Form getForm1() {
        if (form1 == null) {
//GEN-END:|49-getter|0|49-preInit
 // write pre-init user code here
form1 = new Form("\u05DE\u05D9\u05D3\u05D5\u05EA - \u05DE\u05D8\u05D1\u05E2", new Item[]{getChoiceGroup1(), getTextField1(), getStringItem1()});//GEN-BEGIN:|49-getter|1|49-postInit
            form1.addCommand(getBackCommand());
            form1.setCommandListener(this);//GEN-END:|49-getter|1|49-postInit
form1.setItemStateListener(new ItemStateListener() {
    int[] values = { mv.pruta, mv.isar, mv.pundyon, mv.maa, mv.dinar, mv.sela };
    String[] names = { "פרוטה", "איסר", "פונדיון", "מעה", "דינר", "סלע" };

    public void itemStateChanged(Item item) {
        stringItem1.setText("");
        for (int i = 0; i < 6; i++)
        {
            if (i == choiceGroup1.getSelectedIndex()) continue;
            try {
                stringItem1.setText(stringItem1.getText() + names[i] + ": " + Double.toString(values[choiceGroup1.getSelectedIndex()] * Double.parseDouble(textField1.getString()) / values[i]) + "\n");
            }
            catch (Exception ex) {}
        }
    }
});
        }//GEN-BEGIN:|49-getter|2|
        return form1;
    }
//</editor-fold>//GEN-END:|49-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup1 ">//GEN-BEGIN:|53-getter|0|53-preInit
    /**
     * Returns an initialized instance of choiceGroup1 component.
     *
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup1() {
        if (choiceGroup1 == null) {
//GEN-END:|53-getter|0|53-preInit
 // write pre-init user code here
choiceGroup1 = new ChoiceGroup("\u05E1\u05D5\u05D2 \u05DE\u05D8\u05D1\u05E2", Choice.POPUP);//GEN-BEGIN:|53-getter|1|53-postInit
            choiceGroup1.append("\u05E4\u05E8\u05D5\u05D8\u05D4", null);
            choiceGroup1.append("\u05D0\u05D9\u05E1\u05E8", null);
            choiceGroup1.append("\u05E4\u05D5\u05E0\u05D3\u05D9\u05D5\u05DF", null);
            choiceGroup1.append("\u05DE\u05E2\u05D4", null);
            choiceGroup1.append("\u05D3\u05D9\u05E0\u05E8", null);
            choiceGroup1.append("\u05E1\u05DC\u05E2", null);
            choiceGroup1.setSelectedFlags(new boolean[]{false, false, false, false, false, false});//GEN-END:|53-getter|1|53-postInit
 // write post-init user code here
}//GEN-BEGIN:|53-getter|2|
        return choiceGroup1;
    }
//</editor-fold>//GEN-END:|53-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField1 ">//GEN-BEGIN:|60-getter|0|60-preInit
    /**
     * Returns an initialized instance of textField1 component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField1() {
        if (textField1 == null) {
//GEN-END:|60-getter|0|60-preInit
 // write pre-init user code here
textField1 = new TextField("\u05DB\u05DE\u05D5\u05EA", null, 32, TextField.DECIMAL);//GEN-LINE:|60-getter|1|60-postInit
 // write post-init user code here
}//GEN-BEGIN:|60-getter|2|
        return textField1;
    }
//</editor-fold>//GEN-END:|60-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem1 ">//GEN-BEGIN:|61-getter|0|61-preInit
    /**
     * Returns an initialized instance of stringItem1 component.
     *
     * @return the initialized component instance
     */
    public StringItem getStringItem1() {
        if (stringItem1 == null) {
//GEN-END:|61-getter|0|61-preInit
 // write pre-init user code here
stringItem1 = new StringItem(null, null);//GEN-LINE:|61-getter|1|61-postInit
 // write post-init user code here
}//GEN-BEGIN:|61-getter|2|
        return stringItem1;
    }
//</editor-fold>//GEN-END:|61-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: form2 ">//GEN-BEGIN:|62-getter|0|62-preInit
    /**
     * Returns an initialized instance of form2 component.
     *
     * @return the initialized component instance
     */
    public Form getForm2() {
        if (form2 == null) {
//GEN-END:|62-getter|0|62-preInit
 // write pre-init user code here
form2 = new Form("\u05D0\u05D5\u05D3\u05D5\u05EA", new Item[]{getStringItem2(), getImageItem(), getStringItem3()});//GEN-BEGIN:|62-getter|1|62-postInit
            form2.addCommand(getBackCommand());
            form2.setCommandListener(this);//GEN-END:|62-getter|1|62-postInit
 // write post-init user code here
}//GEN-BEGIN:|62-getter|2|
        return form2;
    }
//</editor-fold>//GEN-END:|62-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: imageItem ">//GEN-BEGIN:|66-getter|0|66-preInit
    /**
     * Returns an initialized instance of imageItem component.
     *
     * @return the initialized component instance
     */
    public ImageItem getImageItem() {
        if (imageItem == null) {
//GEN-END:|66-getter|0|66-preInit
 // write pre-init user code here
imageItem = new ImageItem(null, getImage1(), ImageItem.LAYOUT_CENTER | ImageItem.LAYOUT_NEWLINE_BEFORE | ImageItem.LAYOUT_NEWLINE_AFTER, "<Missing Image>");//GEN-LINE:|66-getter|1|66-postInit
 // write post-init user code here
}//GEN-BEGIN:|66-getter|2|
        return imageItem;
    }
//</editor-fold>//GEN-END:|66-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem2 ">//GEN-BEGIN:|68-getter|0|68-preInit
    /**
     * Returns an initialized instance of stringItem2 component.
     *
     * @return the initialized component instance
     */
    public StringItem getStringItem2() {
        if (stringItem2 == null) {
//GEN-END:|68-getter|0|68-preInit
 // write pre-init user code here
stringItem2 = new StringItem(null, "\u05DE\u05D9\u05D3\u05D5\u05EA", Item.PLAIN);//GEN-BEGIN:|68-getter|1|68-postInit
            stringItem2.setLayout(ImageItem.LAYOUT_CENTER);//GEN-END:|68-getter|1|68-postInit
 // write post-init user code here
}//GEN-BEGIN:|68-getter|2|
        return stringItem2;
    }
//</editor-fold>//GEN-END:|68-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem3 ">//GEN-BEGIN:|70-getter|0|70-preInit
    /**
     * Returns an initialized instance of stringItem3 component.
     *
     * @return the initialized component instance
     */
    public StringItem getStringItem3() {
        if (stringItem3 == null) {
//GEN-END:|70-getter|0|70-preInit
 // write pre-init user code here
stringItem3 = new StringItem(null, "\u00A9 \u05DB\u05DC \u05D4\u05D6\u05DB\u05D5\u05D9\u05D5\u05EA \u05E9\u05DE\u05D5\u05E8\u05D5\u05EA \u05DC\u05D9\u05D4\u05D5\u05E0\u05EA\u05DF \u05D0\u05DC\u05D1\u05E8\u05D8 \u05D5\u05D7\u05D1\u05E8\u05D5\u05DF \u05D5\u05E1\u05E8\u05D8\u05D9\u05DC\n\u05D4\u05EA\u05E9\u05E4\"\u05D1");//GEN-LINE:|70-getter|1|70-postInit
 // write post-init user code here
}//GEN-BEGIN:|70-getter|2|
        return stringItem3;
    }
//</editor-fold>//GEN-END:|70-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: image1 ">//GEN-BEGIN:|67-getter|0|67-preInit
    /**
     * Returns an initialized instance of image1 component.
     *
     * @return the initialized component instance
     */
    public Image getImage1() {
        if (image1 == null) {
//GEN-END:|67-getter|0|67-preInit
 // write pre-init user code here
try {//GEN-BEGIN:|67-getter|1|67-@java.io.IOException
                image1 = Image.createImage("/icon.png");
            } catch (java.io.IOException e) {//GEN-END:|67-getter|1|67-@java.io.IOException
    e.printStackTrace();
            }//GEN-LINE:|67-getter|2|67-postInit
 // write post-init user code here
}//GEN-BEGIN:|67-getter|3|
        return image1;
    }
//</editor-fold>//GEN-END:|67-getter|3|





    public Display getDisplay() {
        return Display.getDisplay(this);
    }

    public void exitMIDlet() {
        switchDisplayable(null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    public void startApp() {
        if (midletPaused) {
            resumeMIDlet();
        } else {
            initialize();
            startMIDlet();
        }
        midletPaused = false;
    }

    public void pauseApp() {
        midletPaused = true;
    }

    public void destroyApp(boolean unconditional) {
    }
    
}
