import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public class MidotMIDlet extends MIDlet implements CommandListener {
    
    MidotValues mv = new MidotValues();
    
    private boolean midletPaused = false;

//<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private Command exitCommand;
    private Command itemCommand;
    private Form form;
    private ChoiceGroup choiceGroup;
    private TextField textField;
    private StringItem stringItem;
    private Alert alert;
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
switchDisplayable(null, getForm());//GEN-LINE:|3-startMIDlet|1|3-postAction
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
if (displayable == form) {//GEN-BEGIN:|7-commandAction|1|19-preAction
            if (command == exitCommand) {//GEN-END:|7-commandAction|1|19-preAction
                // write pre-action user code here
exitMIDlet();//GEN-LINE:|7-commandAction|2|19-postAction
                // write post-action user code here
} else if (command == itemCommand) {//GEN-LINE:|7-commandAction|3|32-preAction
                // write pre-action user code here
switchDisplayable(getAlert(), getForm());//GEN-LINE:|7-commandAction|4|32-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|5|7-postCommandAction
        }//GEN-END:|7-commandAction|5|7-postCommandAction
        // write post-action user code here
}//GEN-BEGIN:|7-commandAction|6|
//</editor-fold>//GEN-END:|7-commandAction|6|

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
form = new Form("\u05DE\u05D9\u05D3\u05D5\u05EA", new Item[]{getChoiceGroup(), getTextField(), getStringItem()});//GEN-BEGIN:|14-getter|1|14-postInit
            form.addCommand(getExitCommand());
            form.addCommand(getItemCommand());
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

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemCommand ">//GEN-BEGIN:|31-getter|0|31-preInit
    /**
     * Returns an initialized instance of itemCommand component.
     *
     * @return the initialized component instance
     */
    public Command getItemCommand() {
        if (itemCommand == null) {
//GEN-END:|31-getter|0|31-preInit
 // write pre-init user code here
itemCommand = new Command("\u05D0\u05D5\u05D3\u05D5\u05EA...", Command.ITEM, 0);//GEN-LINE:|31-getter|1|31-postInit
 // write post-init user code here
}//GEN-BEGIN:|31-getter|2|
        return itemCommand;
    }
//</editor-fold>//GEN-END:|31-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: alert ">//GEN-BEGIN:|33-getter|0|33-preInit
    /**
     * Returns an initialized instance of alert component.
     *
     * @return the initialized component instance
     */
    public Alert getAlert() {
        if (alert == null) {
//GEN-END:|33-getter|0|33-preInit
 // write pre-init user code here
alert = new Alert("\u05D0\u05D5\u05D3\u05D5\u05EA", "\u05DE\u05D9\u05D3\u05D5\u05EA\n\u05DB\u05DC \u05D4\u05D6\u05DB\u05D5\u05D9\u05D5\u05EA \u05E9\u05DE\u05D5\u05E8\u05D5\u05EA \u00A9 \u05DC\u05D9\u05D4\u05D5\u05E0\u05EA\u05DF \u05D0\u05DC\u05D1\u05E8\u05D8 \u05D5\u05D7\u05D1\u05E8\u05D5\u05DF \u05D5\u05E1\u05E8\u05D8\u05D9\u05DC", null, null);//GEN-BEGIN:|33-getter|1|33-postInit
            alert.setTimeout(Alert.FOREVER);//GEN-END:|33-getter|1|33-postInit
 // write post-init user code here
}//GEN-BEGIN:|33-getter|2|
        return alert;
    }
//</editor-fold>//GEN-END:|33-getter|2|

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
