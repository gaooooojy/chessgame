/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.chessgame.chessGame.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uk.ac.kcl.inf.chessgame.chessGame.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.chessgame.chessGame.ChessGamePackage
 * @generated
 */
public class ChessGameAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ChessGamePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChessGameAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ChessGamePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChessGameSwitch<Adapter> modelSwitch =
    new ChessGameSwitch<Adapter>()
    {
      @Override
      public Adapter caseChessProgram(ChessProgram object)
      {
        return createChessProgramAdapter();
      }
      @Override
      public Adapter caseFieldSpecification(FieldSpecification object)
      {
        return createFieldSpecificationAdapter();
      }
      @Override
      public Adapter caseOptionSpecification(OptionSpecification object)
      {
        return createOptionSpecificationAdapter();
      }
      @Override
      public Adapter caseCellState(CellState object)
      {
        return createCellStateAdapter();
      }
      @Override
      public Adapter caseCellDisplaySpec(CellDisplaySpec object)
      {
        return createCellDisplaySpecAdapter();
      }
      @Override
      public Adapter caseTransitionSpec(TransitionSpec object)
      {
        return createTransitionSpecAdapter();
      }
      @Override
      public Adapter caseMouseTrigger(MouseTrigger object)
      {
        return createMouseTriggerAdapter();
      }
      @Override
      public Adapter caseGameEnd(GameEnd object)
      {
        return createGameEndAdapter();
      }
      @Override
      public Adapter caseContextExpression(ContextExpression object)
      {
        return createContextExpressionAdapter();
      }
      @Override
      public Adapter caseStateFilterExpression(StateFilterExpression object)
      {
        return createStateFilterExpressionAdapter();
      }
      @Override
      public Adapter caseEmptyExpression(EmptyExpression object)
      {
        return createEmptyExpressionAdapter();
      }
      @Override
      public Adapter caseEndBehaviour(EndBehaviour object)
      {
        return createEndBehaviourAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.chessgame.chessGame.ChessProgram <em>Chess Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.chessgame.chessGame.ChessProgram
   * @generated
   */
  public Adapter createChessProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.chessgame.chessGame.FieldSpecification <em>Field Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.chessgame.chessGame.FieldSpecification
   * @generated
   */
  public Adapter createFieldSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.chessgame.chessGame.OptionSpecification <em>Option Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.chessgame.chessGame.OptionSpecification
   * @generated
   */
  public Adapter createOptionSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.chessgame.chessGame.CellState <em>Cell State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.chessgame.chessGame.CellState
   * @generated
   */
  public Adapter createCellStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.chessgame.chessGame.CellDisplaySpec <em>Cell Display Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.chessgame.chessGame.CellDisplaySpec
   * @generated
   */
  public Adapter createCellDisplaySpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.chessgame.chessGame.TransitionSpec <em>Transition Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.chessgame.chessGame.TransitionSpec
   * @generated
   */
  public Adapter createTransitionSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.chessgame.chessGame.MouseTrigger <em>Mouse Trigger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.chessgame.chessGame.MouseTrigger
   * @generated
   */
  public Adapter createMouseTriggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.chessgame.chessGame.GameEnd <em>Game End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.chessgame.chessGame.GameEnd
   * @generated
   */
  public Adapter createGameEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.chessgame.chessGame.ContextExpression <em>Context Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.chessgame.chessGame.ContextExpression
   * @generated
   */
  public Adapter createContextExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.chessgame.chessGame.StateFilterExpression <em>State Filter Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.chessgame.chessGame.StateFilterExpression
   * @generated
   */
  public Adapter createStateFilterExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.chessgame.chessGame.EmptyExpression <em>Empty Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.chessgame.chessGame.EmptyExpression
   * @generated
   */
  public Adapter createEmptyExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.chessgame.chessGame.EndBehaviour <em>End Behaviour</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.chessgame.chessGame.EndBehaviour
   * @generated
   */
  public Adapter createEndBehaviourAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ChessGameAdapterFactory
