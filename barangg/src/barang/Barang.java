
package barang;
       
public class Barang {
String kode_barang;
String nama_barang;
private int stok;

//construktor

public Barang(String kode, String nama, int stk) {
kode_barang = kode;
nama_barang = nama;
stok = stk;

}
//setter dan getter

public void setStok(int stok){
  this.stok = stok;  
}
public void setKode(String kode){
  this.kode_barang = kode;  
}
public void setName(String nama){
  this.nama_barang = nama;  
}

public int getStok(){
    return this.stok;
}
public String getName(){
    return this.nama_barang;
}
public String getKode(){
    return this.kode_barang;
}
public void plusStok(int stok){
    this.stok += stok; //operasi untuk menambahkan
}  
    }