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
    private int hour = LocalDateTime.now().getHour();
        
    public MessageBean() {
    }
    
    public String getMsg() {
        return msg;
    }
    
    public void setMsg(String value) {
        switch (value){
            case "":
            case "pt":
                if (0<hour & hour<12){
                    msg = "Bom dia";
                }
                else if (hour>=12 & hour<18){
                        msg = "Boa tarde";
                        }
                else {
                    msg = "Boa noite";
                }
                
                break;
            case "en":
                if (0<hour & hour<12){
                    msg = "Good morning";
                }
                else if (hour>=12 & hour<18){
                        msg = "Good evening";
                        }
                else {
                    msg = "Good night";
                }
                
                
                break;
            case "de":
                if (0<hour & hour<12){
                    msg = "Guten Morgen";
                }
                else if (hour>=12 & hour<18){
                        msg = "Guten Tag";
                        }
                else {
                    msg = "Gute Nacht";
                }
                break;
            case "fr":
                if (0<hour & hour<12){
                    msg = "Bonjour";
                }
                else if (hour>=12 & hour<18){
                        msg = "Bon après-midi";
                        }
                else {
                    msg = "bonne nuit";
                }
                break;
            case "es":
                if (0<hour & hour<12){
                    msg = "buenos dias";
                }
                else if (hour>=12 & hour<18){
                        msg = "buenas tardes";
                        }
                else {
                    msg = "buenas noches";
                }
                break;
            case "it":
                if (0<hour & hour<12){
                    msg = "buongiorno";
                }
                else if (hour>=12 & hour<18){
                        msg = "buon pomeriggio";
                        }
                else {
                    msg = "buona notte";
                }
                break;
        }
    }
}
