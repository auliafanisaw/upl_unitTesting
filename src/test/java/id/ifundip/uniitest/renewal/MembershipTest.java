package id.ifundip.uniitest.renewal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class MembershipTest {

	@Test
	@DisplayName("Sukses Perpanjang.")
	public void testSuccessMembership() {
		Membership member = new Membership();
		
		int dendaBuku = 0;
		String val = member.renewal(dendaBuku);
		
		assertEquals("Sukses memperbarui keanggotaan", val);
	}
	
	@Test
	@DisplayName("Gagal Perpanjang.")
	public void testFailedMembership() {
		Membership member = new Membership();

		int dendaBuku = 10000;
		String val = member.renewal(dendaBuku);
		
		assertEquals("Gagal memperbarui keanggotaan", val);
	}

}
