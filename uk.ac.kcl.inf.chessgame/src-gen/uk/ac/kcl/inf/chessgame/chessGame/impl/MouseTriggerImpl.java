/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.chessgame.chessGame.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.kcl.inf.chessgame.chessGame.ChessGamePackage;
import uk.ac.kcl.inf.chessgame.chessGame.MouseTrigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mouse Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.chessgame.chessGame.impl.MouseTriggerImpl#isMouse <em>Mouse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MouseTriggerImpl extends MinimalEObjectImpl.Container implements MouseTrigger
{
  /**
   * The default value of the '{@link #isMouse() <em>Mouse</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMouse()
   * @generated
   * @ordered
   */
  protected static final boolean MOUSE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMouse() <em>Mouse</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMouse()
   * @generated
   * @ordered
   */
  protected boolean mouse = MOUSE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MouseTriggerImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ChessGamePackage.Literals.MOUSE_TRIGGER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isMouse()
  {
    return mouse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMouse(boolean newMouse)
  {
    boolean oldMouse = mouse;
    mouse = newMouse;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChessGamePackage.MOUSE_TRIGGER__MOUSE, oldMouse, mouse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ChessGamePackage.MOUSE_TRIGGER__MOUSE:
        return isMouse();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ChessGamePackage.MOUSE_TRIGGER__MOUSE:
        setMouse((Boolean)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ChessGamePackage.MOUSE_TRIGGER__MOUSE:
        setMouse(MOUSE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ChessGamePackage.MOUSE_TRIGGER__MOUSE:
        return mouse != MOUSE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (mouse: ");
    result.append(mouse);
    result.append(')');
    return result.toString();
  }

} //MouseTriggerImpl
