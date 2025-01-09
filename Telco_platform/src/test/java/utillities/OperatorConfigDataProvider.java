package utillities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class OperatorConfigDataProvider {

    private Properties properties;

    public OperatorConfigDataProvider() {
        ConfigDataProvider configDataProvider = new ConfigDataProvider();
        String operator = configDataProvider.getOperator();
        String projectLocation = System.getProperty("user.dir");
        String confFile = projectLocation + "/config/" + operator + "/" + operator + "-config.properties";
        try {
            File conf = new File(confFile);
            FileInputStream fileInputStream = new FileInputStream(conf);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (Exception e) {
            System.out.println();
        }
    }

    public String getURL() {
        String URL = properties.getProperty("URL");
        System.out.println(URL);
        return URL;
    }

    public String getSDPAdminUsername() {
        return properties.getProperty("SDPAdminUsername");
    }
    public String getSDPAdminPassword() {
        return properties.getProperty("SDPAdminPassword");
    }
    public String getSPUsername() {
        return properties.getProperty("SPUsername");
    }
    public String getSPPassword() {
        return properties.getProperty("SPPassword");
    }
    public String getDeletedspusername() {
        return properties.getProperty("Deletedspusername");
    }
    public String getDeletedsppassword() {
        return properties.getProperty("Deletedsppassword");
    }

    public String getSystemAdminUsername() {
        System.out.printf(properties.getProperty("SystemAdminUsername"));
        return properties.getProperty("SystemAdminUsername");
    }
    public String getSystemAdminPassword() {
        return properties.getProperty("SystemAdminPassword");
    }

    public String getLimitedAdminUsername(){
        return properties.getProperty("LimitedAdminUsername");
    }

    public String getLimitedAdminPassword(){
        return properties.getProperty("LimitedAdminPassword");
    }

    public String getmsisdnPlaceholder(){return properties.getProperty("mobilePlaceholder");}
    public String getVerificationMethodMessage(){return properties.getProperty("verificationMethodMessage");}
    public String getTermsMessage(){return properties.getProperty("termsMessage");}



}
