package com.cocos2dj.ui;

import com.badlogic.gdx.math.Matrix4;
import com.cocos2dj.base.Event;
import com.cocos2dj.base.EventListenerTouchOneByOne;
import com.cocos2dj.base.Size;
import com.cocos2dj.base.Touch;
import com.cocos2dj.renderer.Renderer;
import com.cocos2dj.s2d.Camera;
import com.cocos2dj.s2d.Node;
import com.cocos2dj.s2d.ProtectedNode;
import com.cocos2dj.ui.LayoutParameter.ILayoutParameter;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

public class Widget extends ProtectedNode implements ILayoutParameter {

//	@Override
//	public LayoutParameter getLayoutParameter() {
//		return null;
//	}

	 /**
     * Widget position type for layout.
     */
    public static enum PositionType {
        ABSOLUTE,
        PERCENT
    }
    
    /**
     * Widget size type for layout.
     */
    public static enum SizeType {
        ABSOLUTE,
        PERCENT
    }
    
    /**
     * Touch event type.
     */
    public static enum TouchEventType {
        BEGAN,
        MOVED,
        ENDED,
        CANCELED
    }
    
    /**
     * Texture resource type.
     * - LOCAL:  It means the texture is loaded from image.
     * - PLIST: It means the texture is loaded from texture atlas.
     */
    public static enum TextureResType {
        LOCAL,
        PLIST
    }
    
    /**
     * Widget bright style.
     */
    public static enum BrightStyle {
        NONE,
        NORMAL,
        HIGHLIGHT
    }
    
    /**
     * Widget touch event callback.
     */
    public static interface WidgetTouchCallback {
    	public void callback(Object ref, TouchEventType type);
    }
    /**
     * Widget click event callback.
     */
    public static interface WidgetClickCallback {
    	public void callback(Object ref);
    }
//    typedef std::function<void(Ref*)> ccWidgetClickCallback;
    /**
     * Widget custom event callback.
     * It is mainly used together with Cocos Studio.
     */
    public static interface WidgetEventCallback {
    	public void callback(Object ref, int event);
    }
//    typedef std::function<void(Ref*, int)> ccWidgetEventCallback;
    
    
    /**
     * Create and return a empty Widget instance pointer.
     */
    public static Widget create() {
    	
    }

    /**
     * Sets whether the widget is enabled
     * true if the widget is enabled, widget may be touched , false if the widget is disabled, widget cannot be touched.
     * Note: If you want to change the widget's appearance  to disabled state, you should also call  `setBright(false)`.
     * The default value is true, a widget is default to enable touch.
     * @param enabled Set to true to enable touch, false otherwise.
     */
     public void setEnabled(boolean enabled) {
    	 
     }

    /**
     * Determines if the widget is enabled or not.
     * @return true if the widget is enabled, false if the widget is disabled.
     */
    public boolean isEnabled() {
    	
    }

    /**
     * Sets whether the widget is bright
     *
     * The default value is true, a widget is default to bright
     *
     * @param bright   true if the widget is bright, false if the widget is dark.
     */
    public void setBright(boolean bright) {
    	
    }

    /**
     * Determines if the widget is bright
     *
     * @return true if the widget is bright, false if the widget is dark.
     */
    public boolean isBright() {
    	
    }

    /**
     * Sets whether the widget is touch enabled.
     *
     * The default value is false, a widget is default to touch disabled.
     *
     * @param enabled   True if the widget is touch enabled, false if the widget is touch disabled.
     */
     public void setTouchEnabled(boolean enabled) {
    	 
     }

    /**
     * To set the bright style of widget.
     *
     * @see BrightStyle
     *
     * @param style   BrightStyle::NORMAL means the widget is in normal state, BrightStyle::HIGHLIGHT means the widget is in highlight state.
     */
    public void setBrightStyle(BrightStyle style) {
    	
    }

    /**
     * Determines if the widget is touch enabled
     *
     * @return true if the widget is touch enabled, false if the widget is touch disabled.
     */
    public boolean isTouchEnabled() {
    	
    }

    /**
     * Determines if the widget is highlighted
     *
     * @return true if the widget is highlighted, false if the widget is not highlighted.
     */
    public boolean isHighlighted() {
    	
    }

    /**
     * Sets whether the widget is highlighted
     *
     * The default value is false, a widget is default to not highlighted
     *
     * @param highlight   true if the widget is highlighted, false if the widget is not highlighted.
     */
    public void setHighlighted(boolean highlight) {
    	
    }

