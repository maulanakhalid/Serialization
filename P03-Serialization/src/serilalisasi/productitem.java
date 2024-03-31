/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serilalisasi;
import java.io.Serializable;

/**
 *
 * @author LENOVO
 */
public class productitem implements Serializable {
    String nama;
    double harga;
    
    public productitem(String name, double price) {
        this.nama = name;
        this.harga = price;
    } 
    @Override
    public String toString() {
        return "\r\nNama=" + nama + "\r\nHarga=" + harga + "\r\n";
    }
}
