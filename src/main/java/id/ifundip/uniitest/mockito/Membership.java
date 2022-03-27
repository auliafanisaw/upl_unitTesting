package id.ifundip.uniitest.mockito;

public class Membership {
	
    public String renewal(Denda denda){
    	
    	if (denda.finePayment(0, 0) == 0) {
    		return "Sukses memperbarui keanggotaan";
    	}else {
    		return "Gagal memperbarui keanggotaan";
    	}
    }
}