    /**
     * Gets the left boundary position of this widget in parent's coordination system.
     * @return The left boundary position of this widget.
     */
    public float getLeftBoundary() {
    	
    }
    
    /**
     * Gets the bottom boundary position of this widget in parent's coordination system.
     * @return The bottom boundary position of this widget.
     */
    public float getBottomBoundary() {
    	
    }

    /**
     * Gets the right boundary position of this widget in parent's coordination system.
     * @return The right boundary position of this widget.
     */
    public float getRightBoundary() {
    	
    }

    /**
     * Gets the top boundary position of this widget in parent's coordination system.
     * @return The top boundary position of this widget.
     */
    public float getTopBoundary() {
    	
    }

    /**
     * @js NA
     */
     public void visit(Renderer renderer,  Matrix4 parentTransform, int parentFlags) {
    	 
     }

    /**
     * Set a callback to touch vent listener.
     *@param callback  The callback in `ccWidgetEventCallback.`
     */
    public void addTouchEventListener(WidgetTouchCallback callback) {
    	
    }
    
    /**
     * Set a click event handler to the widget.
     * @param callback The callback in `ccWidgetClickCallback`.
     */
    public void addClickEventListener(WidgetClickCallback callback) {
    	
    }
    /**
     * Set a event handler to the widget in order to use cocostudio editor and framework
     * @param callback The callback in `ccWidgetEventCallback`.
     * @lua NA
     */
     public void addCCSEventListener(WidgetEventCallback callback) {
    	 
     }
    /**/

    /**
     * Changes the position (x,y) of the widget in OpenGL coordinates
     *
     * Usually we use p(x,y) to compose a Vector2 object.
     * The original point (0,0) is at the left-bottom corner of screen.
     *
     * @param pos  The position (x,y) of the widget in OpenGL coordinates
     */
     public void setPosition( Vector2 pos) {
    	 
     }

    /**
     * Set the percent(x,y) of the widget in OpenGL coordinates
     *
     * @param percent  The percent (x,y) of the widget in OpenGL coordinates
     */
    public void setPositionPercent(Vector2 percent) {
    	
    }

    /**
     * Gets the percent (x,y) of the widget in OpenGL coordinates
     *
     * @see setPosition( Vector2)
     *
     * @return The percent (x,y) of the widget in OpenGL coordinates
     */
     public Vector2 getPositionPercent() {
    	 
     }

    /**
     * Changes the position type of the widget
     *
     * @see `PositionType`
     *
     * @param type  the position type of widget
     */
    public void setPositionType(PositionType type) {
    	
    }

    /**
     * Gets the position type of the widget
     *
     * @see `PositionType`
     *
     * @return type  the position type of widget
     */
    public PositionType getPositionType() {
    	
    }

    /**
     * Sets whether the widget should be flipped horizontally or not.
     *
     * @param flippedX true if the widget should be flipped horizontally, false otherwise.
     */
     public void setFlippedX(boolean flippedX) {
    	 
     }

    /**
     * Returns the flag which indicates whether the widget is flipped horizontally or not.
     *
     * It not only flips the texture of the widget, but also the texture of the widget's children.
     * Also, flipping relies on widget's anchor point.
     * Internally, it just use setScaleX(-1) to flip the widget.
     *
     * @return true if the widget is flipped horizontally, false otherwise.
     */
     public boolean isFlippedX(){return _flippedX;}

    /**
     * Sets whether the widget should be flipped vertically or not.
     *
     * @param flippedY true if the widget should be flipped vertically, false otherwise.
     */
     public void setFlippedY(boolean flippedY) {
    	 
     }

    /**
     * Return the flag which indicates whether the widget is flipped vertically or not.
     *
     * It not only flips the texture of the widget, but also the texture of the widget's children.
     * Also, flipping relies on widget's anchor point.
     * Internally, it just use setScaleY(-1) to flip the widget.
     *
     * @return true if the widget is flipped vertically, false otherwise.
     */
     public boolean isFlippedY(){return _flippedY;};

    /** @deprecated Use isFlippedX() instead */
    public boolean isFlipX() { return isFlippedX(); };
    /** @deprecated Use setFlippedX() instead */
    public void setFlipX(boolean flipX) { setFlippedX(flipX); };
    /** @deprecated Use isFlippedY() instead */
    public boolean isFlipY() { return isFlippedY(); };
    /** @deprecated Use setFlippedY() instead */
    public void setFlipY(boolean flipY) { setFlippedY(flipY); };

