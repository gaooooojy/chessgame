/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.chessgame;

import uk.ac.kcl.inf.chessgame.ChessGameStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class ChessGameStandaloneSetup extends ChessGameStandaloneSetupGenerated {
  public static void doSetup() {
    new ChessGameStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
