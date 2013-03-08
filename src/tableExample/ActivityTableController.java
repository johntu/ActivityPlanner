/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tableExample;

import java.util.*;
import java.awt.event.*;

import java.util.Observer;
import java.util.Observable;

import se.kth.csc.iprog.activityplanner.model.*;

/**
 *
 * @author Álvaro
 */
public class ActivityTableController implements Observer {
    
    private int nameActivityCounter;
    
    private Model model;
    private ActivityTableView tableView;
    
    @SuppressWarnings("LeakingThisInConstructor")
    public ActivityTableController(Model activityModel, ActivityTableView activityTableView){
        
        this.nameActivityCounter = 0;
        
        this.model = activityModel;
        this.tableView = activityTableView;
        
        // Adds itself as a observer.
        model.addObserver(this);
        
        ////////////////////////////////////////////////////////////////////////
        // Listeners' assignment to the buttons.
        this.tableView.buttonNew.addActionListener(new ActionListener() {
 
            @Override
            public void actionPerformed(ActionEvent e) {
                
                // Creates a new activity by default:
                // Customer: Cust_XX        DateSpan: 1
                // EarlistStartDay: today   EarlistEndDay: one week after.
                GregorianCalendar todaysDay = new GregorianCalendar();
                GregorianCalendar nextWeekDay = new GregorianCalendar();
                nextWeekDay.add(Calendar.DATE, 7);
                
                nameActivityCounter++;
                model.addActivity("Cust_" + nameActivityCounter, 1, todaysDay, nextWeekDay);
                
                // The rows' listeners will be also updated, as the controler is
                // also a observer.
                
            }
        });
        
        this.tableView.buttonDelete.addActionListener(new ActionListener() {
 
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String customerName = (String) tableView.activityTable.getModel().
                        getValueAt(tableView.activityTable.getSelectedRow(), 0);
                
                // Search for the activity.
                Activity activityToDelete = model.searchActivity(customerName);
                
                // If found, deletes it.
                if (activityToDelete != null){
                    model.removeActivity(activityToDelete);
                }
                
                // The rows' listeners will be also updated, as the controler is
                // also a observer.
                
            }
        });
        ////////////////////////////////////////////////////////////////////////
        
        ////////////////////////////////////////////////////////////////////////
        // Listeners assignment to the table's rows and cells
       tableView.activityTable.addFocusListener(new FocusListener(){

            @Override
            public void focusGained(FocusEvent e) {
                
            }

            @Override
            public void focusLost(FocusEvent e) {
                tableView.activityTable.getSelectionModel()
                        .setSelectionInterval(tableView.activityTable.getSelectedRow(), 
                                              tableView.activityTable.getSelectedRow());
            }
           
       });
       /////////////////////////////////////////////////////////////////////////
        
    }
    
    @Override
    public void update(Observable o, Object arg) {
        
        // We add the listeners to the cells. Since the view has been registeres
        // first as an observer, we're sure that we have all the cells.
        
    }
    
}