    //override the setScale function of Node
     public void setScaleX(float scaleX) {
    	 
     }
     public void setScaleY(float scaleY) {
    	 
     }
     public void setScale(float scale) {
    	 
     }
     public void setScale(float scalex, float scaley) {
    	 
     }
//    using Node::setScaleZ;
     public float getScaleX() {
    	 
     }
     public float getScaleY() {
    	 
     }
     public float getScale() {
    	 
     }
//    using Node::getScaleZ;
    
    /**
     * Checks a point if in parent's area.
     *
     * @param pt A point in `Vector2`.
     * @return true if the point is in parent's area, false otherwise.
     */
    public boolean isClippingParentContainsPoint( Vector2 pt) {
    	
    }

    /**
     * Gets the touch began point of widget when widget is selected.
     * @return the touch began point.
     */
     public Vector2 getTouchBeganPosition() {
    	 
     }

    /*
     * Gets the touch move point of widget when widget is selected.
     * @return the touch move point.
     */
     public Vector2 getTouchMovePosition() {
    	 
     }

    /*
     * Gets the touch end point of widget when widget is selected.
     * @return the touch end point.
     */
     public Vector2 getTouchEndPosition() {
    	 
     }
     
    /**
     * Changes the size that is widget's size
     * @param contentSize A content size in `Size`.
     */
     public void setContentSize( Size contentSize) {
    	 
     }

    /**
     * Changes the percent that is widget's percent size
     *
     * @param percent that is widget's percent size
     */
     public void setSizePercent( Vector2 percent) {
    	 
     }

    /**
     * Changes the size type of widget.
     *
     * @see `SizeType`
     *
     * @param type that is widget's size type
     */
    public void setSizeType(SizeType type) {
    	
    }

    /**
     * Gets the size type of widget.
     *
     * @see `SizeType`
     */
    public SizeType getSizeType() {
    	
    }

//    /**
//     * Get the size of widget
//     *
//     * @return Widget content size.
//     */
//    CC_DEPRECATED_ATTRIBUTE  Size getSize() ;
    
    /**
     * Get the user defined widget size.
     *@return User defined size.
     */
     public Size getCustomSize() {
    	 
     }
    
    /**
     * Get the content size of widget.
     * @warning This API exists mainly for keeping back compatibility.
     * @return 
     */
     public Size getLayoutSize() {return _contentSize;}

    /**
     * Get size percent of widget.
     *
     * @return Percent size.
     */
     public Vector2 getSizePercent() {
    	 
     }

    /**
     * Checks a point is in widget's content space.
     * This function is used for determining touch area of widget.
     *
     * @param pt        The point in `Vector2`.
     * @param camera    The camera look at widget, used to convert GL screen point to near/far plane.
     * @param p         Point to a Vec3 for store the intersect point, if don't need them set to nullptr.
     * @return true if the point is in widget's content space, false otherwise.
     */
     public boolean hitTest( Vector2 pt,  Camera camera, Vector3 p) {
    	 
     }

    /**
     * A callback which will be called when touch began event is issued.
     *@param touch The touch info.
     *@param unusedEvent The touch event info.
     *@return True if user want to handle touches, false otherwise.
     */
     public boolean onTouchBegan(Touch touch, Event unusedEvent){
    	 
     }

    /**
     * A callback which will be called when touch moved event is issued.
     *@param touch The touch info.
     *@param unusedEvent The touch event info.
     */
     public void onTouchMoved(Touch touch, Event unusedEvent) {
    	 
     }

    /**
     * A callback which will be called when touch ended event is issued.
     *@param touch The touch info.
     *@param unusedEvent The touch event info.
     */
     public void onTouchEnded(Touch touch, Event unusedEvent) {
    	 
     }

    /**
     * A callback which will be called when touch cancelled event is issued.
     *@param touch The touch info.
     *@param unusedEvent The touch event info.
     */
     public void onTouchCancelled(Touch touch, Event unusedEvent) {
    	 
     }

    /**
     * Sets a LayoutParameter to widget.
     *
     * @see LayoutParameter
     * @param parameter LayoutParameter pointer
     */
    public void setLayoutParameter(LayoutParameter parameter) {
    	
    }

