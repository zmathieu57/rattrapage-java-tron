package viewTest;

import static org.junit.Assert.*;

import org.junit.Test;

import view.ViewFacade;

public class ViewFacadeTest {
	
	@Test
	public final void testmain() {
		fail("Not yet implemented");
	}
	
	@Test
	public final void testgame() {
		fail("Not yet implemented");
	}
	
	@Test
	public final void testwindow() {
		fail("Not yet implemented");
	}

	@Test
	public final void testdraw() {
		fail("Not yet implemented");
	}
	
	@Test
	public final void testmtext() {
		fail("Not yet implemented");
	}
	
	@Test
	public final void testseizure() {
		fail("Not yet implemented");
	}
	
	@Test
	public final void testbutton() {
		fail("Not yet implemented");
	}
	
	@Test
	public final void testshowwindow() {
		fail("Not yet implemented");
	}
	
	@Test
	public final void testactionperformed() {
		fail("Not yet implemented");
	}
	
	@Test
	public final void testkeytyped() {
		fail("Not yet implemented");
	}
	
	@Test
	public final void testkeypressed() {
		fail("Not yet implemented");
	}
	
	@Test
	public final void testkeyreleased() {
		fail("Not yet implemented");
	}
	
	@Test
	public final void testgetcontroller() {
		fail("Not yet implemented");
	}
	
	@Test
	public final void testsetcontroller() {
		fail("Not yet implemented");
	}
	
	@Test
	public final void testgetuser1() {
		ViewFacade viewfacade = new ViewFacade();
		viewfacade.setUser1("testgetuser1");
		assertTrue(viewfacade.getUser1() == "testgetuser1");
	}
	
	@Test
	public final void testsetuser1() {
		ViewFacade viewfacade = new ViewFacade();
		viewfacade.setUser1("testgetuser1");
		assertTrue(viewfacade.getUser1() == "testgetuser1");
		}
	
	@Test
	public final void testgetuser2() {
		ViewFacade viewfacade = new ViewFacade();
		viewfacade.setUser2("testgetuser2");
		assertTrue(viewfacade.getUser2() == "testgetuser2");
	}
	
	@Test
	public final void testsetuser2() {
		ViewFacade viewfacade = new ViewFacade();
		viewfacade.setUser2("testgetuser2");
		assertTrue(viewfacade.getUser2() == "testgetuser2");
		}
}
