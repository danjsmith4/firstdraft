/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstdraft;

/**
 *
 * @author aelek
 */
public class Switch {
    String ip;
    public String name;
    String os;
    String osversion;
    String subnetmask;
    String defaultgateway;
    String dns;
    
    Switch(String hostname) {
        this.name = hostname;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getIP() {
        return this.ip;
    }
    
    public void setIP(String name) {
        this.ip = name;
    }
    
    public String getOS() {
        return this.os;
    }
    
    public void setOS(String name) {
        this.os = name;
    }
    
    public String getOSVersion() {
        return this.osversion;
    }
    
    public void setOSVersion(String name) {
        this.osversion = name;
    }
    
    public String getSubnetMask() {
        return this.subnetmask;
    }
    
    public void setSubnetMask(String name) {
        this.subnetmask = name;
    }
    
    public String getDefaultGateway() {
        return this.defaultgateway;
    }
    
    public void setDefaultGateway(String name) {
        this.defaultgateway = name;
    }
    
    public String getDNS() {
        return this.dns;
    }
    
    public void setDNS(String name) {
        this.dns = name;
    }
}
