package GoldenCage.dao;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import GoldenCage.util.MyConnection;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

/**
 *
 * @salma
 */
public class GenererPDF {
    public boolean Client(String nom) {
        // - Paramètres de connexion à la base de données
        
        Connection connection;
        try {
            // - Connexion à la base
            connection=MyConnection.getInstance();
            // - Chargement et compilation du rapport
            System.out.println("oci");
            JasperDesign jasperDesign = JRXmlLoader.load("F:\\3A14\\Semestre 2\\PI DEV\\client.jrxml");
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            // - Paramètres à envoyer au rapport
            Map  parameters = new HashMap();
            parameters.put("Titre", "Titre");
            // - Execution du rapport
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, connection);
            // - Création du rapport au format PDF
            JasperExportManager.exportReportToPdfFile(jasperPrint, "F:\\3A14\\Semestre 2\\PI DEV\\"+nom+".pdf");
            System.out.println("Succes");
            return true;
        }

        catch (JRException e) {
            System.out.println("erreur de compilation"+ e.getMessage());
            return false;
         } 
    }
    public boolean Prestataire(String nom) {
        // - Paramètres de connexion à la base de données
        
        Connection connection;
        try {
            // - Connexion à la base
            connection=MyConnection.getInstance();
            // - Chargement et compilation du rapport
            System.out.println("oci");
            JasperDesign jasperDesign = JRXmlLoader.load("F:\\3A14\\Semestre 2\\PI DEV\\prestataire.jrxml");
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            // - Paramètres à envoyer au rapport
            Map  parameters = new HashMap();
            parameters.put("Titre", "Titre");
            // - Execution du rapport
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, connection);
            // - Création du rapport au format PDF
            JasperExportManager.exportReportToPdfFile(jasperPrint, "F:\\3A14\\Semestre 2\\PI DEV\\"+nom+".pdf");
            System.out.println("Succes");
            return true;
        }

        catch (JRException e) {
            System.out.println("erreur de compilation"+ e.getMessage());
            return false;
         } 
}

}
/**/