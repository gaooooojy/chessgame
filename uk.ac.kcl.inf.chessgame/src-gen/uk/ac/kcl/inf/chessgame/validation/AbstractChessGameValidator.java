/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.chessgame.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractChessGameValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(uk.ac.kcl.inf.chessgame.chessGame.ChessGamePackage.eINSTANCE);
		return result;
	}
}
