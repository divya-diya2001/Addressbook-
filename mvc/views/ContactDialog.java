/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.views;
//import javax.swing.JOptionPane;
// vo object class
import mvc.models.Person;

// for GUI
import java.awt.BorderLayout;
import java.awt.GridLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import javax.swing.JButton;
//import javax.swing.JComponent;
import javax.swing.JFrame;
//import javax.swing.JOptionPane;
import javax.swing.JPanel;
import mvc.controller.AddressBookController;

/**
 *
 * @author Admin
 */
public class ContactDialog {//implements ActionListener{
    private JFrame frame;
    private DetailViewPanel detailsPanel;
    final private JButton submitButton;
    private JButton cancelButton;
    private JButton searchButton;
    private JButton yesButton;
    private JButton noButtton;
    private JPanel panel_btn;
   private Person  person;
   private AddressBookController controller;
    private JButton noButton;
    
    
    public ContactDialog(String name){
        frame = new JFrame(name);
        frame.getContentPane().setLayout(new BorderLayout());
        //frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
         frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
      // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(350, 250);
       frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        detailsPanel = new DetailViewPanel();
        frame.getContentPane().add(detailsPanel,BorderLayout.CENTER);
        
        panel_btn= new JPanel();
        panel_btn.setLayout(new GridLayout(1, 2));
        
        submitButton = new JButton("Submit");
        panel_btn.add(submitButton);
        
        cancelButton = new JButton("Cancel");
        panel_btn.add(cancelButton);
        
        yesButton = new JButton("Yes");
        panel_btn.add(yesButton);
        
        JButton noButton = new JButton("No");
        panel_btn.add(noButton);
        
        frame.getContentPane().add(panel_btn,BorderLayout.SOUTH);
        
        
    }
    
   
    
    public JButton getSubmitButton()
            {
                return submitButton;
            }
    
    
     public JButton getcancelButton()
            {
                return cancelButton;
            }
     public JButton getyesButton()
            {
                return yesButton;
            }
     public JButton getnoButton()
            {
        
                return noButton;
         
            }
    public JFrame getFrame()
    {
        return frame;
    }
   
    /**
     *
     * @return
     */
    public DetailViewPanel getPanel()
    {
    //detailsPanel.getNameField();
        return detailsPanel;
    }
 
    
    public void getValues()
    {
        System.out.println("name from getValues"+detailsPanel.getNameField().getText());
    }
    public Person getPerson()
    {
        return person;
    }

    public Object getNoButton() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getYesButton() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
   

}