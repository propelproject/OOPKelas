
/**
 * Abstract class Inventory - write a description of the class here
 * 
 * @author Reivin Oktavianus
 * @version (version number or date here)
 */
public abstract class Inventory implements Items
{
    // Nama dari inventory
    private String namaInventory, namaUkuran, namaSatuan;
    private int stok;
    private float satuan, harga, berat, discount = 0;
    
    public Inventory(String namaInventory, String namaUkuran, String namaSatuan, float satuan, float harga, int stok)
    {
        setSatuan(satuan);
        setNamaInventory(namaInventory);
        setNamaUkuran(namaUkuran);
        setNamaSatuan(namaSatuan);
        setStok(stok);
        setHarga(harga);
        setDiscount(0.0f);
        if (!(this instanceof BarangSatuan))
        {
            System.out.println("Penambahan " + namaInventory + " sebanyak " + stok + " " + namaSatuan + " atau " + ((float)stok / satuan) + " " + namaUkuran + " menjadi " + getStok() + " " + getSatuan());
        }
        else System.out.println("Penambahan " + namaInventory + " sebanyak " + stok + " " + namaSatuan + " menjadi " + getStok() + " " + getNamaSatuan());
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the sum of x and y 
     */
    public void setNamaInventory(String namaInventory)
    {
        this.namaInventory = namaInventory;
    }
    
    public String getNamaInventory()
    {
        return namaInventory;
    }
    
    public void setNamaUkuran(String namaUkuran)
    {
        this.namaUkuran = namaUkuran;
    }
    
    public String getNamaUkuran()
    {
        return namaUkuran;
    }
    
    public void setNamaSatuan(String namaSatuan)
    {
        this.namaSatuan = namaSatuan;
    }
    
    public String getNamaSatuan()
    {
        return namaSatuan;
    }
    
    public void setDiscount(float discount)
    {
        this.discount = discount;
    }
    
    public float getDiscount()
    {
        return discount;
    }
    
    public void setStok(int stok)
    {
        this.stok = stok;
    }
    
    public void setSatuan(float satuan)
    {
        this.satuan = satuan;
    }
    
    public float getHarga()
    {
        return harga;
    }
    
    public void setHarga(float harga)
    {
        this.harga = harga;
    }
    
    public float getSatuan()
    {
        return satuan;
    }
    
    public int getStok()
    {
        return stok;
    }
    
    public void getHarga(float harga)
    {
     this.harga = harga;   
    }
}
