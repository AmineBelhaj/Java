/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GoldenCage.Presentation;

import GoldenCage.util.MyConnection;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.ScrollPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.LayoutStyle.ComponentPlacement;

/**
 *
 * @author lenovo_B
 */
public class ListePrestataire extends javax.swing.JPanel {

    /**
     * Creates new form ListePrestataire
     */
     int i=0,j=0;

    public void addPanelPrestataire(String nomPrestataire,String Adresse,String Présentation,int Tel,int Fax,String Mail,String Web){
                JPanel panel = new JPanel();
                List<JPanel> listPanel=new ArrayList();
                listPanel.add(panel);
                
                JLabel lblPrestataire = new JLabel(nomPrestataire);
		JLabel lblPhoto = new JLabel("Photo");
      		JLabel lblPrsentation = new JLabel("Pr\u00E9sentation");
		JLabel lblAdresse = new JLabel("Adresse :");
		JLabel lblPrsentation_1 = new JLabel("Pr\u00E9sentation :");
		JLabel lblTlephone = new JLabel("T\u00E9lephone :");
		JLabel lblFax = new JLabel("Fax :");
		JLabel lblAdresseMail = new JLabel("Adresse mail :");
                JLabel lblSiteWeb = new JLabel("Site web :");
		JLabel lblAdr = new JLabel(Adresse);
		JLabel lblPres = new JLabel(Présentation);
		JLabel lblTel = new JLabel(Tel+"");
		JLabel lblFa = new JLabel(Fax+"");
		JLabel lblAdrMail = new JLabel(Mail);
		JLabel lblWeb = new JLabel(Web);
                
                JPanel panel2 = new JPanel();
                JLabel lblPrestataire2 = new JLabel(nomPrestataire);
		JLabel lblPhoto2 = new JLabel("Photo");
      		JLabel lblPrsentation2 = new JLabel("Pr\u00E9sentation");
		JLabel lblAdresse2 = new JLabel("Adresse :");
		JLabel lblPrsentation_12 = new JLabel("Pr\u00E9sentation :");
		JLabel lblTlephone2 = new JLabel("T\u00E9lephone :");
		JLabel lblFax2 = new JLabel("Fax :");
		JLabel lblAdresseMail2 = new JLabel("Adresse mail :");
                JLabel lblSiteWeb2 = new JLabel("Site web :");
		JLabel lblAdr2 = new JLabel(Adresse);
		JLabel lblPres2 = new JLabel(Présentation);
		JLabel lblTel2 = new JLabel(Tel+"");
		JLabel lblFa2 = new JLabel(Fax+"");
		JLabel lblAdrMail2 = new JLabel(Mail);
		JLabel lblWeb2 = new JLabel(Web);
                
                
                List<JLabel> l=new ArrayList();
                l.add(lblPrestataire);
                l.add(lblPhoto);
                l.add(lblAdresse);
                l.add(lblPrsentation_1);
                l.add(lblPrsentation);
                l.add(lblTlephone);
                l.add(lblFax);
                l.add(lblAdresseMail);
                l.add(lblSiteWeb);
                l.add(lblAdr);
                l.add(lblPres);
                l.add(lblTel);
                l.add(lblFa);
                l.add(lblAdrMail);
                l.add(lblWeb);
               
                l.get(0).setName("lblPrestataire"+String.valueOf(i));
		l.get(1).setName("lblPhoto"+String.valueOf(i));
                l.get(4).setName("lblPrsentation"+String.valueOf(i));
		l.get(2).setName("lblAdresse"+String.valueOf(i));
		l.get(5).setName("lblTlephone"+String.valueOf(i));
		l.get(3).setName("lblPresentation"+String.valueOf(i));
                l.get(6).setName("lblFax"+String.valueOf(i));
                l.get(7).setName("lblAdresseMail"+String.valueOf(i));
		l.get(8).setName("lblSiteWeb"+String.valueOf(i));
                l.get(9).setName("lblAdr"+String.valueOf(i));
                l.get(10).setName("lblPres"+String.valueOf(i));
                l.get(11).setName("lblTel"+String.valueOf(i));
                l.get(12).setName("lblFa"+String.valueOf(i));
		l.get(13).setName("lblAdrMail"+String.valueOf(i));
                l.get(14).setName("lblWeb"+String.valueOf(i));
                
                
                listPanel.get(0).setLayout(null);       
                listPanel.get(0).add(l.get(1));
                listPanel.get(0).add(l.get(0));
                listPanel.get(0).add(l.get(2));
                listPanel.get(0).add(l.get(5));
                listPanel.get(0).add(l.get(3));
                listPanel.get(0).add(l.get(2));
                listPanel.get(0).add(l.get(13));
                listPanel.get(0).add(l.get(7));
                listPanel.get(0).add(l.get(8));
                listPanel.get(0).add(l.get(12));
                listPanel.get(0).add(l.get(14));
                listPanel.get(0).add(l.get(11));
                listPanel.get(0).add(l.get(10));
                listPanel.get(0).add(l.get(9));
                listPanel.get(0).add(l.get(3));
                add(listPanel.get(0));
                
                listPanel.get(0).setBackground(Color.yellow);
               
                
               // lblPrsentation.setLocation(10+j, 10+j);
                //lblPhoto.setLocation(100, 200);
                l.get(0).setBounds(new Rectangle(100+j, 20, 80, 10));
                l.get(2).setBounds(new Rectangle(100+j, 40, 80, 10));
              
                this.setLayout(new CardLayout());
               
    }
    
   
    
