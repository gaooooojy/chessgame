/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.chessgame.chessGame.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uk.ac.kcl.inf.chessgame.chessGame.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.chessgame.chessGame.ChessGamePackage
 * @generated
 */
public class ChessGameSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ChessGamePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChessGameSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ChessGamePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ChessGamePackage.CHESS_PROGRAM:
      {
        ChessProgram chessProgram = (ChessProgram)theEObject;
        T result = caseChessProgram(chessProgram);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessGamePackage.STATEMENTS:
      {
        Statements statements = (Statements)theEObject;
        T result = caseStatements(statements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessGamePackage.FIELD_SPECIFICATION:
      {
        FieldSpecification fieldSpecification = (FieldSpecification)theEObject;
        T result = caseFieldSpecification(fieldSpecification);
        if (result == null) result = caseStatements(fieldSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessGamePackage.CELL_STATE:
      {
        CellState cellState = (CellState)theEObject;
        T result = caseCellState(cellState);
        if (result == null) result = caseStatements(cellState);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessGamePackage.CELL_DISPLAY:
      {
        CellDisplay cellDisplay = (CellDisplay)theEObject;
        T result = caseCellDisplay(cellDisplay);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessGamePackage.TRANSITION:
      {
        Transition transition = (Transition)theEObject;
        T result = caseTransition(transition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessGamePackage.MOUSE_TRIGGER:
      {
        MouseTrigger mouseTrigger = (MouseTrigger)theEObject;
        T result = caseMouseTrigger(mouseTrigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessGamePackage.GAME_END:
      {
        GameEnd gameEnd = (GameEnd)theEObject;
        T result = caseGameEnd(gameEnd);
        if (result == null) result = caseStatements(gameEnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessGamePackage.CELL_EXPRESSION:
      {
        CellExpression cellExpression = (CellExpression)theEObject;
        T result = caseCellExpression(cellExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessGamePackage.STATE_CHECK:
      {
        StateCheck stateCheck = (StateCheck)theEObject;
        T result = caseStateCheck(stateCheck);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessGamePackage.EMPTY_EXPRESSION:
      {
        EmptyExpression emptyExpression = (EmptyExpression)theEObject;
        T result = caseEmptyExpression(emptyExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessGamePackage.END_BEHAVIOUR:
      {
        EndBehaviour endBehaviour = (EndBehaviour)theEObject;
        T result = caseEndBehaviour(endBehaviour);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Chess Program</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Chess Program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChessProgram(ChessProgram object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatements(Statements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFieldSpecification(FieldSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cell State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cell State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCellState(CellState object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cell Display</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cell Display</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCellDisplay(CellDisplay object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransition(Transition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mouse Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mouse Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMouseTrigger(MouseTrigger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Game End</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Game End</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGameEnd(GameEnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cell Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cell Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCellExpression(CellExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Check</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Check</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateCheck(StateCheck object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Empty Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Empty Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmptyExpression(EmptyExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>End Behaviour</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>End Behaviour</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEndBehaviour(EndBehaviour object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ChessGameSwitch
