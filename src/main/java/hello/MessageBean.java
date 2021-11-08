package hello;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.beans.*;
import java.io.Serializable;
import java.time.LocalDateTime;


/**
 *
 * @author viter
 */
public class MessageBean implements Serializable {
     
    private String msg;
    private String cumprimento;
    private int hour = (LocalDateTime.now().getHour() - 3);
    private int min = LocalDateTime.now().getMinute();
    private String trat;
        
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
    
    public void setTrat(String value){
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
                if ("sr".equals(trat)){
                    trat = "Sr.";
                }
                else if ("sra".equals(trat)){
                    trat = "Sra.";
                }
                else{
                    trat = "";
                }
                msg = cumprimento + trat;
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
                if ("sr".equals(trat)){
                    trat = "Mr.";
                }
                else if ("sra".equals(trat)){
                    trat = "Mrs.";
                }
                else{
                    trat = "";
                }
                msg = cumprimento + trat;
                
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
                if ("sr".equals(trat)){
                    trat = "Herr.";
                }
                else if ("sra".equals(trat)){
                    trat = "Frau.";
                }
                else{
                    trat = "";
                }
                msg = cumprimento + trat;
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
                if ("sr".equals(trat)){
                    trat = "Monsieur.";
                }
                else if ("sra".equals(trat)){
                    trat = "Mme.";
                }
                else{
                    trat = "";
                }
                msg = cumprimento + trat;
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
                if ("sr".equals(trat)){
                    trat = "Señor.";
                }
                else if ("sra".equals(trat)){
                    trat = "Señora.";
                }
                else{
                    trat = "";
                }
                msg = cumprimento + trat;
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
                if ("sr".equals(trat)){
                    trat = "Sig.";
                }
                else if ("sra".equals(trat)){
                    trat = "Sig.ra.";
                }
                else{
                    trat = "";
                }
                msg = cumprimento + trat;
                break;
        }
    }
}
