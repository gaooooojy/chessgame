/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.chessgame.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import uk.ac.kcl.inf.chessgame.ChessGameRuntimeModule;
import uk.ac.kcl.inf.chessgame.ChessGameStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class ChessGameIdeSetup extends ChessGameStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new ChessGameRuntimeModule(), new ChessGameIdeModule()));
	}
	
}
