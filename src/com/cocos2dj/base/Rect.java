package com.cocos2dj.base;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;


public class Rect extends Rectangle {
	
	private static final long serialVersionUID = -3855101754113979241L;
	private static final Rect _rect = new Rect();
	/**
	 * 值传递使用的Rect 返回一个静态Rect
	 */
	public static Rect Get(float x, float y, float w, float h) {
		return (Rect) _rect.set(x, y, w, h);
	}
	
	
	public Rect() {
		super();
	}
	
    /**
     * @js NA
     */
	public Rect(float x, float y, float width, float height) {
		super(x, y, width, height);
	}
	
    /**
     * @js NA
     * @lua NA
     */
	public Rect(Rect other) {
		super(other);
	}
	
	public Rect(Rectangle other) {
		super(other);
	}
	
	
    /**
     * @js NA
     * @lua NA
     */
	public void setRect(float x, float y, float width, float height) {
		this.set(x, y, width, height);
	}
	
    /**
     * @js NA
     */
	public boolean containsPoint(Vector2 point) {
		return contains(point);
	}
    /**
     * @js NA
     */
	public boolean intersectsRect(final Rect rect) {
		return contains(rect);
	}
    /**
     * @js NA
     * @lua NA
     */
	public Rect unionWithRect(final Rect rect) {
		Rectangle ret = merge(rect);
		if(ret instanceof Rect) {
			return (Rect) ret;
		} else {
			return new Rect(rect);
		}
	}
    
    static final Rect ZERO = new Rect();
}