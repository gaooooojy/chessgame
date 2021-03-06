/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.chessgame.chessGame.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.kcl.inf.chessgame.chessGame.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChessGameFactoryImpl extends EFactoryImpl implements ChessGameFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ChessGameFactory init()
  {
    try
    {
      ChessGameFactory theChessGameFactory = (ChessGameFactory)EPackage.Registry.INSTANCE.getEFactory(ChessGamePackage.eNS_URI);
      if (theChessGameFactory != null)
      {
        return theChessGameFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ChessGameFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChessGameFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ChessGamePackage.CHESS_PROGRAM: return createChessProgram();
      case ChessGamePackage.STATEMENTS: return createStatements();
      case ChessGamePackage.FIELD_SPECIFICATION: return createFieldSpecification();
      case ChessGamePackage.CELL_STATE: return createCellState();
      case ChessGamePackage.CELL_DISPLAY: return createCellDisplay();
      case ChessGamePackage.TRANSITION: return createTransition();
      case ChessGamePackage.MOUSE_TRIGGER: return createMouseTrigger();
      case ChessGamePackage.GAME_END: return createGameEnd();
      case ChessGamePackage.CELL_EXPRESSION: return createCellExpression();
      case ChessGamePackage.STATE_CHECK: return createStateCheck();
      case ChessGamePackage.EMPTY_EXPRESSION: return createEmptyExpression();
      case ChessGamePackage.END_BEHAVIOUR: return createEndBehaviour();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ChessGamePackage.COLOR_CHOICE:
        return createcolorChoiceFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ChessGamePackage.COLOR_CHOICE:
        return convertcolorChoiceToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ChessProgram createChessProgram()
  {
    ChessProgramImpl chessProgram = new ChessProgramImpl();
    return chessProgram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Statements createStatements()
  {
    StatementsImpl statements = new StatementsImpl();
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FieldSpecification createFieldSpecification()
  {
    FieldSpecificationImpl fieldSpecification = new FieldSpecificationImpl();
    return fieldSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CellState createCellState()
  {
    CellStateImpl cellState = new CellStateImpl();
    return cellState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CellDisplay createCellDisplay()
  {
    CellDisplayImpl cellDisplay = new CellDisplayImpl();
    return cellDisplay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Transition createTransition()
  {
    TransitionImpl transition = new TransitionImpl();
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MouseTrigger createMouseTrigger()
  {
    MouseTriggerImpl mouseTrigger = new MouseTriggerImpl();
    return mouseTrigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GameEnd createGameEnd()
  {
    GameEndImpl gameEnd = new GameEndImpl();
    return gameEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CellExpression createCellExpression()
  {
    CellExpressionImpl cellExpression = new CellExpressionImpl();
    return cellExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StateCheck createStateCheck()
  {
    StateCheckImpl stateCheck = new StateCheckImpl();
    return stateCheck;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EmptyExpression createEmptyExpression()
  {
    EmptyExpressionImpl emptyExpression = new EmptyExpressionImpl();
    return emptyExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EndBehaviour createEndBehaviour()
  {
    EndBehaviourImpl endBehaviour = new EndBehaviourImpl();
    return endBehaviour;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public colorChoice createcolorChoiceFromString(EDataType eDataType, String initialValue)
  {
    colorChoice result = colorChoice.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertcolorChoiceToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ChessGamePackage getChessGamePackage()
  {
    return (ChessGamePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ChessGamePackage getPackage()
  {
    return ChessGamePackage.eINSTANCE;
  }

} //ChessGameFactoryImpl