    /**
     * Gets LayoutParameter of widget.
     *
     * @see LayoutParameter
     * @return LayoutParameter
//     */
    public LayoutParameter getLayoutParameter() {
    	
    }
    /**
     * Gets LayoutParameter of widget.
     *
     * @see LayoutParameter
     * @deprecated use `getLayoutParameter()` instead.
     * @param type  Relative or Linear
     * @return LayoutParameter
     */
//    CC_DEPRECATED_ATTRIBUTE LayoutParameter* getLayoutParameter(LayoutParameter::Type type);


    /**
     * Toggle whether ignore user defined content size for widget.
     * Set true will ignore user defined content size which means 
     * the widget size is always equal to the return value of `getRendererSize`.
     *
     * @param ignore set member variable _ignoreSize to ignore
     */
     public void ignoreContentAdaptWithSize(boolean ignore) {
    	 
     }

    /**
     * Query whether the widget ignores user defined content size or not
     *
     * @return True means ignore user defined content size, false otherwise.
     */
    public boolean isIgnoreContentAdaptWithSize() {
    	
    }

    /**
     * Gets position of widget in world space.
     *
     * @return Position of widget in world space.
     */
    public Vector2 getWorldPosition() {
    	
    }

    /**
     * Gets the inner Renderer node of widget.
     *
     * For example, a button's  Renderer is it's texture renderer.
     *
     * @return Node pointer.
     */
     public Node getRenderer() {
    	 
     }


    /**
     *  Get the  renderer's size
     *@return Widget  renderer size.
     */
     public Size getRendererSize() {
    	 
     }
    

    /**
     * Returns the string representation of widget class name
     * @return get the class description.
     */
     public String getDescription() {
    	 
     }

    /**
     * Create a new widget copy of the original one.
     * @return A cloned widget copy of original.
     */
    public Widget copy() {
    	
    }
    /**
     * @lua NA
     */
     public void onEnter() {
    	 
     }
    
    /**
     * @lua NA
     */
     public void onExit() {
    	 
     }

    /**
     * Update all children's contents size and position recursively.
     * @see `updateSizeAndPosition( Size)`
     */
    public void updateSizeAndPosition() {
    	
    }

    /**
     * Update all children's contents size and position recursively.
     */
    public void updateSizeAndPosition( Size parentSize) {
    	
    }
    
    /**
     * Set the tag of action.
     *@param tag  A integer tag value.
     */
    public void setActionTag(int tag) {
    	
    }

    /**
     * Get the action tag.
     *@return Action tag.
     */
    public int getActionTag() {
    	
    }
    
    /**
     * @brief Allow widget touch events to propagate to its parents. Set false will disable propagation
     * @param isPropagate  True to allow propagation, false otherwise.
     * @since v3.3
     */
    public void setPropagateTouchEvents(boolean isPropagate) {
    	
    }
    
    /**
     * Return whether the widget is propagate touch events to its parents or not
     * @return whether touch event propagation is allowed or not.
     * @since v3.3
     */
     
    public boolean isPropagateTouchEvents() {
    	
    }
    
    /**
     * Toggle widget swallow touch option.
     * @brief Specify widget to swallow touches or not
     * @param swallow True to swallow touch, false otherwise.
     * @since v3.3
     */
    public void setSwallowTouches(boolean swallow) {
    	
    }
    
    /**
     * Return whether the widget is swallowing touch or not
     * @return Whether touch is swallowed.
     * @since v3.3
     */
    public boolean isSwallowTouches() {
    	
    }
    
    /**
     * Query whether widget is focused or not.
     *@return  whether the widget is focused or not
     */
    public boolean isFocused() {
    	
    }
    
    /**
     * Toggle widget focus status.
     *@param focus  pass true to let the widget get focus or pass false to let the widget lose focus
     *@return void
     */
    public void setFocused(boolean focus) {
    	
    }
    
    /**
     * Query widget's focus enable state.
     *@return true represent the widget could accept focus, false represent the widget couldn't accept focus
     */
    public boolean isFocusEnabled() {
    	
    }
    
    /**
     * Allow widget to accept focus.
     *@param enable pass true/false to enable/disable the focus ability of a widget
     *@return void
     */
    public void setFocusEnabled(boolean enable) {
    	
    }
    
    /**
     *  When a widget is in a layout, you could call this method to get the next focused widget within a specified direction. 
     *  If the widget is not in a layout, it will return itself
     *@param direction the direction to look for the next focused widget in a layout
     *@param current  the current focused widget
     *@return the next focused widget in a layout
     */
     public Widget findNextFocusedWidget(FocusDirection direction, Widget current) {
    	 
     }
    
