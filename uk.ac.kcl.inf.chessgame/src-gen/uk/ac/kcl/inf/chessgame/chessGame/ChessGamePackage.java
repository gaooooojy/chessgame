/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.chessgame.chessGame;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.chessgame.chessGame.ChessGameFactory
 * @model kind="package"
 * @generated
 */
public interface ChessGamePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "chessGame";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ac.uk/kcl/inf/chessgame/ChessGame";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "chessGame";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ChessGamePackage eINSTANCE = uk.ac.kcl.inf.chessgame.chessGame.impl.ChessGamePackageImpl.init();

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.chessgame.chessGame.impl.ChessProgramImpl <em>Chess Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.chessgame.chessGame.impl.ChessProgramImpl
   * @see uk.ac.kcl.inf.chessgame.chessGame.impl.ChessGamePackageImpl#getChessProgram()
   * @generated
   */
  int CHESS_PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHESS_PROGRAM__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Chess Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHESS_PROGRAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.chessgame.chessGame.impl.StatementsImpl <em>Statements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.chessgame.chessGame.impl.StatementsImpl
   * @see uk.ac.kcl.inf.chessgame.chessGame.impl.ChessGamePackageImpl#getStatements()
   * @generated
   */
  int STATEMENTS = 1;

  /**
   * The number of structural features of the '<em>Statements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENTS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.chessgame.chessGame.impl.widthImpl <em>width</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.chessgame.chessGame.impl.widthImpl
   * @see uk.ac.kcl.inf.chessgame.chessGame.impl.ChessGamePackageImpl#getwidth()
   * @generated
   */
  int WIDTH = 2;

  /**
   * The feature id for the '<em><b>WIDTH</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDTH__WIDTH = STATEMENTS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>width</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDTH_FEATURE_COUNT = STATEMENTS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.chessgame.chessGame.impl.heightImpl <em>height</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.chessgame.chessGame.impl.heightImpl
   * @see uk.ac.kcl.inf.chessgame.chessGame.impl.ChessGamePackageImpl#getheight()
   * @generated
   */
  int HEIGHT = 3;

  /**
   * The feature id for the '<em><b>HEIGHT</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEIGHT__HEIGHT = STATEMENTS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>height</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEIGHT_FEATURE_COUNT = STATEMENTS_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.chessgame.chessGame.ChessProgram <em>Chess Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chess Program</em>'.
   * @see uk.ac.kcl.inf.chessgame.chessGame.ChessProgram
   * @generated
   */
  EClass getChessProgram();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.chessgame.chessGame.ChessProgram#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see uk.ac.kcl.inf.chessgame.chessGame.ChessProgram#getStatements()
   * @see #getChessProgram()
   * @generated
   */
  EReference getChessProgram_Statements();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.chessgame.chessGame.Statements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statements</em>'.
   * @see uk.ac.kcl.inf.chessgame.chessGame.Statements
   * @generated
   */
  EClass getStatements();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.chessgame.chessGame.width <em>width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>width</em>'.
   * @see uk.ac.kcl.inf.chessgame.chessGame.width
   * @generated
   */
  EClass getwidth();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.chessgame.chessGame.width#getWIDTH <em>WIDTH</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>WIDTH</em>'.
   * @see uk.ac.kcl.inf.chessgame.chessGame.width#getWIDTH()
   * @see #getwidth()
   * @generated
   */
  EAttribute getwidth_WIDTH();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.chessgame.chessGame.height <em>height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>height</em>'.
   * @see uk.ac.kcl.inf.chessgame.chessGame.height
   * @generated
   */
  EClass getheight();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.chessgame.chessGame.height#getHEIGHT <em>HEIGHT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>HEIGHT</em>'.
   * @see uk.ac.kcl.inf.chessgame.chessGame.height#getHEIGHT()
   * @see #getheight()
   * @generated
   */
  EAttribute getheight_HEIGHT();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ChessGameFactory getChessGameFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.chessgame.chessGame.impl.ChessProgramImpl <em>Chess Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.chessgame.chessGame.impl.ChessProgramImpl
     * @see uk.ac.kcl.inf.chessgame.chessGame.impl.ChessGamePackageImpl#getChessProgram()
     * @generated
     */
    EClass CHESS_PROGRAM = eINSTANCE.getChessProgram();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHESS_PROGRAM__STATEMENTS = eINSTANCE.getChessProgram_Statements();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.chessgame.chessGame.impl.StatementsImpl <em>Statements</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.chessgame.chessGame.impl.StatementsImpl
     * @see uk.ac.kcl.inf.chessgame.chessGame.impl.ChessGamePackageImpl#getStatements()
     * @generated
     */
    EClass STATEMENTS = eINSTANCE.getStatements();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.chessgame.chessGame.impl.widthImpl <em>width</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.chessgame.chessGame.impl.widthImpl
     * @see uk.ac.kcl.inf.chessgame.chessGame.impl.ChessGamePackageImpl#getwidth()
     * @generated
     */
    EClass WIDTH = eINSTANCE.getwidth();

    /**
     * The meta object literal for the '<em><b>WIDTH</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WIDTH__WIDTH = eINSTANCE.getwidth_WIDTH();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.chessgame.chessGame.impl.heightImpl <em>height</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.chessgame.chessGame.impl.heightImpl
     * @see uk.ac.kcl.inf.chessgame.chessGame.impl.ChessGamePackageImpl#getheight()
     * @generated
     */
    EClass HEIGHT = eINSTANCE.getheight();

    /**
     * The meta object literal for the '<em><b>HEIGHT</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEIGHT__HEIGHT = eINSTANCE.getheight_HEIGHT();

  }

} //ChessGamePackage