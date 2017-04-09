
package gestionprofesores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TextArea areaAñadidos;
    @FXML
    private TextArea areaDepartamento;
    @FXML
    private TextArea areaEdad;
    @FXML
    private TextField textNIF;
    @FXML
    private TextField textNombre;
    @FXML
    private TextField textDepart;
    @FXML
    private TextField textEdad;
    @FXML
    private TextField textBuscarDepart;
    @FXML
    private TextField textBuscarEdad;
    @FXML
    private Button botonGuardar;
    @FXML
    private Button botonDepartamento;
    @FXML
    private Button botonEdad;
    @FXML
    private Button botonAñadir;
    
 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void guardarArchivo(ActionEvent event) {
    }

    @FXML
    private void buscarPorDepartamento(ActionEvent event) {
    }

    @FXML
    private void buscarPorEdad(ActionEvent event) {
    }

    @FXML
    private void añadirProfesor(ActionEvent event) {
    }
    
}
