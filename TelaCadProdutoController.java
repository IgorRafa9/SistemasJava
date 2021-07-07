
package main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class TelaCadProdutoController implements Initializable {

    @FXML
    private Label lblCadProduto;
    @FXML
    private Button bt_salvar;
    @FXML
    private Button bt_Cancelar;
    @FXML
    private TextField txtDescricao;
    @FXML
    private TextField txtCode;
    @FXML
    private TextField txtTipo;
    @FXML
    private DatePicker dtDatas;
    @FXML
    private TextField txtQuantidade;
    @FXML
    private TextField txtValor;
    @FXML
    private TextField txtMarcProd;
    @FXML
    private TextField txtUdMedida;
    @FXML
    private ComboBox<String> cbUnidades;
    @FXML
    private TextArea txtObs;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String[] unidades = {"mm", "cm", "m"};
        cbUnidades.getItems().addAll(unidades);
    }    



    @FXML
    private void definirDescricao(ActionEvent event) {
    }

    @FXML
    private void salvarProduto(ActionEvent event) {
        
        String dataCadastro = dtDatas.getValue().toString();
        String medida = cbUnidades.getValue();
        System.out.println("Descrição: " + txtDescricao.getText());
        System.out.println("Tipo:" + txtTipo.getText());
        System.out.println("Quantidade: " + txtQuantidade.getText());
        System.out.println("Preço: " + txtValor.getText());
        System.out.println("Marca do Produto: " + txtMarcProd.getText());
        System.out.println("Unidade de Medida: " + txtUdMedida.getText() + medida);
        System.out.println("Data: " + dataCadastro);
        System.out.println("Observações: " + txtObs.getText());
        System.out.println("Cadastrado com Sucesso!!!");
            
        }

    @FXML
    private void cancelarCadastro(ActionEvent event) {
        txtDescricao.setText("");
        txtTipo.setText("");
        txtQuantidade.setText("");
        txtValor.setText("");
        txtMarcProd.setText("");
        txtUdMedida.setText("");
        dtDatas.setValue(null);
        txtObs.setText("");
        
        
        System.out.println("Cancelado com Sucesso!");
        
    }

    @FXML
    private void datePickerCadastro(ActionEvent event) {
    }
    
}
