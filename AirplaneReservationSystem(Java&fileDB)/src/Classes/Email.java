package Classes;




import java.util.ArrayList;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/**
 *
 * @author mahmoud mohamed
 */
public class Email  {
    
   
   Manager_Tools FManger = new Manager_Tools();

   private final String EmailFileName = "email.txt";
    public static ArrayList<Email> E = new ArrayList<Email>();
    static Properties mailServerProperties;
    static Session getMailSession;
    static MimeMessage generateMailMessage;

    String ToEmail = "";
    String CcEmail = "";
    String Subject = "";
    String Emailbody = "";
    public Email() {
    }

    public Email(String ToEmail, String CcEmail, String Subject, String Emailbody) {
        this.ToEmail = ToEmail;
        this.CcEmail = CcEmail;
        this.Subject = Subject;
        this.Emailbody = Emailbody;
    }

    public void generateAndSendEmail() throws AddressException, MessagingException {


           // Step1
           System.out.println("\n 1st ===> setup Mail Server Properties..");
           
           mailServerProperties = System.getProperties();
           mailServerProperties.put("mail.smtp.port", "587");  // ( smtp = simple mail transfer protocol)
           mailServerProperties.put("mail.smtp.auth", "true");
           mailServerProperties.put("mail.smtp.starttls.enable", "true"); // Transport Layer Security (TLS)
           
           System.out.println("Mail Server Properties have been setup successfully..");
           
           // Step2
           System.out.println("\n\n 2nd ===> get Mail Session..");
           
           getMailSession = Session.getDefaultInstance(mailServerProperties, null);
           
           generateMailMessage = new MimeMessage(getMailSession);
           generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(ToEmail));
           if (!CcEmail.equals("")) {
               generateMailMessage.addRecipient(Message.RecipientType.CC, new InternetAddress(CcEmail));
           }
           generateMailMessage.setSubject(Subject);
           String emailBody = Emailbody + "<br><br> Regards, <br>Airline system";
           generateMailMessage.setContent(emailBody, "text/html");
           
           System.out.println("Mail Session has been created successfully..");
           
           // Step3
           System.out.println("\n\n 3rd ===> Get Session and Send mail");
           // Enter your correct gmail UserID and Password
           // if you have 2FA enabled then provide App Specific Password
         
              Transport transport = getMailSession.getTransport("smtp");  
               transport.connect("smtp.gmail.com","PL2CS213@gmail.com", "SW2CS352");
           transport.sendMessage(generateMailMessage, generateMailMessage.getAllRecipients());
           transport.close();
       
           System.out.println("\n\n ===> Your Java Program has just sent an Email successfully. Check your email..");
    }      /*     
          loadFromFile();
          E.add(this);
          commitToFile();
        }  
    
      private void loadFromFile() {
            E = (ArrayList<Email>) (Object) FManger.read("email.txt");
    }
          private String getEmailData() {
        return this.ToEmail + "#_#" +this.CcEmail + "#_#"+this.Subject +"#_#"+this.Emailbody  ;
    }
    private boolean commitToFile() {
       
       return  FManger.write(E.toString(), "email.txt" , true);
    }

    public ArrayList<Email> listEmail() {
        loadFromFile();
        return E;
    }
*/
    public String getTo() {
        return ToEmail;
    }

    public String getCc() {
        return CcEmail;
    }

    public String getSubject() {
        return Subject;
    }

    public String getBody() {
        return Emailbody;
    }
}