    /**
     * when a widget calls this method, it will get focus immediately.
     */
    public void requestFocus() {
    	
    }

    /**
     * Return a current focused widget in your UI scene.
     * No matter what widget object you call this method on , it will return you the exact one focused widget.
     * @param isWidget  if your set isWidget to true, it will return the _realFocusedWidget which is always a widget
     *                  otherwise, it will return a widget or a layout.
     * @deprecated use `getCurrentFocusedWidget` instead.
     */
//    CC_DEPRECATED_ATTRIBUTE Widget getCurrentFocusedWidget(boolean isWidget){
//        CC_UNUSED_PARAM(isWidget);
//        return getCurrentFocusedWidget();
//    }

    /**
     * Return a current focused widget in your UI scene.
     * No matter what widget object you call this method on , it will return you the exact one focused widget.
     */
    public static Widget getCurrentFocusedWidget() {
    	
    }

    /*
     *  Call this method with parameter true to enable the Android Dpad focus navigation feature
     *@param enable  set true to enable dpad focus navigation, otherwise disenable dpad focus navigation
     */
    public static void enableDpadNavigation(boolean enable) {
    	
    }

    
    public static interface OnFousChangedCallback {
    	
    }
    
    public static interface OnNextFocusedWidgetCallback {
    	
    }
    
    /**
     * When a widget lose/get focus, this method will be called. Be Caution when you provide your own version, 
     * you must call widget->setFocused(true/false) to change the focus state of the current focused widget;
     */
    OnFousChangedCallback onFousChanged;
    
//    std::function<void(Widget,Widget)> onFocusChanged;

    /**
     * use this function to manually specify the next focused widget regards to each direction
     */
//    std::function<Widget(FocusDirection)> onNextFocusedWidget;
    OnNextFocusedWidgetCallback onNextFocusedWidget;
    
    /**
     *Toggle use unify size.
     *@param enable True to use unify size, false otherwise.
     *@return void
     */
    public void setUnifySizeEnabled(boolean enable) {
    	
    }

    /**
     * Query whether unify size enable state. 
     *@return true represent the widget use Unify Size, false represent the widget couldn't use Unify Size
     */
    public boolean isUnifySizeEnabled() {
    	
    }

    /**
     * Set callback name.
     *@param callbackName A string representation of callback name.
     */
    public void setCallbackName( String callbackName) { _callbackName = callbackName; }


    /**
     * Query callback name.
     *@return The callback name.
     */
    public String getCallbackName() { return _callbackName; }
    
    /**
     * Set callback type.
     * @param callbackType A string representation of callback type.
     */
    public void setCallbackType( String callbackType) { _callbackType = callbackType; }

    /**
     * Query callback type.
     *@return Callback type string.
     */
     public String getCallbackType() { return _callbackType; }

    /**
     * Toggle layout component enable.
     *@param enable Layout Component of a widget
     *@return void
     */
    public void setLayoutComponentEnabled(boolean enable) {
    	
    }

    /**
     * Query whether layout component is enabled or not. 
     *@return true represent the widget use Layout Component, false represent the widget couldn't use Layout Component.
     */
    public boolean isLayoutComponentEnabled() {
    	
    }

    //initializes state of widget.
    public void init() {
    	
    }

    /*
     * @brief Sends the touch event to widget's parent, if a widget wants to handle touch event under another widget, 
     *        it must override this function.
     * @param  event  the touch event type, it could be BEGAN/MOVED/CANCELED/ENDED
     * @param parent
     * @param point
     */
    public void interceptTouchEvent(TouchEventType event, Widget sender, Touch touch) {
    	
    }
    
    /**
     *@brief Propagate touch events to its parents
     */
    public void propagateTouchEvent(TouchEventType event, Widget sender, Touch touch) {
    	
    }
    
    /**
     * This method is called when a focus change event happens
     *@param widgetLostFocus  The widget which lose its focus
     *@param widgetGetFocus  The widget which get its focus
     *@return void
     */
    public void onFocusChange(Widget widgetLostFocus, Widget widgetGetFocus) {
    	
    }
    
