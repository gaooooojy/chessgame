/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.chessgame.chessGame;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.chessgame.chessGame.ChessGamePackage
 * @generated
 */
public interface ChessGameFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ChessGameFactory eINSTANCE = uk.ac.kcl.inf.chessgame.chessGame.impl.ChessGameFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Chess Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Chess Program</em>'.
   * @generated
   */
  ChessProgram createChessProgram();

  /**
   * Returns a new object of class '<em>Statements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statements</em>'.
   * @generated
   */
  Statements createStatements();

  /**
   * Returns a new object of class '<em>Field Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Specification</em>'.
   * @generated
   */
  FieldSpecification createFieldSpecification();

  /**
   * Returns a new object of class '<em>Cell State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cell State</em>'.
   * @generated
   */
  CellState createCellState();

  /**
   * Returns a new object of class '<em>Cell Display</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cell Display</em>'.
   * @generated
   */
  CellDisplay createCellDisplay();

  /**
   * Returns a new object of class '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition</em>'.
   * @generated
   */
  Transition createTransition();

  /**
   * Returns a new object of class '<em>Mouse Trigger</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mouse Trigger</em>'.
   * @generated
   */
  MouseTrigger createMouseTrigger();

  /**
   * Returns a new object of class '<em>Game End</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Game End</em>'.
   * @generated
   */
  GameEnd createGameEnd();

  /**
   * Returns a new object of class '<em>Cell Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cell Expression</em>'.
   * @generated
   */
  CellExpression createCellExpression();

  /**
   * Returns a new object of class '<em>State Check</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Check</em>'.
   * @generated
   */
  StateCheck createStateCheck();

  /**
   * Returns a new object of class '<em>Empty Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Empty Expression</em>'.
   * @generated
   */
  EmptyExpression createEmptyExpression();

  /**
   * Returns a new object of class '<em>End Behaviour</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>End Behaviour</em>'.
   * @generated
   */
  EndBehaviour createEndBehaviour();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ChessGamePackage getChessGamePackage();

} //ChessGameFactory
