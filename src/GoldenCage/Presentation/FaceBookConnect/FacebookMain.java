package GoldenCage.Presentation.FaceBookConnect;


import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserAdapter;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserNavigationEvent;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.StringReader;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;
import org.eclipse.swt.widgets.MessageBox;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


public class FacebookMain extends JFrame{

public static String API_KEY = "348843198564290";
public static String SECRET = "2ee1d620ccc0047395e74fa9f6c153bc";

  public static String firstRequest = "https://graph.facebook.com/oauth/authorize?"
  + "client_id="
  + API_KEY
  + "&redirect_uri=http://www.facebook.com/connect/login_success.html&"
  + "scope=publish_stream,offline_access,create_event,read_stream,email,user_birthday";
  
  public static String secondRequest="https://graph.facebook.com/oauth/access_token?"
  + "client_id="
  + API_KEY
  + "&redirect_uri=http://www.facebook.com/connect/login_success.html&"
  + "client_secret=" + SECRET + "&code=";

  public static String access_token = "CAAE9RWLux8IBADraHN4Uate1lrjbZC9WoQZAwbtOOZBwGL6J55G9cJCvIccVMEeF6iRO9bxjzk41MlIU0rd0Li8DbW56vblhnhskeAoIEi8NrQSqv6ial2qj7cF3uIRZCSdJCraHe37ZBewYJnxXWY6NCMVRgDc1Qw7P6v4z23TYxNJXqZCMCq";
  public static boolean firstRequestDone = false;
  public static boolean secondRequestDone = false;
    /**
     * @param args
     */
    public static void main(final String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                NativeInterface.open();
                NativeInterface.initialize();
                FacebookTestClient testClient = new FacebookTestClient();

                testClient.setLoginListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println(" Bouton 1");
                        final JFrame loginFrame = new JFrame();
                        JPanel webBrowserPanel = new JPanel(new BorderLayout());
                        // this is the JWebBrowser i mentioned earlier
                        final JWebBrowser webBrowser = new JWebBrowser();
                        // You can set this fields to false, or even let them activated
                        webBrowser.setMenuBarVisible(false);
                        webBrowser.setButtonBarVisible(false);
                        webBrowser.setLocationBarVisible(false);
                        final String fb_url = "http://www.facebook.com/";
                        webBrowser.navigate(fb_url);

                        // Here we add to our JWebBrowser an Adapter and override the 
                        // locationChanging() method. Here we can check, if we are 
                        // changing the location
                        // in our case the String fb_url, then this JWebBrowser can be 
                        // disposed.
                        // The Timer is set for 2 seconds, so we can still see if the 
                        // login was successfull or not.
                        webBrowser.addWebBrowserListener(new WebBrowserAdapter() {
                            @Override
                            public void locationChanging(WebBrowserNavigationEvent e) {
                                super.locationChanging(e);
                                System.out.println(e.getNewResourceLocation());

                                if (!e.getNewResourceLocation().equals(fb_url)) {
                                    Timer timer = new Timer(5000, new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent arg0) {
                                            //loginFrame.dispose();
                                        }
                                    });
                                    timer.start();
                                }
                            }
                        });
                        webBrowserPanel.add(webBrowser, BorderLayout.CENTER);
                        loginFrame.add(webBrowserPanel);
                        loginFrame.setSize(400, 500);
                        loginFrame.setVisible(true);
                    }
                });
                 testClient.setretrieveUserListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println(" Bouton 3");
                      // GraphReaderExample.main(args);
                    }
                 });
                testClient.setgetAccessTokenListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println(" Bouton 4"); 
                       //JFrame parent = new JFrame();
    //JOptionPane.showMessageDialog(parent,  access_token);
                        System.out.println("access_token est: "+access_token);
                      
                    }
                 });
                testClient.setgetPermissionsForAppListener(new ActionListener() {

  @Override
  public void actionPerformed(ActionEvent e) {
      System.out.println(" Bouton 2");
    final JFrame authFrame = new JFrame();
    // Create the JWebBrowser and add the WebBrowserAdapter
    JPanel webBrowserPanel = new JPanel(new BorderLayout());
    final JWebBrowser webBrowser = new JWebBrowser();
    webBrowser.setMenuBarVisible(false);
    webBrowser.setButtonBarVisible(false);
    webBrowser.setLocationBarVisible(false);
    webBrowser.navigate(firstRequest);
    webBrowser.addWebBrowserListener(new WebBrowserAdapter() {
      @Override
      public void locationChanged(WebBrowserNavigationEvent e) {
        super.locationChanged(e);
        // Check if first request was not done
        if (!firstRequestDone) {
          // Check if you left the location and were redirected to the next 
          // location
          if (e.getNewResourceLocation().contains("http://www.facebook.com/connect/login_success.html?code=")){
            // If it successfully redirects you, get the verification code
            // and go for a second request
            String[] splits = e.getNewResourceLocation().split("=");
            String stage2temp = secondRequest + splits[1];
              System.out.println("First ="+splits[1]);
            webBrowser.navigate(stage2temp);
            firstRequestDone = true;
          }
        } else {
          // If secondRequest is not done yet, you perform this and get the 
          // access_token
          if (!secondRequestDone) {
            System.out.println(webBrowser.getHTMLContent());
            // Create reader with the html content
            StringReader readerSTR = new StringReader(webBrowser.getHTMLContent());
            // Create a callback for html parser
            HTMLEditorKit.ParserCallback callback = 
            new HTMLEditorKit.ParserCallback() {
                @Override
              public void handleText(char[] data,int pos) {
                System.out.println(data);
                // because there is only one line with the access_token 
                // in the html content you can parse it.
                String string = new String(data);
                String[] temp1 = string.split("&");
                String[] temp2 = temp1[0].split("=");
                    System.out.println("access tocken="+temp2);
                access_token = temp2[1];
              }
            };
            try {
              // Call the parse method 
              new ParserDelegator().parse(readerSTR,callback,false);
            } catch (IOException e1) {
              e1.printStackTrace();
            }
            // After everything is done, you can dispose the jframe
            //authFrame.dispose();      
          }
        }
      }
    });
    webBrowserPanel.add(webBrowser,BorderLayout.CENTER);
    authFrame.add(webBrowserPanel);
    authFrame.setSize(400, 500);
    authFrame.setVisible(true);
  }
});
                  
            }
        });
                }
    
    
}
