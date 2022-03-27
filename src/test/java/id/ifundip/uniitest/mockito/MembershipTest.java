package id.ifundip.uniitest.mockito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class MembershipTest {

	@Test
	@DisplayName("Sukses Perpanjang.")
	void testSuccess() {
		Membership member = new Membership();
		Denda denda = mock(Denda.class);
		when(denda.finePayment(0,0)).thenReturn(0);
		
		assertEquals("Sukses memperbarui keanggotaan", member.renewal(denda));
	}
	
	@Test
	@DisplayName("Gagal Perpanjang.")
	void testFail() {
		Membership member = new Membership();
		Denda denda = mock(Denda.class);
		when(denda.finePayment(0,0)).thenReturn(1000);
		
		assertEquals("Gagal memperbarui keanggotaan", member.renewal(denda));
	}

}
