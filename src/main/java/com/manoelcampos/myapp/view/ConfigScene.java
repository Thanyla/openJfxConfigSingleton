package com.manoelcampos.myapp.view;

import com.manoelcampos.myapp.App;
import com.manoelcampos.myapp.model.Config;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

/**
 * Cena (tela/view) para exibição e alteração dos parâmetros de configuração.
 * 
 * @author manoelcampos
 */
public class ConfigScene extends AbstractScene {
    private final Config config = Config.getInstance();

    public ConfigScene(App app) {
        super(app);
        
        var label1 = new Label("Formato Relatórios");
        //TODO: EXIBIR CONFIGURAÇÃO DENTRO DO CAMPO, PASSANDO NO CONSTRUTOR
        var fieldFormatoRelatorios = new TextField(config.getFormatRelatorios());

        var label2 = new Label("Tipo dos Gráficos");
        //TODO: EXIBIR CONFIGURAÇÃO DENTRO DO CAMPO, PASSANDO NO CONSTRUTOR
        var fieldTipoGraficos = new TextField(config.getTipoGraficos());

        var btnOK = new Button("OK");
        
        //Adiciona os campos na tela, organizando verticalmente (VBox)
        setRoot(new VBox(label1, fieldFormatoRelatorios, label2, fieldTipoGraficos, btnOK));
        
        /*Quando o botão for clicado, exibe a cena de Configurações.
        O código usa o recurso de Method Reference introduzido no Java 8.
        */
        btnOK.setOnAction(event -> {
            config.setFormatRelatorios(fieldFormatoRelatorios.)getText());
            config.setTipoGraficos(fieldTipoGraficos.getText());

            app.setScene(new MainScene(app));
        });
        
    }
    
}
