package ejemplopipeline;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DiezxcientoTest {

	@Test
	public void testDiezxciento() throws Exception {
		Diezxciento diezxciento = new Diezxciento(23000000,900000);
		assertEquals(2300000, diezxciento.diezxciento());
	}

	@Test
	public void testImpuesto() throws Exception {
		Diezxciento diezxciento = new Diezxciento();
		
		assertEquals(0, diezxciento.impuesto(1000000,1000000));
		assertEquals(6, diezxciento.impuesto(1500000,1000000));
		assertEquals(12, diezxciento.impuesto(1500000,2000000));
		assertEquals(17, diezxciento.impuesto(1500000,4300000));
		assertEquals(24, diezxciento.impuesto(3000000,4300000));
		assertEquals(22, diezxciento.impuesto(5000000,4300000));
		assertEquals(31, diezxciento.impuesto(6000000,4300000));

	}

	@Test
	public void testSaldoAhorro() throws Exception {
		Diezxciento diezxciento = new Diezxciento();

		assertEquals(17100000, diezxciento.saldoAhorro(19000000));
		assertEquals(22500000, diezxciento.saldoAhorro(25000000));
		assertEquals(40500000, diezxciento.saldoAhorro(45000000));

	}

}
