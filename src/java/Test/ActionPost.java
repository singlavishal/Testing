package Test;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.security.Security;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class ActionPost {

    int loop;
    // HTTP POST request

    public static void main(String[] args) throws Exception {

        String USER_AGENT = "Mozilla/5.0";
        HttpURLConnection conn;
        String page = "";
        String page1 = "";
        String url = "https://218.248.82.180:30030/VaspPortal/Login";
        String postParams = "USERNAME=1017&PASSWORD=trionorth&x=99&y=73";
        try {
            new ActionPost().doTrustToCertificates();
            URL obj = new URL(url);
            conn = (HttpURLConnection) obj.openConnection();

            // Acts like a browser
            conn.setUseCaches(false);
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setDoInput(true);

            // Send post request
            DataOutputStream wr = new DataOutputStream(conn.getOutputStream());

            wr.writeBytes(postParams);

            wr.flush();

            wr.close();

            int responseCode = conn.getResponseCode();

            System.out.println("\nSending 'POST' request to URL : " + url);
            System.out.println("Post parameters : " + postParams);
            System.out.println("Response Code : " + responseCode);
            //new FileDownload().dwndFile();
            //new GetFields().getData("https://218.248.82.180:30030/VaspPortal/Subs", "");
            System.out.println(page);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void doTrustToCertificates() throws Exception {
        Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
        TrustManager[] trustAllCerts = new TrustManager[]{
            new X509TrustManager() {
                public X509Certificate[] getAcceptedIssuers() {
                    return null;
                }

                public void checkServerTrusted(X509Certificate[] certs, String authType) throws CertificateException {
                    return;
                }

                public void checkClientTrusted(X509Certificate[] certs, String authType) throws CertificateException {
                    return;
                }

            }
        };

        SSLContext sc = SSLContext.getInstance("SSL");
        sc.init(null, trustAllCerts, new SecureRandom());
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        HostnameVerifier hv = new HostnameVerifier() {
            public boolean verify(String urlHostName, SSLSession session) {
                if (!urlHostName.equalsIgnoreCase(session.getPeerHost())) {
                    System.out.println("Warning: URL host '" + urlHostName + "' is different to SSLSession host '" + session.getPeerHost() + "'.");
                }
                return true;
            }
        };
        HttpsURLConnection.setDefaultHostnameVerifier(hv);
    }
}
