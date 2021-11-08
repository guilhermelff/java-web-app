package hello;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.beans.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;


/**
 *
 * @author viter
 */
public class MessageBean implements Serializable {
     
    private String msg;
    private String cumprimento;
    private String trat;
    private String tratamento;
    private int hour = (LocalDateTime.now().getHour() - 3);
    private int min = LocalDateTime.now().getMinute();
    
        
    public MessageBean() {
    }
    
    public String getMsg() {
        return msg;
    }
    
    public int getHour() {
        return hour;
    }
    
    public int getMin() {
        return min;
    }
    
    public String getTrat() {
        return trat;
    }
    
    public void setPropertyTrat(String value) {
        trat = value;
               
    }
    
 

    
    public void setMsg(String value) {
        switch (value){
            case "":
            case "pt":
                if (0<hour & hour<12){
                    cumprimento = "Bom dia, ";
                }
                else if (hour>=12 & hour<18){
                        cumprimento = "Boa tarde, ";
                        }
                else {
                    cumprimento = "Boa noite, ";
                }
                
                if (Objects.equals("sr", trat)){
                    tratamento = "Sr.";
                }
                else if (Objects.equals("sra", trat)){
                    tratamento = "Sra.";
                }
                else{
                    tratamento = "";
                }
                
                msg = cumprimento + tratamento;
                break;
            case "en":
                if (0<hour & hour<12){
                    cumprimento = "Good morning, ";
                }
                else if (hour>=12 & hour<18){
                        cumprimento = "Good evening, ";
                        }
                else {
                    cumprimento = "Good night, ";
                }
               if (Objects.equals("sr", trat)){
                    tratamento = "Mr.";
                }
                else if (Objects.equals("sra", trat)){
                    tratamento = "Mrs.";
                }
                else{
                    tratamento = "";
                }
                
                msg = cumprimento + tratamento;
                
                break;
            case "de":
                if (0<hour & hour<12){
                    cumprimento = "Guten Morgen, ";
                }
                else if (hour>=12 & hour<18){
                        cumprimento = "Guten Tag, ";
                        }
                else {
                    cumprimento = "Gute Nacht, ";
                }
           if (Objects.equals("sr", trat)){
                    tratamento = "Herr.";
                }
                else if (Objects.equals("sra", trat)){
                    tratamento = "Frau.";
                }
                else{
                    tratamento = "";
                }
                
                msg = cumprimento + tratamento;
                break;
            case "fr":
                if (0<hour & hour<12){
                    cumprimento = "Bonjour, ";
                }
                else if (hour>=12 & hour<18){
                        cumprimento = "Bon après-midi, ";
                        }
                else {
                    cumprimento = "bonne nuit, ";
                }
            if (Objects.equals("sr", trat)){
                    tratamento = "Monsieur.";
                }
                else if (Objects.equals("sra", trat)){
                    tratamento = "Mme.";
                }
                else{
                    tratamento = "";
                }
                
                msg = cumprimento + tratamento;
                break;
            case "es":
                if (0<hour & hour<12){
                    cumprimento = "buenos dias, ";
                }
                else if (hour>=12 & hour<18){
                        cumprimento = "buenas tardes, ";
                        }
                else {
                    cumprimento = "buenas noches, ";
                }
         if (Objects.equals("sr", trat)){
                    tratamento = "señor.";
                }
                else if (Objects.equals("sra", trat)){
                    tratamento = "señora.";
                }
                else{
                    tratamento = "";
                }
                
                msg = cumprimento + tratamento;
                break;
            case "it":
                if (0<hour & hour<12){
                    cumprimento = "buongiorno, ";
                }
                else if (hour>=12 & hour<18){
                        cumprimento = "buon pomeriggio, ";
                        }
                else {
                    cumprimento = "buona notte, ";
                }
                if (Objects.equals("sr", trat)){
                    tratamento = "Sig.";
                }
                else if (Objects.equals("sra", trat)){
                    tratamento = "Sig.ra.";
                }
                else{
                    tratamento = "";
                }
                
                msg = cumprimento + tratamento;
                break;
        }
    }
}
