
/**
 * Write a description of class BarangEceranKodian here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BarangEceranKodian extends Inventory
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class BarangEceranKodian
     */
    public BarangEceranKodian(String namaInventory, String namaUkuran , String namaSatuan, float satuan, float harga, int stok)
    {
        super(namaInventory, namaUkuran, namaSatuan, satuan, harga, stok);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String setMessage(String namaInventory, float jumlah)
    {
        return "Penjualan "  + namaInventory + " "+ jumlah + " " + getNamaSatuan() + " seharga Rp. " + getHargaTotal() * jumlah + ",-";
    }
    
    public String setMessage(float jumlah, String namaInventory)
    {
        return "Penjualan "  + namaInventory + " "+ jumlah + " " + getNamaUkuran() + " seharga Rp. " + getHargaTotal() * jumlah * getSatuan()+ ",-";
    }
    
    public float getHargaTotal ()
    {
        return getHarga() * getDiscount();
    }
}
