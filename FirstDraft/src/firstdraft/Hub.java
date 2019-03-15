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
public class Hub {
    String name;
    
    Hub(String hostname) {
        this.name = hostname;
    }
    
    public String getName() {
        return this.name;
        }
        
    public void setName(String name) {
        this.name = name;
    }
}
