/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restservice;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebastian
 */
public class StartRestServer {

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServerFactory.create("http://localhost:8080/rest");
        server.start();
        JOptionPane.showMessageDialog(null, "Ende");
        server.stop(0);
        //iwashere
    }
}
