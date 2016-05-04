
/**
 * Write a description of class BarangSatuan here.
 * 
 * @author Reivin Oktavianus
 * @version (a version number or a date)
 */
public class BarangSatuan extends Inventory
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class BarangSatuan
     */
    public BarangSatuan(float satuan, String namaInventory, String namaUkuran, float harga, int stok)
    {
        // initialise instance variables
        super(namaInventory, namaUkuran, namaUkuran, satuan, harga, stok);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String setMessage (String namaInventory, float jumlah)
    {
        return "Penjualan " + namaInventory + " " + jumlah + " " + getNamaSatuan() + " seharga Rp. " + getHargaTotal() * jumlah + ",-";
    }
    
    public String setMessage (float jumlah, String namaInventory)
    {
        return "Penjualan "  + namaInventory + " "+ jumlah + " " + getNamaUkuran() + " seharga Rp. " + getHargaTotal() * jumlah + ",-";
    }
    
    public float getHargaTotal()
    {
        return getHarga() - (getHarga() * getDiscount());
    }
    
}
