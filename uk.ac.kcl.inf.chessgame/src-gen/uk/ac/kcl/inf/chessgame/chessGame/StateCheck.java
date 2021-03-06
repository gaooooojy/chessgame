/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.chessgame.chessGame;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.chessgame.chessGame.StateCheck#getCell_state <em>Cell state</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.chessgame.chessGame.ChessGamePackage#getStateCheck()
 * @model
 * @generated
 */
public interface StateCheck extends EObject
{
  /**
   * Returns the value of the '<em><b>Cell state</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cell state</em>' reference.
   * @see #setCell_state(CellState)
   * @see uk.ac.kcl.inf.chessgame.chessGame.ChessGamePackage#getStateCheck_Cell_state()
   * @model
   * @generated
   */
  CellState getCell_state();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.chessgame.chessGame.StateCheck#getCell_state <em>Cell state</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cell state</em>' reference.
   * @see #getCell_state()
   * @generated
   */
  void setCell_state(CellState value);

} // StateCheck
