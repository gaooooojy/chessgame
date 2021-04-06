/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.chessgame.chessGame.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.kcl.inf.chessgame.chessGame.CellDisplay;
import uk.ac.kcl.inf.chessgame.chessGame.CellExpression;
import uk.ac.kcl.inf.chessgame.chessGame.CellState;
import uk.ac.kcl.inf.chessgame.chessGame.ChessGameFactory;
import uk.ac.kcl.inf.chessgame.chessGame.ChessGamePackage;
import uk.ac.kcl.inf.chessgame.chessGame.ChessProgram;
import uk.ac.kcl.inf.chessgame.chessGame.EmptyExpression;
import uk.ac.kcl.inf.chessgame.chessGame.EndBehaviour;
import uk.ac.kcl.inf.chessgame.chessGame.FieldSpecification;
import uk.ac.kcl.inf.chessgame.chessGame.GameEnd;
import uk.ac.kcl.inf.chessgame.chessGame.MouseTrigger;
import uk.ac.kcl.inf.chessgame.chessGame.OptionSpecification;
import uk.ac.kcl.inf.chessgame.chessGame.StateCheck;
import uk.ac.kcl.inf.chessgame.chessGame.Statements;
import uk.ac.kcl.inf.chessgame.chessGame.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChessGamePackageImpl extends EPackageImpl implements ChessGamePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass chessProgramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optionSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cellStateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cellDisplayEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mouseTriggerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gameEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cellExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateCheckEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emptyExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass endBehaviourEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see uk.ac.kcl.inf.chessgame.chessGame.ChessGamePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ChessGamePackageImpl()
  {
    super(eNS_URI, ChessGameFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link ChessGamePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ChessGamePackage init()
  {
    if (isInited) return (ChessGamePackage)EPackage.Registry.INSTANCE.getEPackage(ChessGamePackage.eNS_URI);

    // Obtain or create and register package
    Object registeredChessGamePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    ChessGamePackageImpl theChessGamePackage = registeredChessGamePackage instanceof ChessGamePackageImpl ? (ChessGamePackageImpl)registeredChessGamePackage : new ChessGamePackageImpl();

    isInited = true;

    // Create package meta-data objects
    theChessGamePackage.createPackageContents();

    // Initialize created meta-data
    theChessGamePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theChessGamePackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ChessGamePackage.eNS_URI, theChessGamePackage);
    return theChessGamePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getChessProgram()
  {
    return chessProgramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getChessProgram_States()
  {
    return (EReference)chessProgramEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStatements()
  {
    return statementsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFieldSpecification()
  {
    return fieldSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getFieldSpecification_Width()
  {
    return (EAttribute)fieldSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getFieldSpecification_Height()
  {
    return (EAttribute)fieldSpecificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getOptionSpecification()
  {
    return optionSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getOptionSpecification_States()
  {
    return (EReference)optionSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCellState()
  {
    return cellStateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCellState_Name()
  {
    return (EAttribute)cellStateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCellState_Display()
  {
    return (EReference)cellStateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCellState_Transitions()
  {
    return (EReference)cellStateEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCellDisplay()
  {
    return cellDisplayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCellDisplay_Text()
  {
    return (EAttribute)cellDisplayEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCellDisplay_Color()
  {
    return (EAttribute)cellDisplayEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTransition()
  {
    return transitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTransition_Trigger()
  {
    return (EReference)transitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTransition_Target()
  {
    return (EReference)transitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMouseTrigger()
  {
    return mouseTriggerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMouseTrigger_Mouse()
  {
    return (EAttribute)mouseTriggerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getGameEnd()
  {
    return gameEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getGameEnd_Name()
  {
    return (EAttribute)gameEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getGameEnd_Action()
  {
    return (EReference)gameEndEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getGameEnd_Behaviour()
  {
    return (EReference)gameEndEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCellExpression()
  {
    return cellExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCellExpression_State()
  {
    return (EReference)cellExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCellExpression_CellState()
  {
    return (EReference)cellExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStateCheck()
  {
    return stateCheckEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getStateCheck_Cell_state()
  {
    return (EReference)stateCheckEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEmptyExpression()
  {
    return emptyExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEndBehaviour()
  {
    return endBehaviourEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getEndBehaviour_Message()
  {
    return (EAttribute)endBehaviourEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ChessGameFactory getChessGameFactory()
  {
    return (ChessGameFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    chessProgramEClass = createEClass(CHESS_PROGRAM);
    createEReference(chessProgramEClass, CHESS_PROGRAM__STATES);

    statementsEClass = createEClass(STATEMENTS);

    fieldSpecificationEClass = createEClass(FIELD_SPECIFICATION);
    createEAttribute(fieldSpecificationEClass, FIELD_SPECIFICATION__WIDTH);
    createEAttribute(fieldSpecificationEClass, FIELD_SPECIFICATION__HEIGHT);

    optionSpecificationEClass = createEClass(OPTION_SPECIFICATION);
    createEReference(optionSpecificationEClass, OPTION_SPECIFICATION__STATES);

    cellStateEClass = createEClass(CELL_STATE);
    createEAttribute(cellStateEClass, CELL_STATE__NAME);
    createEReference(cellStateEClass, CELL_STATE__DISPLAY);
    createEReference(cellStateEClass, CELL_STATE__TRANSITIONS);

    cellDisplayEClass = createEClass(CELL_DISPLAY);
    createEAttribute(cellDisplayEClass, CELL_DISPLAY__TEXT);
    createEAttribute(cellDisplayEClass, CELL_DISPLAY__COLOR);

    transitionEClass = createEClass(TRANSITION);
    createEReference(transitionEClass, TRANSITION__TRIGGER);
    createEReference(transitionEClass, TRANSITION__TARGET);

    mouseTriggerEClass = createEClass(MOUSE_TRIGGER);
    createEAttribute(mouseTriggerEClass, MOUSE_TRIGGER__MOUSE);

    gameEndEClass = createEClass(GAME_END);
    createEAttribute(gameEndEClass, GAME_END__NAME);
    createEReference(gameEndEClass, GAME_END__ACTION);
    createEReference(gameEndEClass, GAME_END__BEHAVIOUR);

    cellExpressionEClass = createEClass(CELL_EXPRESSION);
    createEReference(cellExpressionEClass, CELL_EXPRESSION__STATE);
    createEReference(cellExpressionEClass, CELL_EXPRESSION__CELL_STATE);

    stateCheckEClass = createEClass(STATE_CHECK);
    createEReference(stateCheckEClass, STATE_CHECK__CELL_STATE);

    emptyExpressionEClass = createEClass(EMPTY_EXPRESSION);

    endBehaviourEClass = createEClass(END_BEHAVIOUR);
    createEAttribute(endBehaviourEClass, END_BEHAVIOUR__MESSAGE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    fieldSpecificationEClass.getESuperTypes().add(this.getStatements());
    optionSpecificationEClass.getESuperTypes().add(this.getStatements());
    gameEndEClass.getESuperTypes().add(this.getStatements());

    // Initialize classes and features; add operations and parameters
    initEClass(chessProgramEClass, ChessProgram.class, "ChessProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getChessProgram_States(), this.getStatements(), null, "states", null, 0, -1, ChessProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementsEClass, Statements.class, "Statements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(fieldSpecificationEClass, FieldSpecification.class, "FieldSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFieldSpecification_Width(), ecorePackage.getEInt(), "width", null, 0, 1, FieldSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFieldSpecification_Height(), ecorePackage.getEInt(), "height", null, 0, 1, FieldSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(optionSpecificationEClass, OptionSpecification.class, "OptionSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOptionSpecification_States(), this.getCellState(), null, "states", null, 0, -1, OptionSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cellStateEClass, CellState.class, "CellState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCellState_Name(), ecorePackage.getEString(), "name", null, 0, 1, CellState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCellState_Display(), this.getCellDisplay(), null, "display", null, 0, 1, CellState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCellState_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, CellState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cellDisplayEClass, CellDisplay.class, "CellDisplay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCellDisplay_Text(), ecorePackage.getEString(), "text", null, 0, 1, CellDisplay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCellDisplay_Color(), ecorePackage.getEString(), "color", null, 0, 1, CellDisplay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransition_Trigger(), this.getMouseTrigger(), null, "trigger", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransition_Target(), this.getCellState(), null, "target", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mouseTriggerEClass, MouseTrigger.class, "MouseTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMouseTrigger_Mouse(), ecorePackage.getEBoolean(), "mouse", null, 0, 1, MouseTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(gameEndEClass, GameEnd.class, "GameEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGameEnd_Name(), ecorePackage.getEString(), "name", null, 0, 1, GameEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGameEnd_Action(), this.getCellExpression(), null, "action", null, 0, 1, GameEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGameEnd_Behaviour(), this.getEndBehaviour(), null, "behaviour", null, 0, 1, GameEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cellExpressionEClass, CellExpression.class, "CellExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCellExpression_State(), this.getStateCheck(), null, "state", null, 0, 1, CellExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCellExpression_CellState(), this.getEmptyExpression(), null, "cellState", null, 0, 1, CellExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateCheckEClass, StateCheck.class, "StateCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStateCheck_Cell_state(), this.getCellState(), null, "cell_state", null, 0, 1, StateCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(emptyExpressionEClass, EmptyExpression.class, "EmptyExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(endBehaviourEClass, EndBehaviour.class, "EndBehaviour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEndBehaviour_Message(), ecorePackage.getEString(), "message", null, 0, 1, EndBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //ChessGamePackageImpl
