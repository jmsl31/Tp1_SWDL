/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationclientwsdl;

/**
 *
 * @author johann.meissl
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PrevisionMeteoService service = new PrevisionMeteoService();
        
        PrevisionMeteoPortType ports = service.getPrevisionMeteoPort();
        
        String ville = ports.meteoDemain("Paris");
        Detail ville2 = ports.meteoDetaillee("Toulouse");
        
        System.out.println("Meteo de demain à Paris " +  ville);
        
        System.out.println("Meteo de demain à Toulouse " +  ville2.getResume());
        System.out.println("Temperature de demain à Toulouse " +  ville2.getTemperature());
    }
    
}
