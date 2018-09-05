package sc;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import static javafx.scene.chart.PieChartBuilder.create;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class FXMLDocumentController implements Initializable {
    
   
    @FXML
    private TextArea ta1;
    @FXML
    private TextArea ta2;
    @FXML 
    private Button openFile;
    @FXML 
    private Button calc;
    @FXML 
    private PieChart pieChart;
    
 //   private ObservableList <PieChart.Data>list;
    @FXML 
    private Button getChart;
    @FXML 
    private void handleActionEvent(ActionEvent event) {
        ta1.setText("You clicked me!");
    };
   
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         ObservableList<PieChart.Data> list =
                FXCollections.observableArrayList(
                new PieChart.Data("Grapefruit", 13),
                new PieChart.Data("Oranges", 25),
                new PieChart.Data("Plums", 10),
                new PieChart.Data("Pears", 22),
                new PieChart.Data("Apples", 30));
        pieChart.setData(list);
    }    
    
}