    /*
     public void addPanelPrestataire(String nomPrestataire,String Adresse,String Présentation,int Tel,int Fax,String Mail,String Web){
       	JPanel panel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(324, Short.MAX_VALUE))
		);
		
		JLabel lblPrestataire = new JLabel(nomPrestataire);
		lblPrestataire.setFont(new Font("Monotype Corsiva", Font.PLAIN, 16));
		
		JLabel lblPhoto = new JLabel("Photo");
		
		JLabel lblPrsentation = new JLabel("Pr\u00E9sentation");
		lblPrsentation.setFont(new Font("Monotype Corsiva", Font.PLAIN, 16));
		
		JLabel lblAdresse = new JLabel("Adresse :");
		
		JLabel lblPrsentation_1 = new JLabel("Pr\u00E9sentation :");
		
		JLabel lblTlephone = new JLabel("T\u00E9lephone :");
		
		JLabel lblFax = new JLabel("Fax :");
		
		JLabel lblAdresseMail = new JLabel("Adresse mail :");
		
		JLabel lblSiteWeb = new JLabel("Site web :");
		
		JLabel lblAdr = new JLabel(Adresse);
		
		JLabel lblPres = new JLabel(Présentation);
		
		JLabel lblTel = new JLabel(Tel+"");
		
		JLabel lblFa = new JLabel(Fax+"");
		
		JLabel lblAdrMail = new JLabel(Mail);
		
		JLabel lblWeb = new JLabel(Web);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(45)
							.addComponent(lblPhoto))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(24)
							.addComponent(lblPrestataire, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(172)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblFax)
										.addComponent(lblAdresseMail)
										.addComponent(lblSiteWeb)
										.addComponent(lblTlephone)
										.addComponent(lblPrsentation_1)
										.addComponent(lblAdresse))
									.addGap(45)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblWeb, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblAdrMail, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblFa, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblTel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblPres, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblAdr, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))))
								.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblPrsentation)
									.addGap(253)))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPrestataire)
						.addComponent(lblPrsentation))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAdr)
						.addComponent(lblAdresse))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblPhoto))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPrsentation_1)
								.addComponent(lblPres, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTel)
						.addComponent(lblTlephone))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFax)
						.addComponent(lblFa))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAdresseMail)
						.addComponent(lblAdrMail))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSiteWeb)
						.addComponent(lblWeb))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
                panel.setName(panel+String.valueOf(i));
                lblPrestataire.setName(lblPrestataire+String.valueOf(i));
		lblPhoto.setName(lblPhoto+String.valueOf(i));
                lblPrsentation.setName(lblPrsentation+String.valueOf(i));
		lblAdresse.setName(lblAdresse+String.valueOf(i));
		lblTlephone.setName(lblTlephone+String.valueOf(i));
		lblPrsentation_1.setName(lblPrsentation_1+String.valueOf(i));
                lblFax.setName(lblFax+String.valueOf(i));
                lblAdresseMail.setName(lblAdresseMail+String.valueOf(i));
		lblSiteWeb.setName(lblSiteWeb+String.valueOf(i));
                lblAdr.setName(lblAdr+String.valueOf(i));
                lblPres.setName(lblPres+String.valueOf(i));
                lblTel.setName(lblTel+String.valueOf(i));
                lblFa.setName(lblFa+String.valueOf(i));
		lblAdrMail.setName(lblAdrMail+String.valueOf(i));
                lblWeb.setName(lblWeb+String.valueOf(i));
		setLayout(groupLayout);
                System.out.print(lblFa.getName());
    }
    */
    public ListePrestataire() {
       
         String requete = "select * from Prestataire ";

        try{
        PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
        ResultSet resultat = ps.executeQuery();
       String pr,adr,pres,mail,web;
       int tel,fax;
        while (resultat.next()){
            pr=resultat.getString(2);
            adr=resultat.getString(5);
            pres=resultat.getString(6);
            tel=resultat.getInt(7);
            fax=resultat.getInt(9);
            mail=resultat.getString(10);
            web=resultat.getString(11);
            addPanelPrestataire(pr, adr, pres, tel, fax, mail, web);
            i++;
            j=j+10;
            System.out.println(i+"   "+pr+"...."+adr+"...."+pres+"....."+tel+"..."+fax+"....."+mail+"......"+web);
        }
        }
        catch(SQLException ex){
            System.out.println("erreur lors du chargement"+ex.getMessage());
        }
              

        initComponents();
    }

    /*public void GoListeProduit(){
        CardLayout card = (CardLayout) PanelPrestataire.getLayout();
        card.show(PanelPrestataire, "CardPrestataire");
    }
    /*
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setMaximumSize(new java.awt.Dimension(500, 100));
        setPreferredSize(new java.awt.Dimension(500, 100));
        setLayout(new java.awt.CardLayout());
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
