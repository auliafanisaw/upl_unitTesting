package id.ifundip.uniitest.renewal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

class DendaTest {
	private Denda denda;
	
	@BeforeEach
	public void setUp() {
		denda = new Denda();
	}

	@Test
	@DisplayName("Denda Tiga Hari Dua Buku.")
	public void testDendaTigaHariDuaBuku() {
		assertEquals(1000, denda.finePayment(3, 2));
	}
	
	@Test
	@DisplayName("Denda Nol Hari Nol Buku.")
	public void testDendaNolHariNolBuku() {
		assertEquals(0, denda.finePayment(0, 0));
	}
	
	@Test
	@DisplayName("Denda Nol Hari Tiga Buku.")
	public void testDendaNolHariTigaBuku() {
		assertEquals(0, denda.finePayment(0, 3));
	}

}
