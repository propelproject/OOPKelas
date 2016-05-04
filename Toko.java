
/**
 * Write a description of class Toko here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Toko
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Toko
     */
    public Toko()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    /**
     * Method untuk toko melakukan pembelian, di mana akan mengurangi stok dari inventory dan menentukan apakah pembelian dilakukan secara satuan atau tidak
     */
    public void pembelian(Inventory barang, float jumlah, boolean satuan)
    {
        if (satuan)
        {
            System.out.println(barang.setMessage(barang.getNamaInventory(), jumlah));
            barang.setStok(barang.getStok() - (int)jumlah);
            System.out.println(barang.getNamaInventory() + " sekarang tersisa " + barang.getStok() + " " + barang.getNamaSatuan());
        }
        else
        {
            if (jumlah >= 10) 
            {
                barang.setDiscount(0.025f);
            }
            else if (jumlah >= 100)
            {
                barang.setDiscount(0.1f);
            }
            System.out.println(barang.setMessage(jumlah, barang.getNamaInventory()));
            barang.setStok(barang.getStok() - (int)jumlah);
            System.out.println(barang.getNamaInventory() + " sekarang tersisa " + barang.getStok() + " " + barang.getNamaSatuan());
            barang.setDiscount(0.0f);
        }
    }
    
}
