package id.ifundip.uniitest.renewal;

public class Membership {
	
    public String renewal(int dendaBuku){
    	Denda denda = new Denda();
    	
    	if (dendaBuku == denda.finePayment(0, 0)) {
    		return "Sukses memperbarui keanggotaan";
    	}else {
    		return "Gagal memperbarui keanggotaan";
    	}
    }
}