    /**
     * Dispatch a EventFocus through a EventDispatcher
     *@param widgetLoseFocus  The widget which lose its focus
     *@param widgetGetFocus he widget which get its focus
     *@return void
     */
    public void  dispatchFocusEvent(Widget widgetLoseFocus, Widget widgetGetFocus) {
    	
    }
    
//    /**
//     * Get a normal state GLProgramState
//     *@since v3.4
//     */
//	protected GLProgramState getNormalGLProgramState() {
//    	
//    }
//    
//    /**
//     * Get a disabled state GLProgramState
//     *@since v3.4
//     */
//    protected GLProgramState getGrayGLProgramState() {
//    	
//    }
     
    
    //call back function called when size changed.
    protected void onSizeChanged() {}
    //initializes renderer of widget.
    protected void initRenderer() {}
    //call back function called widget's state changed to normal.
    protected void onPressStateChangedToNormal() {}
    //call back function called widget's state changed to selected.
    protected void onPressStateChangedToPressed() {}
    //call back function called widget's state changed to dark.
    protected void onPressStateChangedToDisabled() {}

    protected void pushDownEvent() {}
    protected void moveEvent() {}

    protected void releaseUpEvent() {}
    protected void cancelUpEvent() {}

    
    protected void adaptRenderers(){}
    protected void updateChildrenDisplayedRGBA() {}
    
    protected void copyProperties(Widget model) {}
    protected Widget createCloneInstance() {}
    protected void copySpecialProperties(Widget model) {}
    protected void copyClonedWidgetChildren(Widget model) {}
    
    protected Widget getWidgetParent() {}
    protected void updateContentSizeWithTextureSize( Size size) {}
    
    protected boolean isAncestorsEnabled() {}
    protected Widget getAncensterWidget(Node node) {}
    protected boolean isAncestorsVisible(Node node) {}

    protected void cleanupWidget() {
    	
    }
    protected LayoutComponent getOrCreateLayoutComponent() {
    	
    }

    protected boolean _usingLayoutComponent;
    protected boolean _unifySize;
    protected boolean _enabled;
    protected boolean _bright;
    protected boolean _touchEnabled;
    protected boolean _highlight;
    protected boolean _affectByClipping;
    protected boolean _ignoreSize;
    protected boolean _propagateTouchEvents;

    protected BrightStyle _brightStyle;
    protected SizeType _sizeType;
    protected PositionType _positionType;

    //used for search widget by action tag in UIHelper class
    protected int _actionTag;

    protected Size _customSize;

    protected Vector2 _sizePercent;
    protected Vector2 _positionPercent;

    protected boolean _hitted;
    // weak reference of the camera which made the widget passed the hit test when response touch begin event
    // it's useful in the next touch move/end events
    protected Camera _hittedByCamera;
    protected EventListenerTouchOneByOne _touchListener;
    protected Vector2 _touchBeganPosition;
    protected Vector2 _touchMovePosition;
    protected Vector2 _touchEndPosition;

    protected boolean _flippedX;
    protected boolean _flippedY;

    //use map to enable switch back and forth for user layout parameters
    //TODO ?
//    protected Map<int,LayoutParameter*> _layoutParameterDictionary;
//    protected LayoutParameter::Type _layoutParameterType;

    protected boolean _focused;
    protected boolean _focusEnabled;
    /**
     * store the only one focused widget
     */
    protected static Widget _focusedWidget;  //both layout  widget will be stored in this variable

//    Ref*       _touchEventListener;
//    #if defined(__GNUC__)  ((__GNUC__ >= 4) || ((__GNUC__ == 3)  (__GNUC_MINOR__ >= 1)))
//    #pragma GCC diagnostic ignored "-Wdeprecated-declarations"
//    #elif _MSC_VER >= 1400 //vs 2005 or higher
//    #pragma warning (push)
//    #pragma warning (disable: 4996)
//    #endif
//    SEL_TouchEvent    _touchEventSelector;
//    #if defined(__GNUC__)  ((__GNUC__ >= 4) || ((__GNUC__ == 3)  (__GNUC_MINOR__ >= 1)))
//    #pragma GCC diagnostic warning "-Wdeprecated-declarations"
//    #elif _MSC_VER >= 1400 //vs 2005 or higher
//    #pragma warning (pop)
//    #endif
    protected Object _touchEventListener;
    protected WidgetTouchCallback _touchEventCallback;
    protected WidgetClickCallback _clickEventListener;
    protected WidgetEventCallback _ccEventCallback;
    
    String _callbackType;
    String _callbackName;
    
    
    private static FocusNavigationController _focusNavigationController;
}
