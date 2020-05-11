package com.manoelcampos.myapp.model;

/**
 * Classe que gerencia as configurações do sistema, armazenadas no arquivo no
 * config.properties.
 * 
 * TODO: ADICIONE OS ATRIBUTOS QUE DESEJAR, GETTERS E SETTERS
 * 
 * @author manoelcampos
 */
public class Config {
    //SINGLETON
    private static final Config instance = new Config();
    
    private String formatRelatorios="html";
    private String tipoGraficos = "pizza";
    
    //CONTRUTOR PRIVADO
    private Config(){}
    
    //ACESSO A INSTANCE
    public static Config getInstance(){
        return instance;
    }
    
    //GETTERS E SETTERS
    public String getFormatRelatorios() {
        return formatRelatorios;
    }

    public void setFormatRelatorios(String formatRelatorios) {
        this.formatRelatorios = formatRelatorios;
    }

    public String getTipoGraficos() {
        return tipoGraficos;
    }

    public void setTipoGraficos(String tipoGraficos) {
        this.tipoGraficos = tipoGraficos;
    }
    
    

}
