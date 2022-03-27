package id.ifundip.uniitest.renewal;

public class Denda{
	
	public int finePayment(int terlambat, int buku) {
		int bayar;
		// TODO Auto-generated method stub
		if (terlambat >= 10) {
			bayar = buku * 5000;
			return bayar;
		}
		else if(terlambat >6 && terlambat <=9){
            bayar = buku * 1500;
            return bayar;
        }
        else if (terlambat >3 && terlambat <=6){
            bayar = buku * 1000;
            return bayar;
        }
        else if (terlambat >1 && terlambat <=3){
            bayar = buku * 500;
            return bayar;
        }
        else{
            bayar = buku * 0;
            return bayar;
        }
	}
}
