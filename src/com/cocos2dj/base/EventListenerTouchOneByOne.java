package com.cocos2dj.base;

import com.badlogic.gdx.utils.Array;
import com.cocos2dj.macros.CCLog;

public class EventListenerTouchOneByOne extends EventListener {

	public static final String LISTENER_ID = "__cc_touch_one_by_one";
	
	public static interface TouchCallback {
		public boolean onTouchBegan(Touch touch, Event event);
		public void onTouchMoved(Touch touch, Event event);
		public void onTouchEnded(Touch touch, Event event);
		public void onTouchCancelled(Touch touch, Event event);
		
		public static TouchCallback NULL = new TouchCallback() {
			public boolean onTouchBegan(Touch touch, Event event) {return false;}
			public void onTouchMoved(Touch touch, Event event) {}
			public void onTouchEnded(Touch touch, Event event) {}
			public void onTouchCancelled(Touch touch, Event event) {}
		};
	}
	
	public static EventListenerTouchOneByOne create() {
		EventListenerTouchOneByOne ret = new EventListenerTouchOneByOne();
		ret.init();
		return ret;
	}
    
    /** Whether or not to swall touches.
     *
     * @param needSwallow True if needs to swall touches.
     */
    public void setSwallowTouches(boolean needSwallow) {
    	_needSwallow = needSwallow;
    }
    
    /** Is swall touches or not.
     *
     * @return True if needs to swall touches.
     */
    public boolean isSwallowTouches() {
    	return _needSwallow;
    }
    
    /// Overrides
//    virtual EventListenerTouchOneByOne* clone() override;
//    virtual bool checkAvailable() override;
    
    
    public boolean onTouchBegan(Touch touch, Event event) {
    	return _callback.onTouchBegan(touch, event);
    }
	public void onTouchMoved(Touch touch, Event event) {
		_callback.onTouchMoved(touch, event);
	}
	public void onTouchEnded(Touch touch, Event event) {
		_callback.onTouchEnded(touch, event);
	}
	public void onTouchCancelled(Touch touch, Event event) {
		_callback.onTouchCancelled(touch, event);
	}

    private TouchCallback _callback = TouchCallback.NULL;
    public void setTouchCallback(TouchCallback callback) {
    	_callback = callback == null ? TouchCallback.NULL : callback;
    }
	
    @Override
    public boolean checkAvailable() {
        // EventDispatcher will use the return value of 'onTouchBegan' to determine whether to pass following 'move', 'end'
        // message to 'EventListenerTouchOneByOne' or not. So 'onTouchBegan' needs to be set.
        if (_callback == null) {
            CCLog.error("EventListenerTouchOneByOne", "Invalid EventListenerTouchOneByOne!");
            return false;
        }
        return true;
    }
    
//CC_CONSTRUCTOR_ACCESS:
    public EventListenerTouchOneByOne() {
    	
    }
    
    boolean init() {
    	if(super.init(Type.TOUCH_ONE_BY_ONE, LISTENER_ID, null)) {
    		return true;
    	}
    	return false;	
    }
    
    Array<Touch> _claimedTouches = new Array<Touch>(2);
    boolean _needSwallow;
}
